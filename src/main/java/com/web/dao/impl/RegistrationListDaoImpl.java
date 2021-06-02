package com.web.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.RegistrationListDao;
import com.web.entities.RegistrationList;

@Transactional
public class RegistrationListDaoImpl implements RegistrationListDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(RegistrationList registrationList) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(registrationList);

	}

	public void update(int id_hoatdong, String msv, Date timedangky, Date timehuydangky, String dangky) {
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "UPDATE RegistrationList  u SET u.dangky = :newdangky where u.id_hoatdong = :id_hoatdong AND  msv = :msv";
		session.createQuery(sql).setString(dangky, "newdangky").setInteger("id_hoatdong", id_hoatdong)
				.setString("msv", msv).executeUpdate();
	}

	/*
	 * public RegistrationList findById(int id_hoatdong) { Session session =
	 * this.sessionFactory.getCurrentSession(); List<RegistrationList>
	 * registrationList =
	 * session.createQuery("from RegistrationList where username like :name")
	 * .setParameter("name", "%" + name + "%").list(); }
	 */

	public RegistrationList findById(int id_hoatdong, String msv) {

		return null;
	}

}
