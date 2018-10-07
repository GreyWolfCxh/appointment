package com.comit.appointment.modules.sys.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.comit.appointment.modules.sys.entity.Illegals;
import com.comit.appointment.modules.sys.entity.Page;

public interface IIllegalService {
	
	/**
	 * 增加违章类型
	 * @param basePath
	 * @param illegal
	 * @param files
	 * @param fileds
	 * @param addFields
	 * @param addDatas
	 * @return
	 */
	public Integer addIllegalType(String basePath, Illegals illegal, MultipartFile[] files, String[] fileds, String[] addFields, String[] addDatas);

	public List<Illegals> selectPage(Page page);

	public int selectPageCount(Page page);

}
