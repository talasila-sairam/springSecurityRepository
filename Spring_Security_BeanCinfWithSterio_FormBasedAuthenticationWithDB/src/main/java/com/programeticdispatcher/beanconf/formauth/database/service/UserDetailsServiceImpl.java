package com.programeticdispatcher.beanconf.formauth.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.programeticdispatcher.beanconf.formauth.database.bo.User;
import com.programeticdispatcher.beanconf.formauth.database.dao.UserDao;
import com.programeticdispatcher.beanconf.formauth.database.dto.UserDetailsImpl;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserDao userDao;
	
  public UserDetailsServiceImpl() {
	  System.out.println("inside UserDetailsServiceImple constructor");
  }

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	System.out.println("inside loadUserByUsername method ");
	UserDetailsImpl userDetailsImpl = null;
	User user = userDao.findUser(username);
	userDetailsImpl = new UserDetailsImpl(user.getUsername(), user.getPassword(),user.getUserRoles().getRoleName(), user.getStatus());
	return userDetailsImpl;
}
}
