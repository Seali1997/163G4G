package com.qhit.lh.g4.sea.exam.common.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qhit.lh.g4.sea.exam.common.bean.User;
import com.qhit.lh.g4.sea.exam.common.utils.Constans;

/**
 * @author 李海洋
 *TODO
 *2018年1月3日下午5:14:10
 */
public class LoginInterceptor extends AbstractInterceptor {

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("登录校验拦截器执行");
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user == null){
			//未登录
			return Constans.VIEW_LOGIN;
		}
		return arg0.invoke();
	}

}
