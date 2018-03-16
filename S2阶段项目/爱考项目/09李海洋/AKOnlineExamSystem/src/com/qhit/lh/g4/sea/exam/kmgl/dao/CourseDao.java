package com.qhit.lh.g4.sea.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.kmgl.bean.Course;

/**
 * @author 李海洋
 *TODO
 *2018年1月9日下午3:16:17
 */
public interface CourseDao {
	/**
	 * @param course
	 * @return
	 */
	public List<Course> getCoursesList(Map<String, Object> parameter);
}
