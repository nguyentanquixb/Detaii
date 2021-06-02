package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.web.dao.UserDao;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDAO;

	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

		com.web.entities.User user = userDAO.loadUserByUsername(username);
		if (user == null) {
			return null;
		}

		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		return new User(username, user.getPassword(), enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, user.getAuthorities());
	}

}
