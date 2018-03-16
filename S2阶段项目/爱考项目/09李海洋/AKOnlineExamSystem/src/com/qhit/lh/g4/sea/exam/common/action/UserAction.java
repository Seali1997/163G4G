package com.qhit.lh.g4.sea.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.exam.common.bean.User;
import com.qhit.lh.g4.sea.exam.common.service.UserService;
import com.qhit.lh.g4.sea.exam.common.service.impl.UserServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2018年1月8日下午6:03:19
 */
public class UserAction extends ActionSupport {
	private UserService userService = new UserServiceImpl();
	private User user;
	
	/**
	 * @return
	 * 登录
	 */
	public String login(){
		user = userService.login(user);
		if(user != null){
			//登录成功
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "loginSuccess";
		}else{
			super.addActionError("用户名或密码错误！");
			return "loginFail";
		}
	}
	
	/**
	 * @return
	 * 退出
	 */
	public String logout(){
		//获取session对象，并销毁
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
