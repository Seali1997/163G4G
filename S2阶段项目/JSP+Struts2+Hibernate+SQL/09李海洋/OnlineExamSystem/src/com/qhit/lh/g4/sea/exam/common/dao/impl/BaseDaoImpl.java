package com.qhit.lh.g4.sea.exam.common.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;
import com.qhit.lh.g4.sea.exam.common.utils.HibernateSessionFactory;

/**
 * @author 李海洋
 *TODO
 *2017年12月28日上午8:00:20
 */
public class BaseDaoImpl implements BaseDao {
	private Session session;
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.BaseDao#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//保存数据
		session.save(obj);
		//提交事务
		tx.commit();
		//释放资源
		session.close();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//删除数据
		session.delete(obj);
		//提交事务
		tx.commit();
		//释放资源
		session.close();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		//修改数据
		session.update(obj);
		//提交事务
		tx.commit();
		//释放资源
		session.close();
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.BaseDao#getObjectById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSession();
		//开启事务
		Transaction tx = session.beginTransaction();
		Object obj = null;
		obj = session.get(clazz, id);
		//提交事务
		tx.commit();
		//释放资源
		session.close();
		return obj;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.BaseDao#getObjects(java.lang.String)
	 */
	@Override
	public List getObjects(String hql) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		//声明并实例化一个集合
		List list = new ArrayList<>();
		//调用session实例的createQuery（）方法查询；接着调用list()方法检索所有数据
		list = session.createQuery(hql).list();
		//提交事务
		tx.commit();
		//释放资源
		session.close();
		return list;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.BaseDao#getSession()
	 */
	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return HibernateSessionFactory.getSession();
	}

}
