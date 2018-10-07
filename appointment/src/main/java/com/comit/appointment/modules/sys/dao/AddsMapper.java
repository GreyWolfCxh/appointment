package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Adds;

public interface AddsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Adds record);

    int insertSelective(Adds record);

    Adds selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Adds record);

    int updateByPrimaryKey(Adds record);
}