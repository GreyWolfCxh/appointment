package com.comit.appointment.modules.sys.dao;

import java.util.List;
import java.util.Map;

import com.comit.appointment.modules.sys.entity.Operaters;

public interface OperatersMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Operaters record);

    int insertSelective(Operaters record);

    Operaters selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Operaters record);

    int updateByPrimaryKey(Operaters record);

	List<Operaters> selectPageByDay(String day);

	Operaters selectNumberByDay(String day);

	List<Operaters> selectPageByDay(Map map);
}