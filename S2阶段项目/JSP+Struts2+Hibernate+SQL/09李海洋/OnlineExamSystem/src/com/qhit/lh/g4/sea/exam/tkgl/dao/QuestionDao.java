package com.qhit.lh.g4.sea.exam.tkgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.kmgl.bean.Course;
import com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion;

/**
 * @author 李海洋
 *TODO
 *2018年1月3日下午4:36:24
 */
public interface QuestionDao {
	/**
	 * 题库管理
	 * @param mjId
	 * @param stage
	 * @return
	 * 题库列表
	 */
	public List<Course> getCourseInfo(Map parameter);
	/**
	 * @param pageBean
	 * @return
	 * 笔试题列表分页数据
	 */
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, 
			Course course,
			int pageIndex);
	/**
	 * @return
	 * 添加笔试题
	 */
	public void addWrittenQuestion(WrittenQuestion writtenQuestion);
}

