package com.qhit.lh.g4.sea.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.g4.sea.exam.common.utils.HibernateSessionFactory;

/**
 * @author 李海洋
 *TODO
 *2018年1月8日下午5:57:39
 */
public class BaseDao {
	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
