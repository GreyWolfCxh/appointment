package com.comit.appointment.modules.sys.service;

import java.util.Date;

import com.comit.appointment.modules.sys.entity.Modules;

public interface IReleaseNumberServer {
	
	/**
	 * 批量放号
	 * @param module 时间段模板
	 * @param listDate 日期
	 * @return
	 */
	Integer batchReleaseNumber(Modules module, Date[] listDate);

}
