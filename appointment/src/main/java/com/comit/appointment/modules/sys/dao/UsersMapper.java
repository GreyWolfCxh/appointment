package com.comit.appointment.modules.sys.dao;

import com.comit.appointment.modules.sys.entity.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    //查找用户
	Users findUser(Users user);
}