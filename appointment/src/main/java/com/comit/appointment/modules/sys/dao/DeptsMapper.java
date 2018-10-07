package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Depts;

public interface DeptsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Depts record);

    int insertSelective(Depts record);

    Depts selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Depts record);

    int updateByPrimaryKey(Depts record);
}