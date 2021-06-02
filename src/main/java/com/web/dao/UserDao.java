package com.web.dao;

import com.web.entities.User;

public interface UserDao {

	public User loadUserByUsername(final String username);
}
