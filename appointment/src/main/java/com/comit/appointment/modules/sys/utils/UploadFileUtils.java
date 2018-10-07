package com.comit.appointment.modules.sys.utils;


import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.comit.appointment.modules.sys.dao.FilesMapper;
import com.comit.appointment.modules.sys.entity.Files;


/**
 * 上传文件工具类
 * @author ASUS
 *
 */
@Component
public class UploadFileUtils {
	
	@Autowired
	private FilesMapper filesMapper;
	
    public  Integer upload(String basePath, MultipartFile[] files,String newName,Integer id) throws Exception {
    	for (MultipartFile file : files) {
            if("".equals(file.getOriginalFilename())){
                continue;
            }
        String fileName = file.getOriginalFilename();
        System.out.println("fileName-->"+fileName);
        String fileType = null;
        String path = basePath;
        File newFile = new File(path);
        if (!newFile.isDirectory()) {
            newFile.mkdirs();
        }
        File resultFile = new File(path + "/" + fileName);
        file.transferTo(resultFile);
        Files iFile = new Files();
        iFile.setUPLOAD_DATE(new Date());
        iFile.setORIGINAL_NAME(fileName);
        fileType =  fileName.substring(fileName.lastIndexOf(".")+1);
        iFile.setTYPE(fileType);
        iFile.setNEW_NAME(newName);
        iFile.setILLEGAL_ID(id);
        iFile.setHREF(path+ "/" + fileName);
        filesMapper.insertSelective(iFile);
    	}
    	return 1;
    }
}
