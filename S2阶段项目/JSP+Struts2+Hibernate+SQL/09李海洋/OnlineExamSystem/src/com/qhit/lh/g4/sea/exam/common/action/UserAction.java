package com.qhit.lh.g4.sea.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.sea.exam.common.bean.User;
import com.qhit.lh.g4.sea.exam.common.service.UserService;
import com.qhit.lh.g4.sea.exam.common.service.impl.UserServiceImpl;

/**
 * @author 李海洋
 *TODO
 *2017年12月27日下午9:26:25
 */
public class UserAction extends ActionSupport {
	//业务处理
	private UserService userService = new UserServiceImpl();
	//数据
	private User user;
	//登录
	public String Login(){
		user = userService.Login(user);
		if (user!=null) {
			//登录成功并把user对象保存到session中--当前session为HttpSession
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "loginSuccess";
		}else {
			super.addActionError("用户名或密码错误！");
			return "index";
		}
		
		
	}
	//退出
	public String logout(){
		//把session中保存的对象清除--当前session为HttpSession的Map对象
		ActionContext.getContext().getSession().clear();
		return "index";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
