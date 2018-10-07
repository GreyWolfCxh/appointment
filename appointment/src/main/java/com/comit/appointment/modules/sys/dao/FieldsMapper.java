package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Fields;

public interface FieldsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Fields record);

    int insertSelective(Fields record);

    Fields selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Fields record);

    int updateByPrimaryKey(Fields record);
}