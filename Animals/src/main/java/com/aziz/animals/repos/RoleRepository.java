package com.aziz.animals.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.animals.entities.Role;
public interface RoleRepository extends JpaRepository<Role, Long>  {

}
