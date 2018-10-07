package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Logs;

public interface LogsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Logs record);

    int insertSelective(Logs record);

    Logs selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Logs record);

    int updateByPrimaryKey(Logs record);
}