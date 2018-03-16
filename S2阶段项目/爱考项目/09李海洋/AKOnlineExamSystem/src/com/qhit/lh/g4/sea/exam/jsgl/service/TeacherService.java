package com.qhit.lh.g4.sea.exam.jsgl.service;

import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.jsgl.bean.Teacher;

/**
 * @author 李海洋
 *TODO
 *2018年3月7日下午4:47:10
 */
public interface TeacherService {
	/**
	 * @param pageBean
	 * @return
	 * 教师列表分页数据
	 */
	public PageBean<Teacher> getTeacherList(PageBean<Teacher> pageBean, Map<String, Object> parameter, int pageIndex);

}
