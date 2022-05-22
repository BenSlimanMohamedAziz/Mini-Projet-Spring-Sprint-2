package com.aziz.animals.service;
import java.util.List;

import com.aziz.animals.entities.User;

public interface UsersService {
    List <User> findAll();
    
    User saveUser(User u);
    User updateUser(User u);
    void deleteUser(User u);
     void deleteUserById(Long id);
     User getUser(Long idUser);

}
