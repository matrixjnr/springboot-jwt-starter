package eu.vfvirtual.starter.service;


import eu.vfvirtual.starter.model.User;

import java.util.List;


public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
