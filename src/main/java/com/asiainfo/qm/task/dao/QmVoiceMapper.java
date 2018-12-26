package com.asiainfo.qm.task.dao;

import com.asiainfo.qm.task.domain.QmVoice;
import com.asiainfo.qm.task.domain.QmVoiceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QmVoiceMapper {
    int countByExample(QmVoiceExample example);

    int deleteByExample(QmVoiceExample example);

    int deleteByPrimaryKey(String touchId);

    int insert(QmVoice record);

    int insertSelective(QmVoice record);

    List<QmVoice> selectByExample(QmVoiceExample example);

    List<QmVoice> selectByExampleForAutoExract(@Param("tableName")String tableName,QmVoiceExample example,@Param("limit")String limit);

    QmVoice selectByPrimaryKey(String touchId);

    int updateByExampleSelective(@Param("record") QmVoice record, @Param("example") QmVoiceExample example);

    int updateByExample(@Param("record") QmVoice record, @Param("example") QmVoiceExample example);

    int updateByPrimaryKeySelective(QmVoice record);

    int updateByPrimaryKey(QmVoice record);
}