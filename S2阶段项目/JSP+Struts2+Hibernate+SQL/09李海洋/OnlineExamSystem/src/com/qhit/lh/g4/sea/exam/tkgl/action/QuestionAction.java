package com.qhit.lh.g4.sea.exam.tkgl.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.kmgl.bean.Course;
import com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService;
import com.qhit.lh.g4.sea.exam.tkgl.service.impl.QuestionServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2018年1月3日下午4:52:29
 */
public class QuestionAction extends ActionSupport {
	private QuestionService questionService = new QuestionServiceImpl();
	private Course course;
	private String major;//专业方向
	private String stage;//阶段
	private WrittenQuestion writtenQuestion;//笔试题对象
	private List<Course> listCourses = new ArrayList<>();
	private PageBean<WrittenQuestion> pageBean = new PageBean<>();
	private int pageIndex = 1;//指定页,初始化为1
	
	/**
	 * @return
	 * 题库列表
	 */
	public String getCourseInfo(){
		//设置参数
		Map<String, String> parameter = new HashMap<>();
		if(major != null && !"".equals(major)){
			parameter.put("major", major);
		}
		if(stage != null && !"".equals(stage)){
			parameter.put("stage", stage);
		}
		//查询题库列表数据
		listCourses = questionService.getCourseInfo(parameter);
		System.out.println(listCourses.size());
		return "listCourse";
	}
	
	/**
	 * @return
	 * 获取试题列表
	 */
	public String getWrittenList(){
		pageBean = questionService.getWrittenList(pageBean, course, pageIndex);
		System.out.println("数据大小:"+pageBean.getItems().size());
		return "listWritten";
	}
	/**
	 * @return
	 * 添加笔试题
	 */
	public String addWrittenQuestion(){
		System.out.println(writtenQuestion.getCsId());
		writtenQuestion.setCourse(course);
		//接收并保存参数
		ServletActionContext.getRequest().setAttribute("csid", course.getCsId());
		ServletActionContext.getRequest().setAttribute("csName", course.getCsId());
		questionService.addWrittenQuestion(writtenQuestion);
		return "addWrittenQuestion";
	}
	public PageBean<WrittenQuestion> getPageBean() {
		return pageBean;
	}

	public void setPageBean(PageBean<WrittenQuestion> pageBean) {
		this.pageBean = pageBean;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}



	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public List<Course> getListCourses() {
		return listCourses;
	}

	public void setListCourses(List<Course> listCourses) {
		this.listCourses = listCourses;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public WrittenQuestion getWrittenQuestion() {
		return writtenQuestion;
	}

	public void setWrittenQuestion(WrittenQuestion writtenQuestion) {
		this.writtenQuestion = writtenQuestion;
	}

}
