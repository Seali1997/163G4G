package com.qhit.lh.g4.sea.exam.jsgl.action;


import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.jsgl.bean.Teacher;
import com.qhit.lh.g4.sea.exam.jsgl.service.TeacherService;
import com.qhit.lh.g4.sea.exam.jsgl.service.impl.TeacherServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2018年3月7日下午4:46:38
 */
public class TeacherAction extends ActionSupport {
	private TeacherService Teacherservice = new TeacherServiceImpl();
	//试题列表分页数据
	private Teacher teacher;
	private PageBean<Teacher> pageBean = new PageBean<>();
	private int pageIndex = 1;//指定页,初始化为1
	
	public String getTeacherList(){
		//设置参数
		Map<String, Object> parameter = new HashMap<>();
		if (teacher !=null) {
			parameter.put("tid", teacher.getTid());
			parameter.put("tname", teacher.getTname());
			parameter.put("post", teacher.getPost());
		}
		pageBean = Teacherservice.getTeacherList(pageBean, parameter, pageIndex);
		return "listTeacher";
	}
	
	public PageBean<Teacher> getPageBean() {
		return pageBean;
	}
	public void setPageBean(PageBean<Teacher> pageBean) {
		this.pageBean = pageBean;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
