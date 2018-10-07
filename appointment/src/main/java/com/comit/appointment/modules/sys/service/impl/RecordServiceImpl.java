package com.comit.appointment.modules.sys.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.appointment.modules.sys.dao.RecordsMapper;
import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.entity.Records;
import com.comit.appointment.modules.sys.service.IRecordService;

@Service("RecordServiceImpl")
public class RecordServiceImpl implements IRecordService {
	
	@Autowired
	private RecordsMapper recordsMapper;

	@Override
	public List<Records> selectPage(Page page, Records record) {
		if(StringUtils.isNotBlank(record.getAPPOINTMENT_CODE())) {
			page.getParams().put("APPOINTMENT_CODE", record.getAPPOINTMENT_CODE());
		}
		if(StringUtils.isNotBlank(record.getUSER_NAME())) {
			page.getParams().put("USER_NAME", record.getUSER_NAME());
		}
		if(StringUtils.isNotBlank(record.getUSER_PHONE())) {
			page.getParams().put("USER_PHONE", record.getUSER_PHONE());
		}
		if(StringUtils.isNotBlank(record.getCAR_NUMBER())) {
			page.getParams().put("CAR_NUMBER", record.getCAR_NUMBER());
		}
		return recordsMapper.selectPage(page);
	}

	@Override
	public int selectPageCount(Page page, Records record) {
		if(StringUtils.isNotBlank(record.getAPPOINTMENT_CODE())) {
			page.getParams().put("APPOINTMENT_CODE", record.getAPPOINTMENT_CODE());
		}
		if(StringUtils.isNotBlank(record.getUSER_NAME())) {
			page.getParams().put("USER_NAME", record.getUSER_NAME());
		}
		if(StringUtils.isNotBlank(record.getUSER_PHONE())) {
			page.getParams().put("USER_PHONE", record.getUSER_PHONE());
		}
		if(StringUtils.isNotBlank(record.getCAR_NUMBER())) {
			page.getParams().put("CAR_NUMBER", record.getCAR_NUMBER());
		}
		return recordsMapper.selectPageCount(page);
	}

}
