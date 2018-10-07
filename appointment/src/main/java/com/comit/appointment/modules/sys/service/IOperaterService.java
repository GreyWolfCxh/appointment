package com.comit.appointment.modules.sys.service;

import java.util.List;

import com.comit.appointment.modules.sys.entity.Operaters;

public interface IOperaterService {

	List<Operaters> selectPageByDay(String string,String period);

	Operaters selectNumberByDay(String string);

}
