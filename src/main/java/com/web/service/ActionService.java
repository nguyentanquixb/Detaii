package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.dao.ActionDao;
import com.web.entities.RegistrationList;



public class ActionService {
	@Autowired
	private ActionDao actionDAO;

	public List<RegistrationList> findAll() {
		return actionDAO.findAll();
	}
}
