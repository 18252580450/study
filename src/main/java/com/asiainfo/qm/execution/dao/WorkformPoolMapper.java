package com.asiainfo.qm.execution.dao;

import com.asiainfo.qm.execution.domain.WorkformPool;
import com.asiainfo.qm.execution.domain.WorkformPoolExample;
import com.asiainfo.qm.execution.domain.WorkformPoolKey;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface WorkformPoolMapper {
    int countByExample(WorkformPoolExample example);

    int deleteByExample(WorkformPoolExample example);

    int deleteByPrimaryKey(WorkformPoolKey key);

    int insert(WorkformPool record);

    int insertSelective(WorkformPool record);

    List<WorkformPool> selectByExample(WorkformPoolExample example);

    WorkformPool selectByPrimaryKey(WorkformPoolKey key);

    int updateByExampleSelective(@Param("record") WorkformPool record, @Param("example") WorkformPoolExample example);

    int updateByExample(@Param("record") WorkformPool record, @Param("example") WorkformPoolExample example);

    int updateByPrimaryKeySelective(WorkformPool record);

    int updateByPrimaryKey(WorkformPool record);

    int update(List<String> list);//新增
    int updateCheck(List<Map> list);

    int updateByWorkFormId(WorkformPool record);  //根据工单流水号更新质检状态
}