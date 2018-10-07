package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Windows;

public interface WindowsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Windows record);

    int insertSelective(Windows record);

    Windows selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Windows record);

    int updateByPrimaryKey(Windows record);
}