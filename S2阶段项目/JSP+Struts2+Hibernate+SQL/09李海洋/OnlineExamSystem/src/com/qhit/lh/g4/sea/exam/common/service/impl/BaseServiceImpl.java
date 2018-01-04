package com.qhit.lh.g4.sea.exam.common.service.impl;

import java.io.Serializable;
import java.util.List;

import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;
import com.qhit.lh.g4.sea.exam.common.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.sea.exam.common.service.BaseService;

/**
 * @author 李海洋
 *TODO
 *2017年12月28日下午2:23:57
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.service.BaseService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.service.BaseService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.service.BaseService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.service.BaseService#getObjectById(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public Object getObjectById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.service.BaseService#getObjects(java.lang.String)
	 */
	@Override
	public List getObjects(String hql) {
		// TODO Auto-generated method stub
		return baseDao.getObjects(hql);
	}

}
