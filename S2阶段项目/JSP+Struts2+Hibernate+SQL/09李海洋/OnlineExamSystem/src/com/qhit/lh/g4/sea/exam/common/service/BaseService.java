package com.qhit.lh.g4.sea.exam.common.service;

import java.io.Serializable;
import java.util.List;

/**
 * @author 李海洋
 *TODO
 *2017年12月28日下午2:22:03
 */
public interface BaseService {
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
}
