package com.asiainfo.qm.manage.web;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.qm.manage.common.sequence.SequenceUtils;
import com.asiainfo.qm.manage.service.CheckItemService;
import com.asiainfo.qm.manage.util.WebUtil;
import com.asiainfo.qm.manage.vo.CheckItemResponse;
import com.asiainfo.qm.manage.vo.CheckItemServiceResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @ Author     ：dingzc.
 * @ Date       ：Created in 10:18 2018/11/2
 * @ Description：${description}
 */
@RestController
@RequestMapping("/qm/configservice/checkItem/")
public class CheckItemController {
    // 创建Logger实例
    private static Logger logger = LoggerFactory.getLogger(CheckItemController.class);

    @Autowired
    private CheckItemService checkItemService;
    @Autowired
    private SequenceUtils sequenceUtils;

    @ApiOperation(value = "前端调用接口查询考评项", notes = "qm_configservice查询考评项", response = CheckItemServiceResponse.class)
    @ApiResponses(value = { @ApiResponse(code = 401, message = "服务器认证失败"),
            @ApiResponse(code = 403, message = "资源不存在"),
            @ApiResponse(code = 404, message = "传入的参数无效"),
            @ApiResponse(code = 500, message = "服务器出现异常错误") })
    @HystrixCommand(groupKey = "qm_configservice ", commandKey = "queryCheckItem", threadPoolKey = "queryCheckItemThread", fallbackMethod = "fallbackQueryCheckItem",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
            @HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "2000") }, threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "200") })
    @RequestMapping(value = "/queryCheckItem", method = RequestMethod.GET)
    public CheckItemServiceResponse queryCheckItem(@RequestParam(name = "params")String params, @RequestParam(name = "start") int start, @RequestParam(name = "pageNum") int limit) throws Exception {
        CheckItemResponse checkItemResponse = new CheckItemResponse();
        CheckItemServiceResponse checkItemServiceResponse = new CheckItemServiceResponse();
        Map reqParams = JSONObject.parseObject(params);
        try {
            checkItemResponse = checkItemService.queryCheckItem(reqParams,start,limit);
        }catch (Exception e){
            logger.error("数据查询异常");
            checkItemResponse.setRspcode(WebUtil.EXCEPTION);
            checkItemResponse.setRspdesc("数据查询异常!");
        }
        checkItemServiceResponse.setResponse(checkItemResponse);
        return checkItemServiceResponse;
    }

    public CheckItemServiceResponse fallbackQueryCheckItem(@RequestParam(name = "params")String params,@RequestParam(name = "start") int start, @RequestParam(name = "pageNum") int limit) throws Exception {
        logger.info("数据查询出错啦！");
        logger.error("");
        CheckItemServiceResponse checkItemServiceResponse = new CheckItemServiceResponse();
        return checkItemServiceResponse;
    }
}
