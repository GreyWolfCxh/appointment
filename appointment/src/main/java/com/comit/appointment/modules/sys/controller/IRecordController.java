package com.comit.appointment.modules.sys.controller;

import org.springframework.ui.ModelMap;

import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.entity.Records;

public interface IRecordController {
	
	/**
	 * 跳到预约记录页面
	 * @param page
	 * @param record
	 * @return
	 */
	public String toAppointmentRecord(ModelMap map,Page page,Records record);

}
