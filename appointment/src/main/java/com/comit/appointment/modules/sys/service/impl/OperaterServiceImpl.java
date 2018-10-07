package com.comit.appointment.modules.sys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.appointment.modules.sys.dao.OperatersMapper;
import com.comit.appointment.modules.sys.entity.Operaters;
import com.comit.appointment.modules.sys.service.IOperaterService;

@Service("OperaterServiceImpl")
public class OperaterServiceImpl implements IOperaterService {
	
	@Autowired
	private OperatersMapper operatersMapper;

	@Override
	public List<Operaters> selectPageByDay(String day,String period) {
		Map map=new HashMap(16);
		map.put("day", day);
		map.put("period", period);
		return operatersMapper.selectPageByDay(map);
	}

	@Override
	public Operaters selectNumberByDay(String day) {
		return operatersMapper.selectNumberByDay(day);
	}

}
