package com.qhit.lh.g4.sea.exam.common.service.impl;

import com.qhit.lh.g4.sea.exam.common.bean.User;
import com.qhit.lh.g4.sea.exam.common.dao.UserDao;
import com.qhit.lh.g4.sea.exam.common.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.sea.exam.common.service.UserService;

/**
 * @author 李海洋
 *TODO
 *2018年1月8日下午6:01:35
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();
	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.sea.exam.common.service.UserService#login(com.qhit.lh.g4.sea.exam.common.bean.User)
	 */
	@Override
	public User login(User user) {
		
		return userDao.login(user);
	}

}
