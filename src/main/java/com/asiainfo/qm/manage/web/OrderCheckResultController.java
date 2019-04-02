package com.asiainfo.qm.manage.web;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.qm.execution.vo.OrderCheckResultResponse;
import com.asiainfo.qm.execution.vo.OrderCheckResultServiceResponse;
import com.asiainfo.qm.manage.common.sequence.SequenceUtils;
import com.asiainfo.qm.manage.domain.OrderCheckResult;
import com.asiainfo.qm.manage.service.OrderCheckResultService;
import com.asiainfo.qm.manage.util.ExcelUtil;
import com.asiainfo.qm.manage.util.WebUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/qm/configservice/workQmResult/")
public class OrderCheckResultController {

	// 创建Logger实例
	private static Logger logger = LoggerFactory.getLogger(OrderCheckResultController.class);

	@Autowired
	private OrderCheckResultService orderCheckResultService;
	@Autowired
	private SequenceUtils sequenceUtils;


	// 查询工单质检结果信息
	@ApiOperation(value = "前端调用接口查询质检池详细信息", notes = "qm_configservice查询质检池详细信息", response = OrderCheckResultServiceResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 401, message = "服务器认证失败"),
			@ApiResponse(code = 403, message = "资源不存在"),
			@ApiResponse(code = 404, message = "传入的参数无效"),
			@ApiResponse(code = 500, message = "服务器出现异常错误") })
	@HystrixCommand(groupKey = "qm_configservice ", commandKey = "selectByParams", threadPoolKey = "selectByParamsThread", fallbackMethod = "fallbackSelectByParams",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
			@HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "2000") }, threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "200") })
	@RequestMapping(value = "/selectByParams", method = RequestMethod.GET)
	public OrderCheckResultServiceResponse selectByParams(@RequestParam(name = "params")String params, @RequestParam(name = "start") int start, @RequestParam(name = "pageNum") int limit) throws Exception {
		OrderCheckResultResponse orderCheckResultResponse = new OrderCheckResultResponse();
		OrderCheckResultServiceResponse orderCheckResultServiceResponse = new OrderCheckResultServiceResponse();
		Map reqParams = JSONObject.parseObject(params);
		try {
			orderCheckResultResponse = orderCheckResultService.selectByParams(reqParams,start,limit);//查询方法
		}catch (Exception e){
			logger.error("数据查询异常");
			orderCheckResultResponse.setRspcode(WebUtil.EXCEPTION);
			orderCheckResultResponse.setRspdesc("数据查询异常!");
		}
		orderCheckResultServiceResponse.setResponse(orderCheckResultResponse);
		return orderCheckResultServiceResponse;
	}

	public OrderCheckResultServiceResponse fallbackSelectByParams(@RequestParam(name = "params")String params, @RequestParam(name = "start") int start, @RequestParam(name = "pageNum") int limit) throws Exception {
		logger.info("数据查询出错啦！");
		logger.error("");
		OrderCheckResultServiceResponse orderCheckResultServiceResponse = new OrderCheckResultServiceResponse();
		return orderCheckResultServiceResponse;
	}

	@ResponseBody
	@RequestMapping(value="/export", method=RequestMethod.GET)
	public void export(HttpServletResponse response, String params) throws Exception {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String formatTime = sdf.format(d);

		String str= URLDecoder.decode(params, "UTF-8");
		Map paramsMap = net.sf.json.JSONObject.fromObject(str);//转成Map
		int start = (int) paramsMap.get("start");
		int limit = (int) paramsMap.get("pageNum");
		String param = (String) paramsMap.get("params");
		Map reqParams = net.sf.json.JSONObject.fromObject(param);//转成Map
		String fields = (String) paramsMap.get("fields");
		JSONArray fieldsList = JSONArray.fromObject(fields);//转list
		String titles = (String) paramsMap.get("titles");
		JSONArray titlesList = JSONArray.fromObject(titles);//转list

		OrderCheckResultResponse orderCheckResultResponse = orderCheckResultService.selectByParams(reqParams,start,limit);//查询方法
		List<OrderCheckResult> list = orderCheckResultResponse.getData();
		List<Map<String,Object>> listMap = new ArrayList<>();
		Map<String, Object> m= new HashMap<String, Object>();
		m.put("sheetName", "sheet1");
		listMap.add(m);
		if (list != null && list.size() > 0) {
			Map<String, Object> map = null;
			OrderCheckResult orderCheckResult = null;
			for (int i = 0,size = list.size(); i < size; i++) {
				orderCheckResult = list.get(i);
				if(orderCheckResult.getQmPlan()!=null){
					orderCheckResult.setPlanName(orderCheckResult.getQmPlan().getPlanName());
				}
				map = net.sf.json.JSONObject.fromObject(orderCheckResult);//实体类转换成Map类型
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date checkEndTime= orderCheckResult.getCheckEndTime();
				if(checkEndTime!=null){
					map.put("checkEndTime",sdf2.format(checkEndTime));//转换时间格式
				}else{
					map.put("checkEndTime","");
				}
				listMap.add(map);
			}
		}
		String fileName="工单质检结果详情表-"+formatTime;//文件名称
		//List转String数组
		String[] columnNames= (String[]) titlesList.toArray(new String[titlesList.size()]);//中文列名
		String[] keys= (String[]) fieldsList.toArray(new String[fieldsList.size()]);//英文列名
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			ExcelUtil.createWorkBook(listMap,keys,columnNames).write(os);//创建excel文档
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] content = os.toByteArray();
		InputStream is = new ByteArrayInputStream(content);
		// 设置response参数，可以打开下载页面
		response.reset();
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		response.setHeader("Content-Disposition", "attachment;filename="+ new String((fileName + ".xls").getBytes(), "iso-8859-1"));
		ServletOutputStream out = response.getOutputStream();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(out);
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (final IOException e) {
			throw e;
		} finally {
			if (bis != null)
				bis.close();
			if (bos != null)
				bos.close();
		}
	}
}
