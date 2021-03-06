/**
 * 
 */
package com.qhit.lh.g4.sea.t2.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.sea.t2.dao.BaseDao;
import com.qhit.lh.g4.sea.t2.utils.HibernateSessionFactory;

/**
 * @author 李海洋
 *TODO
 *2017年12月11日上午8:25:42
 */
public class BaseDaoImpl implements BaseDao {
	private Session session = HibernateSessionFactory.getSession();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.t2.dao.BaseDao#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
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
	 * @see com.qhit.lh.g4.sea.t2.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
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
	 * @see com.qhit.lh.g4.sea.t2.dao.BaseDao#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
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
	 * @see com.qhit.lh.g4.sea.t2.dao.BaseDao#getObjectById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		Object obj = null;
		obj = session.get(clazz, id);
		//提交事务
		tx.commit();
		return obj;
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.t2.dao.BaseDao#getObjects(java.lang.String)
	 */
	@Override
	public List getObjects(String hql) {
		// TODO Auto-generated method stub
		Transaction tx = session.beginTransaction();
		//声明并实例化一个集合
		List list = new ArrayList<>();
		//调用session实例的createQuery（）方法查询；接着调用list()方法检索所有数据
		list = session.createQuery(hql).list();
		tx.commit();
		session.close();
		return list;
	}

}
