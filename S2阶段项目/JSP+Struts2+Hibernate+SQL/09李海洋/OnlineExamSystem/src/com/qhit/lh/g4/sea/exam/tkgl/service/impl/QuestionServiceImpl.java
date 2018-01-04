package com.qhit.lh.g4.sea.exam.tkgl.service.impl;

import java.util.List;
import java.util.Map;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.kmgl.bean.Course;
import com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.g4.sea.exam.tkgl.dao.QuestionDao;
import com.qhit.lh.g4.sea.exam.tkgl.dao.impl.QuestionDaoImpl;
import com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService;

/**
 * @author 李海洋
 *TODO
 *2018年1月3日下午4:34:51
 */
public class QuestionServiceImpl implements QuestionService {
	private QuestionDao questionDao = new QuestionDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#getCourseInfo(java.util.Map)
	 */
	@Override
	public List<Course> getCourseInfo(Map parameter) {
		// TODO Auto-generated method stub
		return questionDao.getCourseInfo(parameter);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#getWrittenList(com.qhit.lh.g4.sea.exam.common.bean.PageBean, com.qhit.lh.g4.sea.exam.kmgl.bean.Course, int)
	 */
	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, Course course, int pageIndex) {
		// TODO Auto-generated method stub
		return questionDao.getWrittenList(pageBean, course, pageIndex);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#addWrittenQuestion(com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		questionDao.addWrittenQuestion(writtenQuestion);
	}

}
