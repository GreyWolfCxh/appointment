package com.comit.appointment.modules.sys.dao;

import java.util.List;

import com.comit.appointment.modules.sys.entity.Modules;

public interface ModulesMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Modules record);

    int insertSelective(Modules record);

    Modules selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Modules record);

    int updateByPrimaryKey(Modules record);
    
    //根据版本号获取版本信息
	List<Modules> findModuleByVersion(Modules module);
}