package com.qhit.lh.g4.sea.exam.jsgl.service.impl;

import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.jsgl.bean.Teacher;
import com.qhit.lh.g4.sea.exam.jsgl.dao.TeacherDao;
import com.qhit.lh.g4.sea.exam.jsgl.dao.impl.TeacherDaoimpl;
import com.qhit.lh.g4.sea.exam.jsgl.service.TeacherService;

/**
 * @author 李海洋
 *TODO
 *2018年3月7日下午4:48:03
 */
public class TeacherServiceImpl implements TeacherService {
	private TeacherDao teacherDao = new TeacherDaoimpl();
	
	@Override
	public PageBean<Teacher> getTeacherList(PageBean<Teacher> pageBean,
			Map<String, Object> parameter, int pageIndex) {
		// TODO Auto-generated method stub
		return teacherDao.getTeacherList(pageBean, parameter, pageIndex);
	}

}
