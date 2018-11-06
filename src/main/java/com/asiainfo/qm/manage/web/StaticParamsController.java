package com.asiainfo.qm.manage.web;

import com.alibaba.fastjson.JSONObject;
import com.asiainfo.qm.manage.domain.StaticParams;
import com.asiainfo.qm.manage.service.StaticParamsService;
import com.asiainfo.qm.manage.util.WebUtil;
import com.asiainfo.qm.manage.vo.StaticParamsResponse;
import com.asiainfo.qm.manage.vo.StaticParamsServiceResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/qm/configservice/staticParams/")
public class StaticParamsController {

	// 创建Logger实例
	private static Logger logger = LoggerFactory.getLogger(StaticParamsController.class);

	@Autowired
	private StaticParamsService staticParamsService;

	@ApiOperation(value = "查询静态配置参数", notes = "qm_configservice查询静态配置参数", response = StaticParamsServiceResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 401, message = "服务器认证失败"),
			                @ApiResponse(code = 403, message = "资源不存在"),
			                @ApiResponse(code = 404, message = "传入的参数无效"),
			                @ApiResponse(code = 500, message = "服务器出现异常错误") })
	@HystrixCommand(groupKey = "qm_configservice ", commandKey = "selectByParams", threadPoolKey = "selectByParamsThread", fallbackMethod = "fallbackSelectByParams",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
			@HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "2000") }, threadPoolProperties = {
					@HystrixProperty(name = "coreSize", value = "200") })
	@RequestMapping(value = "/selectByParams", method = RequestMethod.GET)
	public StaticParamsServiceResponse selectByParams(@RequestParam(name = "params")String params,@RequestParam(name = "start") int start, @RequestParam(name = "pageNum") int limit) throws Exception {
		StaticParamsResponse staticParamsResponse = new StaticParamsResponse();
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		Map reqParams = JSONObject.parseObject(params);
		try {
			staticParamsResponse = staticParamsService.selectByParams(reqParams,start,limit);
		}catch (Exception e){
			logger.error("静态参数查询异常");
			staticParamsResponse.setRspcode(WebUtil.EXCEPTION);
			staticParamsResponse.setRspdesc("静态参数查询异常!");
		}
		staticParamsServiceResponse.setResponse(staticParamsResponse);
        return staticParamsServiceResponse;
	}

	public StaticParamsServiceResponse fallbackSelectByParams(@RequestParam(name = "params")String params,@RequestParam(name = "start") int start, @RequestParam(name = "pageNum") int limit) throws Exception {
		logger.info("静态参数查询出错啦！");
		logger.error("");
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		return staticParamsServiceResponse;
	}

	@ApiOperation(value = "删除静态配置参数", notes = "qm_configservice删除静态配置参数", response = StaticParamsServiceResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 401, message = "服务器认证失败"),
			@ApiResponse(code = 403, message = "资源不存在"),
			@ApiResponse(code = 404, message = "传入的参数无效"),
			@ApiResponse(code = 500, message = "服务器出现异常错误") })
	@HystrixCommand(groupKey = "qm_configservice", commandKey = "deleteByIds", threadPoolKey = "deleteByIdsThread",fallbackMethod = "fallbackDeleteByIds", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
			@HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "2000") }, threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "200") })
	@RequestMapping(value = "/{ids}", method = RequestMethod.DELETE)
	public StaticParamsServiceResponse deleteByIds(@PathVariable("ids")String ids) throws Exception {
		StaticParamsResponse staticParamsResponse = new StaticParamsResponse();
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		List<String> idList = Arrays.asList(ids.split(","));
		try {
			staticParamsResponse = staticParamsService.deleteByIds(idList);
		}catch (Exception e){
			e.printStackTrace();
			logger.error("静态参数删除异常");
			staticParamsResponse.setRspcode(WebUtil.EXCEPTION);
			staticParamsResponse.setRspdesc("静态参数删除异常!");
		}
		staticParamsServiceResponse.setResponse(staticParamsResponse);
		return staticParamsServiceResponse;
	}

	public StaticParamsServiceResponse fallbackDeleteByIds(@PathVariable("ids")String ids) throws Exception {
		logger.info("静态参数删除出错啦！");
		logger.error("");
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		return staticParamsServiceResponse;
	}

	@ApiOperation(value = "新增静态配置参数", notes = "qm_configservice新增静态配置参数", response = StaticParamsServiceResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 401, message = "服务器认证失败"),
			@ApiResponse(code = 403, message = "资源不存在"),
			@ApiResponse(code = 404, message = "传入的参数无效"),
			@ApiResponse(code = 500, message = "服务器出现异常错误") })
	@HystrixCommand(groupKey = "qm_configservice", commandKey = "addStaticParams", threadPoolKey = "addStaticParamsThread",fallbackMethod = "fallbackAddStaticParams", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
			@HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "2000") }, threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "200") })
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public StaticParamsServiceResponse addStaticParams(@RequestBody StaticParams staticParams) throws Exception {
		StaticParamsResponse staticParamsResponse = new StaticParamsResponse();
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		try {
			staticParamsResponse = staticParamsService.addStaticParams(staticParams);
		}catch (Exception e){
			e.printStackTrace();
			logger.error("新增静态参数异常");
			staticParamsResponse.setRspcode(WebUtil.EXCEPTION);
			staticParamsResponse.setRspdesc("新增静态参数异常!");
		}
		staticParamsServiceResponse.setResponse(staticParamsResponse);
		return staticParamsServiceResponse;
	}

	public StaticParamsServiceResponse fallbackAddStaticParams(@RequestBody StaticParams staticParams) throws Exception {
		logger.info("新增静态参数出错啦！");
		logger.error("");
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		return staticParamsServiceResponse;
	}

	@ApiOperation(value = "查询静态配置参数类型", notes = "qm_configservice查询静态配置参数类型", response = StaticParamsServiceResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 401, message = "服务器认证失败"),
			@ApiResponse(code = 403, message = "资源不存在"),
			@ApiResponse(code = 404, message = "传入的参数无效"),
			@ApiResponse(code = 500, message = "服务器出现异常错误") })
	@HystrixCommand(groupKey = "qm_configservice ", commandKey = "selectAllTypes", threadPoolKey = "selectAllTypesThread", fallbackMethod = "fallbackSelectAllTypes",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
			@HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "2000") }, threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "200") })
	@RequestMapping(value = "/selectAllTypes", method = RequestMethod.GET)
	public StaticParamsServiceResponse selectAllTypes(@RequestParam(name = "params")String params) throws Exception {
		StaticParamsResponse staticParamsResponse = new StaticParamsResponse();
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		Map reqParams = JSONObject.parseObject(params);
		try {
			staticParamsResponse = staticParamsService.selectAllTypes(reqParams);
		}catch (Exception e){
			logger.error("静态参数类型查询异常");
			staticParamsResponse.setRspcode(WebUtil.EXCEPTION);
			staticParamsResponse.setRspdesc("静态参数类型查询异常!");
		}
		staticParamsServiceResponse.setResponse(staticParamsResponse);
		return staticParamsServiceResponse;
	}

	public StaticParamsServiceResponse fallbackSelectAllTypes(@RequestParam(name = "params")String params) throws Exception {
		logger.info("静态参数类型查询出错啦！");
		logger.error("");
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		return staticParamsServiceResponse;
	}

	@ApiOperation(value = "更新静态配置参数", notes = "qm_configservice更新静态配置参数", response = StaticParamsServiceResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 401, message = "服务器认证失败"),
			@ApiResponse(code = 403, message = "资源不存在"),
			@ApiResponse(code = 404, message = "传入的参数无效"),
			@ApiResponse(code = 500, message = "服务器出现异常错误") })
	@HystrixCommand(groupKey = "qm_configservice", commandKey = "updateStaticParams", threadPoolKey = "updateStaticParamsThread",fallbackMethod = "fallbackUpdateStaticParams", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000"),
			@HystrixProperty(name = "fallback.isolation.semaphore.maxConcurrentRequests", value = "2000") }, threadPoolProperties = {
			@HystrixProperty(name = "coreSize", value = "200") })
	@RequestMapping(value = "/", method = RequestMethod.PUT, consumes = "application/json")
	public StaticParamsServiceResponse updateStaticParams(@RequestBody StaticParams staticParams) throws Exception {
		StaticParamsResponse staticParamsResponse = new StaticParamsResponse();
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		try {
			staticParamsResponse = staticParamsService.updateStaticParams(staticParams);
		}catch (Exception e){
			e.printStackTrace();
			logger.error("更新静态参数异常");
			staticParamsResponse.setRspcode(WebUtil.EXCEPTION);
			staticParamsResponse.setRspdesc("更新静态参数异常!");
		}
		staticParamsServiceResponse.setResponse(staticParamsResponse);
		return staticParamsServiceResponse;
	}

	public StaticParamsServiceResponse fallbackUpdateStaticParams(@RequestBody StaticParams staticParams) throws Exception {
		logger.info("更新静态参数出错啦！");
		logger.error("");
		StaticParamsServiceResponse staticParamsServiceResponse = new StaticParamsServiceResponse();
		return staticParamsServiceResponse;
	}
}
