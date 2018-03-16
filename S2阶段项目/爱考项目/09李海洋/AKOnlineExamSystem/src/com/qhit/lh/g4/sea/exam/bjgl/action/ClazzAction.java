package com.qhit.lh.g4.sea.exam.bjgl.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.exam.bjgl.bean.ClassInfo;
import com.qhit.lh.g4.sea.exam.bjgl.service.ClazzService;
import com.qhit.lh.g4.sea.exam.bjgl.service.impl.ClazzServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2018年1月13日上午9:11:34
 */
public class ClazzAction extends ActionSupport {
	private ClazzService clazzService = new ClazzServiceImpl();
	private List<ClassInfo> listClazz;
	
	public String getClazzList(){
		listClazz = clazzService.getClazzList();
		return "getClazzList";
	}

	public List<ClassInfo> getListClazz() {
		return listClazz;
	}

	public void setListClazz(List<ClassInfo> listClazz) {
		this.listClazz = listClazz;
	}
}
