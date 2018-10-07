package com.comit.appointment.modules.sys.controller.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.appointment.modules.sys.controller.IReleaseController;
import com.comit.appointment.modules.sys.entity.Modules;
import com.comit.appointment.modules.sys.service.IReleaseNumberServer;

@Controller
@RequestMapping("/release")
public class ReleaseController implements IReleaseController {
	
	@Autowired
	private IReleaseNumberServer releaseNumberServer;
	
	

	@Override
	@RequestMapping("/batchReleaseNumber")
	public String batchReleaseNumber(Modules module, Date[] listDate) {
		System.out.println("controller-->"+module.toString());
		 releaseNumberServer.batchReleaseNumber(module,listDate);
		 return "modules/release/releaseNumber";
	}

}
