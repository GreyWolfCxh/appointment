package com.comit.appointment.modules.sys.controller.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.comit.appointment.modules.sys.controller.IIllegalController;
import com.comit.appointment.modules.sys.entity.Illegals;
import com.comit.appointment.modules.sys.entity.Page;
import com.comit.appointment.modules.sys.service.IIllegalService;



@Controller
@RequestMapping("/illegal")
public class IllegalController implements IIllegalController {
	
	@Autowired
	private IIllegalService illegalService;
	
	/**
	 * 显示违章类型信息
	 * @param page 分页
	 * @return 管理员信息列表
	 */
	@RequestMapping("/illegalList")
	@ResponseBody
	public Map<String,Object>adminList(Page page){
		Map<String,Object>map=new HashMap<String,Object>();
		//信息列表
		List<Illegals>list=illegalService.selectPage(page);
		for(Illegals ls:list) {
			System.out.println("ls--"+ls.toString());
		}
		//信息总数
		int total=illegalService.selectPageCount(page);
		System.out.println("ls--"+total);
		map.put("total", total);
		map.put("rows", list);
		return map;
	}

	@Override
	@RequestMapping("/addIllegalType")
	public String addIllegalType(Illegals illegal, @RequestParam("fileAttach") MultipartFile[] files, @RequestParam("zfiled")String[] fileds, 
			@RequestParam("addData") String[] addDatas, @RequestParam("addField")String[] addFields, HttpServletRequest request
			) {
		String basePath = request.getSession().getServletContext().getRealPath("/");
		System.out.println("base-->"+basePath);
		System.out.println("illegal-->"+illegal.toString());
		System.out.println("file-->"+files);
		System.out.println("zfiled-->"+fileds);
		System.out.println("addField-->"+addFields);
		System.out.println("addData-->"+addDatas);
		illegalService.addIllegalType(basePath,illegal,files,fileds,addFields,addDatas);
        return "modules/platform/platform";
	}
	
	

}
