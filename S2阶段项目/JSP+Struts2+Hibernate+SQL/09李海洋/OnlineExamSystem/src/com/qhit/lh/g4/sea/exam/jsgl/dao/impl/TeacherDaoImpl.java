package com.qhit.lh.g4.sea.exam.jsgl.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.common.bean.Teacher;
import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;
import com.qhit.lh.g4.sea.exam.common.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.sea.exam.jsgl.dao.TeacherDao;

/**
 * @author 李海洋
 *TODO
 *2018年1月4日下午3:38:40
 */
public class TeacherDaoImpl implements TeacherDao {
	private BaseDao baseDao = new BaseDaoImpl();
	private StringBuffer hql = new StringBuffer();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.jsgl.dao.TeacherDao#getTeacherList(com.qhit.lh.g4.sea.exam.common.bean.PageBean, int)
	 */
	@Override
	public PageBean<Teacher> getTeacherList(PageBean<Teacher> pageBean,
			int pageIndex) {
		// TODO Auto-generated method stub
		hql.append("from Teacher");
		//获取查询器
		Query query = baseDao.getSession().createQuery(hql.toString());
		//总记录数
		int count = query.list().size();
		pageBean.setTotalNumber(count);
		pageBean.setCurrentIndex(pageIndex);
		//当前页数据
		List<Teacher> items = query.setFirstResult((pageBean.getCurrentIndex()-1)*pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize()).list();
		
		pageBean.setItems(items);
		
		return pageBean;
	}
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.jsgl.dao.TeacherDao#getTeachers(java.util.Map)
	 */
	@Override
	public List<Teacher> getTeachers(Map parameter) {
		// TODO Auto-generated method stub
		hql.append("select teacher from Teacher teacher where 1 = 1");
		//拼接HQL
		if (parameter.get("tid") != null && !"".equals(parameter.get("tid"))) {
			hql.append("and teacher.tid = :tid");
		}
		if (parameter.get("tname") != null && !"".equals(parameter.get("tname"))) {
			hql.append("and teacher.tname = :tname");
		}
		if (parameter.get("post") != null && !"".equals(parameter.get("post"))) {
			hql.append("and teacher.post = :post");
		}
		//获取查询器
		Query query = baseDao.getSession().createQuery(hql.toString());
		//设置参数
		if (parameter.get("tid") != null && !"".equals(parameter.get("tid"))) {
			query.setString("tid", (String) parameter.get("tid"));
		}
		if (parameter.get("tname") != null && !"".equals(parameter.get("tname"))) {
			query.setString("tname", (String) parameter.get("tname"));
		}
		if (parameter.get("post") != null && !"".equals(parameter.get("post"))) {
			query.setString("post", (String) parameter.get("post"));
		}
		//执行查询
		return query.list();
	}

}
