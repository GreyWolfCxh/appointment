package com.comit.appointment.modules.sys.controller;

import org.springframework.ui.ModelMap;

import com.comit.appointment.modules.sys.entity.Page;

public interface IOperaterController {
	
	/**
	 * 跳到工作台页面
	 * @param modelMap
	 * @return
	 */
	public String toWork(ModelMap modelMap,Page page);

}
