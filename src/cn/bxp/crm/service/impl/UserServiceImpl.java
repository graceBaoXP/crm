package cn.bxp.crm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import cn.bxp.crm.dao.UserDao;
import cn.bxp.crm.domain.User;
import cn.bxp.crm.service.UserService;
import cn.bxp.crm.utils.MD5Utils;

@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public void regist(User user) {
		user.setUserPassword(MD5Utils.md5(user.getUserPassword()));
		user.setUserState("1");
		userDao.save(user);
		
	}
}
