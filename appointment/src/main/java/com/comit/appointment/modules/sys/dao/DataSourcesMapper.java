package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.DataSources;

public interface DataSourcesMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(DataSources record);

    int insertSelective(DataSources record);

    DataSources selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(DataSources record);

    int updateByPrimaryKey(DataSources record);
}