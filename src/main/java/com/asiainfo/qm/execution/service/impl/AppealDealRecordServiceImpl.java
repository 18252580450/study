package com.asiainfo.qm.execution.service.impl;

import com.asiainfo.qm.execution.dao.AppealDealRecordMapper;
import com.asiainfo.qm.execution.domain.AppealDealRecordExample;
import com.asiainfo.qm.execution.domain.AppealDealRecord;
import com.asiainfo.qm.execution.service.AppealDealRecordService;
import com.asiainfo.qm.execution.vo.AppealDealRecordResponse;
import com.asiainfo.qm.manage.util.WebUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ Author     ：dingzc.
 * @ Date       ：Created in 2018-12-21 14:24
 * @ Description：${description}
 */
@Service
public class AppealDealRecordServiceImpl implements AppealDealRecordService {

    private static Logger logger = LoggerFactory.getLogger(AppealDealRecordServiceImpl.class);

    @Autowired
    private AppealDealRecordMapper appealDealRecordMapper;

    @Override
    public AppealDealRecordResponse queryAppealRecord(Map params, int start, int limit) throws Exception {
        AppealDealRecordResponse appealDealRecordResponse = null;
        AppealDealRecordExample example = new AppealDealRecordExample();
        try {
            AppealDealRecordExample.Criteria criteria = example.createCriteria();
            if (null != params.get("appealId") && !"".equals(params.get("appealId"))) {
                criteria.andAppealIdEqualTo((String) params.get("appealId"));
            }
            List<AppealDealRecord> list = appealDealRecordMapper.selectByExample(example);
            if (0 != limit) {
                PageHelper.offsetPage(start, limit);
                Page<AppealDealRecord> pagelist = (Page) list;
                appealDealRecordResponse = new AppealDealRecordResponse(pagelist);
            } else {
                appealDealRecordResponse = new AppealDealRecordResponse();
                appealDealRecordResponse.setData(list);
            }

            if (null != appealDealRecordResponse.getData() && appealDealRecordResponse.getData().size() > 0) {
                appealDealRecordResponse.setRspcode(WebUtil.SUCCESS);
                appealDealRecordResponse.setRspdesc("查询成功");
            } else {
                appealDealRecordResponse.setRspcode(WebUtil.FAIL);
                appealDealRecordResponse.setRspdesc("无数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("审批记录查询异常", e);
            appealDealRecordResponse.setRspcode(WebUtil.EXCEPTION);
            appealDealRecordResponse.setRspdesc("审批记录查询异常");
        }
        return appealDealRecordResponse;
    }

    @Override
    public AppealDealRecordResponse createAppealRecord(AppealDealRecord appealDealRecord) throws Exception {
        AppealDealRecordResponse appealDealRecordResponse = new AppealDealRecordResponse();
        try {
            int result = appealDealRecordMapper.insertSelective(appealDealRecord);
            if (result > 0) {
                appealDealRecordResponse.setRspcode(WebUtil.SUCCESS);
                appealDealRecordResponse.setRspdesc("审批记录新增成功");
            } else {
                appealDealRecordResponse.setRspcode(WebUtil.FAIL);
                appealDealRecordResponse.setRspdesc("审批记录新增失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("审批记录新增异常", e);
            appealDealRecordResponse.setRspcode(WebUtil.EXCEPTION);
            appealDealRecordResponse.setRspdesc("审批记录新增异常");
        }
        return appealDealRecordResponse;
    }

    @Override
    public AppealDealRecordResponse updateAppealRecord(AppealDealRecord appealDeal) throws Exception {
        return null;
    }

    @Override
    public AppealDealRecordResponse deleteAppealRecord(List<String> idList) throws Exception {
        return null;
    }
}
