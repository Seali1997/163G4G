package com.qhit.lh.g4.sea.exam.jsgl.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.qhit.lh.g4.sea.exam.common.bean.PageBean;
import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;
import com.qhit.lh.g4.sea.exam.jsgl.bean.Teacher;
import com.qhit.lh.g4.sea.exam.jsgl.dao.TeacherDao;
import com.qhit.lh.g4.sea.exam.tkgl.bean.WrittenQuestion;

/**
 * @author 李海洋
 *TODO
 *2018年3月7日下午4:31:24
 */
public class TeacherDaoimpl extends BaseDao implements TeacherDao {


	@Override
	public PageBean<Teacher> getTeacherList(PageBean<Teacher> pageBean,
			Map<String, Object> parameter, int pageIndex) {
		// TODO Auto-generated method stub
		StringBuffer hql = new StringBuffer("select t from Teacher t where 1 = 1 ");
		//拼接HQL
		if (parameter.get("tid") != null && !"".equals(parameter.get("tid"))) {
			hql.append(" and t.tid = :tid");
		}
		if (parameter.get("tname") != null && !"".equals(parameter.get("tname"))) {
			hql.append(" and t.tname = :tname");
		}
		if (parameter.get("post") != null && !"".equals(parameter.get("post"))) {
			hql.append(" and t.post = :post");
		}
		//获取Query查询器
		Query query = getSession().createQuery(hql.toString());
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
		
		int count = query.list().size();
		pageBean.setTotalNumber(count);
		pageBean.setCurrentIndex(pageIndex);
		
		List<Teacher> items = query.setFirstResult((pageBean.getCurrentIndex()-1)*pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize())
				.list();
		
		pageBean.setItems(items);
		
		return pageBean;
	}

}
