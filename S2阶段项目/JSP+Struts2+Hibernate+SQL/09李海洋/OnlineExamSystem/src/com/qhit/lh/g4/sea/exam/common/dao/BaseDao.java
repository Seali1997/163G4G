package com.qhit.lh.g4.sea.exam.common.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

/**
 * @author 李海洋
 *TODO
 *2017年12月28日上午7:58:51
 */
public interface BaseDao {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object getObjectById(Class clazz, Serializable id);
	public List getObjects(String hql);
	public Session getSession();
}
