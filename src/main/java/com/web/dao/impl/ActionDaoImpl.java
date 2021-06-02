package com.web.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.web.dao.ActionDao;
import com.web.entities.Action;
import com.web.entities.RegistrationList;

@Service
@Transactional
public class ActionDaoImpl implements ActionDao {
	private SessionFactory sessionFactory;
	 public void setSessionFactory(SessionFactory sessionFactory) {
	      this.sessionFactory = sessionFactory;
	  }
	@SuppressWarnings("unchecked")
	public List<RegistrationList> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("SELECT u FROM RegistrationList u");
		List<RegistrationList> actions = query.list();
		return actions;
		
	}

}
