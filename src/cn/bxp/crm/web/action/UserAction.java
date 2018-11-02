package cn.bxp.crm.web.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.bxp.crm.domain.User;
import cn.bxp.crm.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user=new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public String regist() {
		userService.regist(user);
		return LOGIN;
	}

}
