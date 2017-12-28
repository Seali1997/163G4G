package com.qhit.lh.g4.sea.exam.common.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.qhit.lh.g4.sea.exam.common.bean.User;
import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;
import com.qhit.lh.g4.sea.exam.common.dao.UserDao;

/**
 * @author 李海洋
 *TODO
 *2017年12月27日下午9:58:26
 */
public class UserDaoImpl implements UserDao {
	private BaseDao baseDao = new BaseDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.UserDao#Login(com.qhit.lh.g4.sea.exam.common.bean.User)
	 */
	@Override
	public User Login(User user) {
		// TODO Auto-generated method stub
		String hql = "select user from User user where "
				+ "user.name = ? and "
				+ "user.pwd = ? and "
				+ "user.role = ?";
		Query query = baseDao.getSession().createQuery(hql);
		query.setString(0, user.getName());
		query.setString(1, user.getPwd());
		query.setInteger(2, user.getRole());
		
		List<User> list = query.list();
		if (list!=null && list.size() == 1) {
			//登录成功
			return list.get(0);
		}
		return null;
	}

}
