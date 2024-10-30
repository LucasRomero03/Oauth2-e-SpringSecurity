package com.devsuperior.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.devsuperior.demo.Projections.UserDetailsProjection;
import com.devsuperior.demo.entities.Role;
import com.devsuperior.demo.entities.User;
import com.devsuperior.demo.repositories.UserReposiroty;

public class UserService implements UserDetailsService {

  @Autowired
  private UserReposiroty userReposiroty;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    List<UserDetailsProjection> result = userReposiroty.searchUserAndRolesByEmail(username);

    if (result.size()==0) {
      throw new UsernameNotFoundException("user not found");
    }

    User user = new User();
    user.setEmail(username);
    user.setPassword(result.get(0).getPassword());
    for (UserDetailsProjection projection : result) {
        user.addRole(new Role(projection.getRoleId(), projection.getAuthority()));
    }

    return user;
  }
  
}
