package com.comit.appointment.modules.sys.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comit.appointment.modules.sys.controller.IOperaterController;
import com.comit.appointment.modules.sys.entity.Operaters;
import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.service.IOperaterService;
import com.comit.appointment.modules.test.MessageProducer;

@Controller
@RequestMapping("/work")
public class OperaterController implements IOperaterController {
	
	private Logger logger = LoggerFactory.getLogger(OperaterController.class);  

	@Autowired
	private IOperaterService operaterService;
	
	@Override
	@RequestMapping("/toWork")
	public String toWork(ModelMap modelMap,Page page) {
		List<Operaters>list=operaterService.selectPageByDay("2018-10-06","am");
		List<Operaters>list2=operaterService.selectPageByDay("2018-10-06","pm");
		for(Operaters os:list) {
			System.out.println("os-->"+os.toString());
		}
		modelMap.put("resultSet", list);
		modelMap.put("resultSet2", list2);
		return "modules/sys/work";
	}
	
	@RequestMapping("/toCalendar")
	@ResponseBody
	public Operaters toCalendar() {
		Operaters os=operaterService.selectNumberByDay("2018-10-06");
		System.out.println("os-->"+os.toString());
		 logger.info("to send message:{}", os.toString());  
		return os;
	}

}
