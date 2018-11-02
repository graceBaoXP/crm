package cn.bxp.crm.dao.impl;



import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.bxp.crm.dao.UserDao;
import cn.bxp.crm.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void save(User user) {
		this.getHibernateTemplate().save(user);
		
	}

}
