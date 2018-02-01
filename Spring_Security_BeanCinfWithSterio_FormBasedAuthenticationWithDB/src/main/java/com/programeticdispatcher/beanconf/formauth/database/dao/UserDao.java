package com.programeticdispatcher.beanconf.formauth.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.programeticdispatcher.beanconf.formauth.database.bo.Roles;
import com.programeticdispatcher.beanconf.formauth.database.bo.User;

@Repository
public class UserDao {
	private final String USER_ROLES = "SELECT  u.*, r.* FROM sys.users u inner join sys.roles r on u.role_id = r.role_id where u.user_name = ?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
   public UserDao() {
	   System.out.println("inside UserDao class constructor");
  }
   
   public User findUser(String username) {
	   System.out.println("inside findUser Method");
	   User userObj = jdbcTemplate.queryForObject(USER_ROLES, new Object[] {username},new RowMapper<User>() {

		@Override
		public User mapRow(ResultSet rs, int rowNo) throws SQLException {
			System.out.println("inside mapRow method");
			User user = null;
			Roles roles = null;
			user = new User();
			user.setUserNo(rs.getInt("user_id"));
			user.setUsername(rs.getString("user_name"));
			user.setPassword(rs.getString("password"));
			user.setStatus(rs.getString("status"));
			roles = new Roles(rs.getInt("role_id") ,rs.getString("role_name"));
			user.setUserRoles(roles);
			return user;
		}
	});
	   return userObj;
   }
}
