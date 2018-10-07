package com.comit.appointment.modules.sys.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comit.appointment.modules.sys.controller.IRecordController;
import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.entity.Records;
import com.comit.appointment.modules.sys.service.IRecordService;

@Controller
@RequestMapping("/record")
public class RecordController implements IRecordController {
	
	@Autowired
	private IRecordService recordService;

	@Override
	@RequestMapping("/toAppointmentRecord")
	public String toAppointmentRecord(ModelMap map,Page page, Records record) {
		List<Records>list=recordService.selectPage(page,record);
		for(Records rs:list) {
			System.out.println("rs-->"+rs.toString());
		}
		int total=recordService.selectPageCount(page,record);
		map.put("total", total);
		map.put("rows", list);
		map.put("resultSet", list);
		return "modules/sys/appointmentRecord";
	}

}
