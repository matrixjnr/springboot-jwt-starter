package eu.vfvirtual.starter.service.impl;

import java.util.List;

import eu.vfvirtual.starter.model.User;
import eu.vfvirtual.starter.repository.UserRepository;
import eu.vfvirtual.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public User findByUsername(String username) throws UsernameNotFoundException {
    User u = userRepository.findByUsername(username);
    return u;
  }

  public User findById(Long id) throws AccessDeniedException {
    User u = userRepository.findById(id).orElse(null);
    return u;
  }

  public List<User> findAll() throws AccessDeniedException {
    List<User> result = userRepository.findAll();
    return result;
  }
}
