package com.comit.appointment.modules.sys.controller.impl;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.appointment.modules.sys.controller.IBaseController;
import com.comit.appointment.modules.sys.entity.Users;
import com.comit.appointment.modules.sys.service.IOperaterService;
import com.comit.appointment.modules.sys.service.IUsersService;
import com.comit.appointment.modules.test.cs.MessageProducer2;

@Controller
@RequestMapping("/base")
public class BaseController implements IBaseController {
	
	@Autowired
	private IUsersService usersService;
	
	@Qualifier(value="MessageProducer2")
	@Autowired
	private MessageProducer2 messageProducer;

	@RequestMapping("/")
	public String login() {
		return "modules/sys/login";
	}
	
	@Override
	@RequestMapping("/login")
	public String login(HttpSession session,Users user) {
		Users user1=usersService.findUser(user);
		if(user1!=null) {
			try {
				messageProducer.sendMessage(user1.getACCOUNT()+","+new Date()+",登录了");
			} catch (IOException e) {
				e.printStackTrace();
			}
			session.setAttribute("user", user1);
			return "modules/sys/index";
		}
		return "modules/sys/login";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "modules/sys/login";
	}

	@Override
	@RequestMapping("/goPath/{pfolder}/{cfolder}/{file}")
	public String urlPath(@PathVariable("pfolder")String pfolder,@PathVariable("cfolder") String cfolder, @PathVariable("file")String file) {
		return pfolder+"/"+cfolder+"/"+file;
	}

}
