/**
 * Copyright 2018 qmhd.com.cn Inc. All Rights Reserved. 
 * @Title User.java
 * @Package com.anxinyiheng.entity
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:08:52
 * @version V1.0
 */
package com.anxinyiheng.entity;

/**
 * @Title User.java
 * @Package com.anxinyiheng.entity
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:08:52
 * @version V1.0
 */
public class User {
  private Long id;
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    User user = (User) o;

    if (id != null ? !id.equals(user.id) : user.id != null)
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }
}
