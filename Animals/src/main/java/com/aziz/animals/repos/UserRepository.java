package com.aziz.animals.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aziz.animals.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}