package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Areas;

public interface AreasMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Areas record);

    int insertSelective(Areas record);

    Areas selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Areas record);

    int updateByPrimaryKey(Areas record);
}