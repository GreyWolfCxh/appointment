package com.comit.appointment.modules.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.appointment.modules.sys.dao.UsersMapper;
import com.comit.appointment.modules.sys.entity.Users;
import com.comit.appointment.modules.sys.service.IUsersService;

@Service("usersServiceImpl")
public class UsersServiceImpl implements IUsersService {
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public Users findUser(Users user) {
		return usersMapper.findUser(user);
	}

}
