package com.qhit.lh.g4.sea.exam.jsgl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.common.bean.Teacher;
import com.qhit.lh.g4.sea.exam.jsgl.service.TeacherService;
import com.qhit.lh.g4.sea.exam.jsgl.service.impl.TeacherServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2018年1月4日下午2:49:05
 */
public class TeacherAction extends ActionSupport {
	//数据
	private Teacher teacher;
	private String tid;//编号
	private String tname;//姓名
	private String post;//岗位
	private List<Teacher> teachers = new ArrayList<>();
	private PageBean<Teacher> pageBean = new PageBean<>();
	private int pageIndex = 1;//指定页,初始化为1
	//业务
	private TeacherService teacherService = new TeacherServiceImpl();
	
	public String getTeacherList(){
		//设置参数
		Map<String, String> parameter = new HashMap<>();
		if (tid != null && !"".equals(tid)) {
			parameter.put("tid", tid);
		}
		if (tname != null && !"".equals(tname)) {
			parameter.put("tname", tname);
		}
		if (post != null && !"".equals(post)) {
			parameter.put("post", post);
		}
		//查询题库列表数据
		teachers = teacherService.getTeachers(parameter);
		System.out.println(teachers.size());
		return "teacherList";
	}
	
	/**
	 * @return
	 * 获取教师列表
	 */
	public String getAll(){
		pageBean = teacherService.getTeacherList(pageBean, pageIndex);
		System.out.println("数据大小:"+pageBean.getItems().size());
		return "teacherList";
	};
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

}
