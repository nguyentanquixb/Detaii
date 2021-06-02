package com.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.UserDao;
import com.web.entities.User;
@Transactional
public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	 public void setSessionFactory(SessionFactory sessionFactory) {
	      this.sessionFactory = sessionFactory;
	  }
	@SuppressWarnings("unchecked")
	public User loadUserByUsername(String username) {

		List<User> users = new ArrayList<User>();
		Session session = this.sessionFactory.getCurrentSession();
		users = session.createQuery("from User where username=?").setParameter(0, username).list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

}
