package com.nelioalves.workshopmongo.dto;

import java.io.Serializable;

import com.nelioalves.workshopmongo.domain.User;

public class UserDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	public String id;
	public String name;
	public String email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User obj) {
		id = obj.id;
		name = obj.name;
		email = obj.email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
