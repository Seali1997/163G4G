package com.qhit.lh.g4.sea.exam.common.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.qhit.lh.g4.sea.exam.common.bean.User;
import com.qhit.lh.g4.sea.exam.common.dao.BaseDao;
import com.qhit.lh.g4.sea.exam.common.dao.UserDao;

/**
 * @author 李海洋
 *TODO
 *2018年1月8日下午5:56:24
 */
public class UserDaoImpl extends BaseDao implements UserDao {

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.dao.UserDao#login(com.qhit.lh.g4.sea.exam.common.bean.User)
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		String hql = "select user from User user "
				+ "where user.name = ? and "
				+ "user.pwd = ? and "
				+ "user.role = ?";
		
		Query query =  getSession().createQuery(hql);
		
		query.setString(0, user.getName());
		query.setString(1, user.getPwd());
		query.setInteger(2, user.getRole());
		
		List<User> list = query.list();
		
		if(list != null && list.size() == 1){
			//登录成功
			return list.get(0);
		}
		return null;
	}
}
