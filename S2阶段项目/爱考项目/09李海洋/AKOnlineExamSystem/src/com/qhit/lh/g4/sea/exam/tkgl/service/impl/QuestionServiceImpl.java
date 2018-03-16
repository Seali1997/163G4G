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
 *2018年1月8日下午9:12:46
 */
public class QuestionServiceImpl implements QuestionService {
	private QuestionDao questionDao = new QuestionDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#getQuestionsMax(int, java.lang.String, java.lang.String)
	 */
	@Override
	public int getQuestionsMax(int csId, String qtype, String degree) {
		// TODO Auto-generated method stub
		return questionDao.getQuestionsMax(csId, qtype, degree);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#getCourseInfo(java.util.Map)
	 */
	@Override
	public List<Course> getCourseInfo(Map parameter) {
		
		return questionDao.getCourseInfo(parameter);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#getWrittenList(com.qhit.lh.g4.sea.exam.common.bean.PageBean, com.qhit.lh.g4.sea.exam.kmgl.bean.Course, int)
	 */
	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, Course course, int pageIndex) {
		
		return questionDao.getWrittenList(pageBean, course, pageIndex);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#addWrittenQuestion(com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		
		questionDao.addWrittenQuestion(writtenQuestion);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#getWrittenQuestionById(com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public WrittenQuestion getWrittenQuestionById(
			WrittenQuestion writtenQuestion) {
		
		return questionDao.getWrittenQuestionById(writtenQuestion);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#updateWrittenQuestion(com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public void updateWrittenQuestion(WrittenQuestion writtenQuestion) {
		
		questionDao.updateWrittenQuestion(writtenQuestion);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#inportWrittenQuestions(java.util.List)
	 */
	@Override
	public void inportWrittenQuestions(List<WrittenQuestion> listWQuestions) {
		
		questionDao.inportWrittenQuestions(listWQuestions);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.service.QuestionService#getQuestionsByType(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<WrittenQuestion> getQuestionsByType(int csId, String qtype,
			String degree) {
		
		return questionDao.getQuestionsByType(csId, qtype, degree);
	}

}
