package com.qhit.lh.g4.sea.exam.bjgl.dao.impl;

import java.util.List;

import com.qhit.lh.g4.sea.exam.bjgl.bean.ClassInfo;
import com.qhit.lh.g4.sea.exam.bjgl.dao.ClazzDao;
import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;

/**
 * @author 李海洋
 *TODO
 *2018年1月13日上午9:08:28
 */
public class ClazzDaoImpl extends BaseDao implements ClazzDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.bjgl.dao.ClazzDao#getClazzList()
	 */
	@Override
	public List<ClassInfo> getClazzList() {
		
		return getSession().createQuery("from ClassInfo").list();
	}

}
