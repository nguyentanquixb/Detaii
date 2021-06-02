package com.web.dao;

import java.util.List;

import com.web.entities.Action;
import com.web.entities.RegistrationList;

public interface ActionDao {
	
	public List<RegistrationList> findAll();
	
}
