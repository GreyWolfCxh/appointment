package com.comit.appointment.modules.sys.controller;

import java.util.Date;
import java.util.List;

import com.comit.appointment.modules.sys.entity.Modules;

/**
 * 放号管理接口
 * @author ASUS
 *
 */
public interface IReleaseController {
	
	/**
	 * 批量放号
	 * @param module 时间段模板
	 * @param listDate 日期
	 * @return
	 */
	String batchReleaseNumber(Modules module,Date[] listDate);

}
