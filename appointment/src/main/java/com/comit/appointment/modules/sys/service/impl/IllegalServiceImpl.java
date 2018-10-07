package com.comit.appointment.modules.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.comit.appointment.modules.sys.dao.AddsMapper;
import com.comit.appointment.modules.sys.dao.DataSourcesMapper;
import com.comit.appointment.modules.sys.dao.FieldsMapper;
import com.comit.appointment.modules.sys.dao.FilesMapper;
import com.comit.appointment.modules.sys.dao.IllegalsMapper;
import com.comit.appointment.modules.sys.entity.Adds;
import com.comit.appointment.modules.sys.entity.DataSources;
import com.comit.appointment.modules.sys.entity.Fields;
import com.comit.appointment.modules.sys.entity.Illegals;
import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.service.IIllegalService;
import com.comit.appointment.modules.sys.utils.UploadFileUtils;
import com.mysql.jdbc.Field;

@Service("IllegalServiceImpl")
public class IllegalServiceImpl implements IIllegalService {
	
	@Autowired
	private IllegalsMapper illegalsMapper;
	@Autowired
	private FilesMapper filesMapper;
	@Autowired
	private FieldsMapper fieldsMapper;
	@Autowired
	private AddsMapper addsMapper;
	@Autowired
	private DataSourcesMapper dataSourcesMapper;

	@Override
	public Integer addIllegalType(String basePath, Illegals illegal, MultipartFile[] files, String[] fileds,
			String[] addFields, String[] addDatas) {
		Integer id=illegalsMapper.insertSelective(illegal);
		if(id>0) {
			//增加上传文件
			UploadFileUtils upload= new UploadFileUtils();
			try {
				upload.upload(basePath, files, "测试", id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//end
			//增加查询字段
			for(String str:fileds) {
				String []field=str.split(",");
				Fields fs=new Fields();
				fs.setILLEGAL_ID(id);
				fs.setFIELD_ZNAME(field[0]);
				fs.setFIELD_ENAME(field[1]);
				fs.setSTATUS(1);
				fieldsMapper.insertSelective(fs);
			}
			//end
			//增加补充字段
			for(String str:addFields) {
				String []field=str.split(",");
				Adds as=new Adds();
				as.setILLEGAL_ID(id);
				as.setADD_ZNAME(field[0]);
				as.setADD_ENAME(field[1]);
				as.setSTATUS(1);
				addsMapper.insertSelective(as);
			}
			//end
			//增加数据源
			for(String str:addDatas) {
				String []field=str.split(",");
				DataSources ds=new DataSources();
				ds.setILLEGAL_ID(id);
				ds.setDATASOURCE_ZNAME(field[0]);
				ds.setDATASOURCE_ENAME(field[1]);
				ds.setSTATUS(1);
				dataSourcesMapper.insertSelective(ds);
			}
			//end
		}
		
		return 1;
	}

	@Override
	public List<Illegals> selectPage(Page page) {
		return illegalsMapper.selectPage(page);
	}

	@Override
	public int selectPageCount(Page page) {
		return illegalsMapper.selectPageCount(page);
	}

}
