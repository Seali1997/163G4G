package com.qhit.lh.g4.sea.exam.bjgl.service.impl;

import java.util.List;

import com.qhit.lh.g4.sea.exam.bjgl.bean.ClassInfo;
import com.qhit.lh.g4.sea.exam.bjgl.dao.ClazzDao;
import com.qhit.lh.g4.sea.exam.bjgl.dao.impl.ClazzDaoImpl;
import com.qhit.lh.g4.sea.exam.bjgl.service.ClazzService;

/**
 * @author 李海洋
 *TODO
 *2018年1月13日上午9:09:00
 */
public class ClazzServiceImpl implements ClazzService {
	private ClazzDao clazzDao = new ClazzDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.bjgl.service.ClazzService#getClazzList()
	 */
	@Override
	public List<ClassInfo> getClazzList() {
		
		return clazzDao.getClazzList();
	}

}
