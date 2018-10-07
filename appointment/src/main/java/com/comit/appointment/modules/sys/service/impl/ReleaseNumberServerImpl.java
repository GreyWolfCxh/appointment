package com.comit.appointment.modules.sys.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comit.appointment.modules.sys.dao.ModulesMapper;
import com.comit.appointment.modules.sys.dao.OperatersMapper;
import com.comit.appointment.modules.sys.entity.Modules;
import com.comit.appointment.modules.sys.entity.Operaters;
import com.comit.appointment.modules.sys.service.IReleaseNumberServer;

@Service("ReleaseNumberServerImpl")
public class ReleaseNumberServerImpl implements IReleaseNumberServer {
	
	@Autowired
	private OperatersMapper operatersMapper;
	@Autowired
	private ModulesMapper modulesMapper;

	@Override
	@Transactional
	public Integer batchReleaseNumber(Modules module, Date[] listDate) {
		System.out.println("module-->"+module.toString());
		List<Modules>modules=modulesMapper.findModuleByVersion(module);
		Operaters operater=null;
		for(Date date:listDate) {
			System.out.println("date-->"+date);
			for(Modules ms:modules) {
				System.out.println("ms-->"+ms.toString());
				operater=new Operaters();
				//预约号数
				operater.setAPPOINTMENT_NUMBER(ms.getAPPOINTMENT_NUMBER());
				//可操作预约号数
				operater.setOPERATION_NUMBER(ms.getAPPOINTMENT_NUMBER());
				//预约时间
				operater.setDAY(date);
				//预约时间段
				operater.setTIME(ms.getTIME());
				//预约时间段
				operater.setVALID_TIME(ms.getVALID_TIME());
				//预约模板编号
				operater.setMODULE_ID(ms.getID());
				operatersMapper.insertSelective(operater);
			}
		}
		return 1;
	}

}
