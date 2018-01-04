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
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//单个查询
	public Object getObjectById(Class clazz, Serializable id);
	//遍历查询
	public List getObjects(String hql);
	//加载session
	public Session getSession();
}
