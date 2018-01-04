package com.qhit.lh.g4.sea.exam.tkgl.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Transaction;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;
import com.qhit.lh.g4.sea.exam.common.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.sea.exam.kmgl.bean.Course;
import com.qhit.lh.g4.sea.exam.tkgl.bean.MachineQuestion;
import com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.g4.sea.exam.tkgl.dao.QuestionDao;

/**
 * @author 李海洋
 *TODO
 *2018年1月3日下午4:38:14
 */
public class QuestionDaoImpl implements QuestionDao {
	private BaseDao baseDao = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.dao.QuestionDao#getCourseInfo(java.util.Map)
	 */
	@Override
	public List<Course> getCourseInfo(Map parameter) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer();
		hql.append("select course from Course course where 1 = 1");
		//拼接HQL
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			hql.append(" and course.major = :major");
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			hql.append(" and course.stage = :stage");
		}
		//获取查询器
		Query query = baseDao.getSession().createQuery(hql.toString());
		//设置参数
		if(parameter.get("major") != null && !"".equals(parameter.get("major"))){
			query.setString("major", (String) parameter.get("major"));
		}
		if(parameter.get("stage") != null && !"".equals(parameter.get("stage"))){
			query.setString("stage", (String) parameter.get("stage"));
		}
		//执行查询
		return query.list();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.dao.QuestionDao#getWrittenList(com.qhit.lh.g4.sea.exam.common.bean.PageBean, com.qhit.lh.g4.sea.exam.kmgl.bean.Course, int)
	 */
	@Override
	public PageBean<WrittenQuestion> getWrittenList(
			PageBean<WrittenQuestion> pageBean, Course course, int pageIndex) {
		// TODO Auto-generated method stub
		//hql语句
		StringBuffer hql = new StringBuffer();
		hql.append("select w from WrittenQuestion w where w.csId = :csId");
		//获取查询器
		Query query = baseDao.getSession().createQuery(hql.toString());
		//设置分页查询参数
		query.setInteger("csId", course.getCsId());
		//总记录数
		int count = query.list().size();
		pageBean.setTotalNumber(count);
		pageBean.setCurrentIndex(pageIndex);
		//当前页数据
		List<WrittenQuestion> items = query.setFirstResult((pageBean.getCurrentIndex()-1)*pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize())
				.list();

		pageBean.setItems(items);

		return pageBean;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.tkgl.dao.QuestionDao#addWrittenQuestion(com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion)
	 */
	@Override
	public void addWrittenQuestion(WrittenQuestion writtenQuestion) {
		// TODO Auto-generated method stub
		//开启事务
		Transaction ts = baseDao.getSession().beginTransaction();
		//执行添加，返回新纪录的主键
		long id = (Integer) baseDao.getSession().save(writtenQuestion);
		//提交事务
		ts.commit();
		
	}

}
