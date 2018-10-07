package com.comit.appointment.modules.sys.service;

import java.util.List;

import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.entity.Records;

public interface IRecordService {

	List<Records> selectPage(Page page, Records record);

	int selectPageCount(Page page, Records record);

}
