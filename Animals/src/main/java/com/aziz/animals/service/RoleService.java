package com.aziz.animals.service;

import java.util.List;

import com.aziz.animals.entities.Role;

public interface RoleService {
	 List <Role> findAll();
	    
	 Role saveRole(Role r);
	 Role updateRole(Role r);
	     Role getRole (Long idRole);
}
