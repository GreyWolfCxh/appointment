package com.comit.appointment.modules.sys.dao;

import java.util.List;

import com.comit.appointment.modules.sys.entity.Illegals;
import com.comit.appointment.modules.sys.entity.Page;

public interface IllegalsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Illegals record);

    int insertSelective(Illegals record);

    Illegals selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Illegals record);

    int updateByPrimaryKey(Illegals record);

	List<Illegals> selectPage(Page page);

	int selectPageCount(Page page);
}