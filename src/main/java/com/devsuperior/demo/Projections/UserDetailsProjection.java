package com.devsuperior.demo.Projections;

public interface UserDetailsProjection {
  String getUsername();

  String getPassword();

  Long getRoleId();

  String getAuthority();
}
