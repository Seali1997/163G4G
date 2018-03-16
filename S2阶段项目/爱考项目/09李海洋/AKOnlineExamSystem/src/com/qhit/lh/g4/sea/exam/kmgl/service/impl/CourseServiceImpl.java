package com.qhit.lh.g4.sea.exam.kmgl.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.kmgl.bean.Course;
import com.qhit.lh.g4.sea.exam.kmgl.dao.CourseDao;
import com.qhit.lh.g4.sea.exam.kmgl.dao.impl.CourseDaoImpl;
import com.qhit.lh.g4.sea.exam.kmgl.service.CourseService;

/**
 * @author 李海洋
 *TODO
 *2018年1月9日下午3:17:50
 */
public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao = new CourseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.kmgl.service.CourseService#getCoursesList(java.util.Map)
	 */
	@Override
	public List<Course> getCoursesList(Map<String, Object> parameter) {
		
		return courseDao.getCoursesList(parameter);
	}

}
