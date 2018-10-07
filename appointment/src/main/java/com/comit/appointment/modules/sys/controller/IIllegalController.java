package com.comit.appointment.modules.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.comit.appointment.modules.sys.entity.Illegals;

public interface IIllegalController {
	
	/**
	 * 增加违章类型
	 * @return
	 */
	public String addIllegalType(Illegals illegal, @RequestParam("fileAttach") MultipartFile[] files, @RequestParam("zfiled")String[] fileds, 
			@RequestParam("addData") String[] addDatas, @RequestParam("addField")String[] addFields, HttpServletRequest request
			);

}
