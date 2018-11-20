package com.asiainfo.qm.manage.service.impl;

import com.asiainfo.qm.manage.common.sequence.SequenceUtils;
import com.asiainfo.qm.manage.dao.AppealProcessMapper;
import com.asiainfo.qm.manage.domain.AppealNode;
import com.asiainfo.qm.manage.domain.AppealProcess;
import com.asiainfo.qm.manage.domain.AppealProcessExample;
import com.asiainfo.qm.manage.service.AppealNodeService;
import com.asiainfo.qm.manage.service.AppealProcessService;
import com.asiainfo.qm.manage.util.WebUtil;
import com.asiainfo.qm.manage.vo.AppealNodeResponse;
import com.asiainfo.qm.manage.vo.AppealProcessResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ Author     ：dingzc.
 * @ Date       ：Created in 15:07 2018/11/8
 * @ Description：${description}
 */
@Service
public class AppealProcessServiceImpl implements AppealProcessService {

    private static Logger logger = LoggerFactory.getLogger(AppealProcessServiceImpl.class);

    @Autowired
    private AppealProcessMapper appealProcessMapper;

    @Autowired
    private AppealNodeService appealNodeService;

    @Autowired
    private SequenceUtils sequenceUtils;

    @Override
    public AppealProcessResponse queryAppealProcess(Map params, int start, int limit) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        AppealProcessResponse appealProcessResponse = null;
        AppealProcessExample example = new AppealProcessExample();
        try {
            AppealProcessExample.Criteria criteria = example.createCriteria();
            if (null != params.get("processId") && !"".equals(params.get("processId"))) {
                criteria.andProcessIdEqualTo((String) params.get("processId"));
            }
            if (null != params.get("processName") && !"".equals(params.get("processName"))) {
                criteria.andProcessNameLike("%" + (String) params.get("processName") + "%");
            }
            if (null != params.get("createStaffId") && !"".equals(params.get("createStaffId"))) {
                criteria.andCreateStaffIdEqualTo((String) params.get("createStaffId"));
            }
            if (null != params.get("tenantId") && !"".equals(params.get("tenantId"))) {
                criteria.andTenantIdEqualTo((String) params.get("tenantId"));
            }
            if (null != params.get("processStatus") && !"".equals(params.get("processStatus"))) {
                criteria.andProcessStatusEqualTo((String) params.get("processStatus"));
            }
            if (null != params.get("createTimeBegin") && !"".equals(params.get("createTimeBegin")) && null != params.get("createTimeEnd") && !"".equals(params.get("createTimeEnd"))) {
                criteria.andCreateTimeBetween(sdf.parse((String) params.get("createTimeBegin")), sdf.parse((String) params.get("createTimeEnd")));
            }
            //只显示主流程
            criteria.andMainProcessFlagEqualTo("0");
            PageHelper.offsetPage(start, limit);
            List<AppealProcess> list = appealProcessMapper.selectByExample(example);
            Page<AppealProcess> pagelist = (Page) list;
            appealProcessResponse = new AppealProcessResponse(pagelist);

            if (null != appealProcessResponse.getData() && appealProcessResponse.getData().size() > 0) {
                appealProcessResponse.setRspcode(WebUtil.SUCCESS);
                appealProcessResponse.setRspdesc("查询成功");
            } else {
                appealProcessResponse.setRspcode(WebUtil.FAIL);
                appealProcessResponse.setRspdesc("无数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("申诉流程查询异常", e);
            appealProcessResponse.setRspcode(WebUtil.EXCEPTION);
            appealProcessResponse.setRspdesc("申诉流程查询异常");
        }
        return appealProcessResponse;
    }

    @Override
    public AppealProcessResponse createAppealProcess(List<AppealProcess> appealProcessList, List<AppealNode> appealNodeList) throws Exception {
        AppealProcessResponse appealProcessResponse = new AppealProcessResponse();
        try {
            int result = 0;
            for (AppealProcess appealProcess : appealProcessList
            ) {
                result = appealProcessMapper.insertSelective(appealProcess);
                if (result == 0) {
                    break;
                }
            }
            if (result > 0) {
                appealProcessResponse.setRspcode(WebUtil.SUCCESS);
                appealProcessResponse.setRspdesc("新增成功");
            } else {
                appealProcessResponse.setRspcode(WebUtil.FAIL);
                appealProcessResponse.setRspdesc("新增失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("申诉流程新增异常", e);
            appealProcessResponse.setRspcode(WebUtil.EXCEPTION);
            appealProcessResponse.setRspdesc("申诉流程新增异常");
        }
        return appealProcessResponse;
    }


    @Override
    public AppealProcessResponse updateAppealProcess(List<AppealProcess> appealProcesses, List<AppealNode> appealNodes) throws Exception {
        return null;
    }

    @Override
    public AppealProcessResponse deleteAppealProcess(List<String> processList) throws Exception {
        AppealProcessResponse appealProcessResponse = new AppealProcessResponse();
        try {
            AppealProcessExample mainProcessExample = new AppealProcessExample();
            AppealProcessExample.Criteria mainProcessCriteria = mainProcessExample.createCriteria();
            AppealProcessExample subProcessExample = new AppealProcessExample();
            AppealProcessExample.Criteria subProcessCriteria = subProcessExample.createCriteria();

            int result = 0;

            //查询子流程id
            subProcessCriteria.andParentProcessIdIn(processList);
            subProcessCriteria.andProcessIdNotIn(processList);   //排除主流程
            //子流程列表
            List<AppealProcess> subProcessList = appealProcessMapper.selectByExample(subProcessExample);
            List<String> nodeDelList = new ArrayList<>();
            for (AppealProcess subProcess : subProcessList
            ) {
                //判断该子流程有无子节点
                if (subProcess.getSubNodeNum() != 0) {
                    nodeDelList.add(subProcess.getProcessId());
                }
            }
            //删除子节点
            AppealNodeResponse appealNodeResponse = new AppealNodeResponse();
            if (!nodeDelList.isEmpty()) {
                appealNodeResponse = appealNodeService.deleteAppealNode(nodeDelList);
            }

            //子节点删除成功后再删除子流程（或无子节点）
            if (nodeDelList.isEmpty() || appealNodeResponse.getRspcode().equals("1")) {
                //删除子流程（存在子流程）
                if (!subProcessList.isEmpty()) {
                    result = appealProcessMapper.deleteByExample(subProcessExample);
                    if (result > 0) {
                        //删除主流程
                        mainProcessCriteria.andProcessIdIn(processList);
                        result = appealProcessMapper.deleteByExample(mainProcessExample);
                    }
                } else {  //不存在子流程
                    //删除主流程
                    mainProcessCriteria.andProcessIdIn(processList);
                    result = appealProcessMapper.deleteByExample(mainProcessExample);
                }
            }
            if (result > 0) {
                appealProcessResponse.setRspcode(WebUtil.SUCCESS);
                appealProcessResponse.setRspdesc("删除成功");
            } else {
                appealProcessResponse.setRspcode(WebUtil.FAIL);
                appealProcessResponse.setRspdesc("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("主流程删除异常", e);
            appealProcessResponse.setRspcode(WebUtil.EXCEPTION);
            appealProcessResponse.setRspdesc("主流程删除异常");
        }
        return appealProcessResponse;
    }
}
