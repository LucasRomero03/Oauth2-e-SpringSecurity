package com.devsuperior.demo.dto;

//esta parado pois iria tentar fazer sem usar o sql raiz quando puder testar voce faz, por enquanto nao teste vai perder tempo
public class UserDetailsDTO {

  private String userName;
  private String password;
  private Long roleId;
  private String authority;

  



  public UserDetailsDTO(String userName, String password, Long roleId, String authority) {
    this.userName = userName;
    this.password = password;
    this.roleId = roleId;
    this.authority = authority;
  }
 

  public UserDetailsDTO() {
  }
 
  public String getPassword() {
    return password;
  }
  public Long getRoleId() {
    return roleId;
  }
  public String getAuthority() {
    return authority;
  }
  public String getUserName() {
    return userName;
  }


  @Override
  public String toString() {
    return "UserDetailsDTO [userName=" + userName + ", password=" + password + ", roleId=" + roleId + ", authority="
        + authority + "]";
  }


  

}
