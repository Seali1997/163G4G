package com.qhit.lh.g4.sea.exam.jsgl.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.common.bean.Teacher;
import com.qhit.lh.g4.sea.exam.jsgl.dao.TeacherDao;
import com.qhit.lh.g4.sea.exam.jsgl.dao.impl.TeacherDaoImpl;
import com.qhit.lh.g4.sea.exam.jsgl.service.TeacherService;

/**
 * @author 李海洋
 *TODO
 *2018年1月4日下午3:56:20
 */
public class TeacherServiceImpl implements TeacherService {
	private TeacherDao teacherDao = new TeacherDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.jsgl.service.TeacherService#getTeacherList(com.qhit.lh.g4.sea.exam.common.bean.PageBean, int)
	 */
	@Override
	public PageBean<Teacher> getTeacherList(PageBean<Teacher> pageBean,
			int pageIndex) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherList(pageBean, pageIndex);
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.jsgl.service.TeacherService#getTeachers(java.util.Map)
	 */
	@Override
	public List<Teacher> getTeachers(Map parameter) {
		// TODO Auto-generated method stub
		return teacherDao.getTeachers(parameter);
	}

}
