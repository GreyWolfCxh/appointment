package com.comit.appointment.modules.sys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;

import com.comit.appointment.modules.sys.entity.Users;

public interface IBaseController {
	
	/**
	 * 登录
	 * @return
	 */
	public String login(HttpSession session,Users user);
	
	/**
	 * 注销
	 * @param session
	 * @return
	 */
	public String logout(HttpSession session);
	
	/**
	 * 通用文件路径
	 * @param folder 父目录
	 * @param cfolder 子目录
	 * @param file 文件
	 * @return
	 */
	public String urlPath(@PathVariable("pfolder") String pfolder,@PathVariable("cfolder") String cfolder,@PathVariable("file") String file);

}
