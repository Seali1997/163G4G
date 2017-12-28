package com.qhit.lh.g4.sea.exam;

import org.junit.Test;

import com.qhit.lh.g4.sea.exam.common.action.UserAction;
import com.qhit.lh.g4.sea.exam.common.bean.User;

/**
 * @author 李海洋
 *TODO
 *2017年12月28日上午8:24:13
 */
public class UserTest {
	
	@Test
	public void login(){
		UserAction userAction  = new UserAction();
		
		User user = new User();
		user.setName("admin");
		user.setPwd("123456");
		user.setRole(4);
		
		userAction.setUser(user);
		System.out.println(userAction.Login());
	}
}
