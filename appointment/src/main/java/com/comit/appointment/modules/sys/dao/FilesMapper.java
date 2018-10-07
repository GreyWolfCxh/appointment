package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Files;

public interface FilesMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Files record);

    int insertSelective(Files record);

    Files selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Files record);

    int updateByPrimaryKey(Files record);
}