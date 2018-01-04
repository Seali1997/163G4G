package com.qhit.lh.g4.sea.exam.jsgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.common.bean.Teacher;

/**
 * @author 李海洋
 *TODO
 *2018年1月4日下午3:31:47
 */
public interface TeacherDao {
	/**
	 * 教师管理
	 */
	public List<Teacher> getTeachers(Map parameter);
	/**
	 * @param pageBean
	 * @return
	 * Teacher列表分页数据
	 */
	public PageBean<Teacher> getTeacherList(PageBean<Teacher> pageBean,int pageIndex);
}
