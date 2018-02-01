package com.programeticdispatcher.beanconf.formauth.database.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {
	 private String username;
     private String password;
     private List<GrantedAuthority> authorities;
     protected boolean enabled;
 	 protected boolean locked;
 	 
	public UserDetailsImpl(String username ,String password ,String roleName , String status) {
		this.username = username;
		this.password = password;
		authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(roleName));
		if(status != null) {
			if(status.equalsIgnoreCase("a")) {
				enabled = true;
			}else if(status.equalsIgnoreCase("l")) {
				locked = true;
			}
		}
    	 System.out.println("inside UserDetailsImpl Constructor");
    	 
	}
     
    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		//true we need to change it to true from false
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

}
