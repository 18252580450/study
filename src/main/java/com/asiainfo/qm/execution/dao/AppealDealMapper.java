package com.asiainfo.qm.execution.dao;

import com.asiainfo.qm.execution.domain.AppealDeal;
import com.asiainfo.qm.execution.domain.AppealDealExample;
import java.util.List;

import com.asiainfo.qm.execution.domain.UnionAppealDeal;
import org.apache.ibatis.annotations.Param;

public interface AppealDealMapper {
    int countByExample(AppealDealExample example);

    int deleteByExample(AppealDealExample example);

    int deleteByPrimaryKey(String appealId);

    int insert(AppealDeal record);

    int insertSelective(AppealDeal record);

    List<AppealDeal> selectByExample(AppealDealExample example);

    List<UnionAppealDeal> unionSelectByExample(AppealDealExample example);  //和AppealNodeInfo联表查询

    AppealDeal selectByPrimaryKey(String appealId);

    int updateByExampleSelective(@Param("record") AppealDeal record, @Param("example") AppealDealExample example);

    int updateByExample(@Param("record") AppealDeal record, @Param("example") AppealDealExample example);

    int updateByPrimaryKeySelective(AppealDeal record);

    int updateByPrimaryKey(AppealDeal record);
}