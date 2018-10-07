package com.comit.appointment.modules.sys.service;

import com.comit.appointment.modules.sys.entity.Users;

public interface IUsersService {
	
	/**
	 * 查找用户
	 * @param user 账号和密码
	 * @return 
	 */
	Users findUser(Users user);

}
