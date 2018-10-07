package com.comit.appointment.modules.sys.dao;

import java.util.List;

import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.entity.Records;

public interface RecordsMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(Records record);

    int insertSelective(Records record);

    Records selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(Records record);

    int updateByPrimaryKey(Records record);

	List<Records> selectPage(Page page);

	int selectPageCount(Page page);
}