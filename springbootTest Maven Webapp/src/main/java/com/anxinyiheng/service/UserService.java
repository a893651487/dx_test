/**
* Copyright 2018 qmhd.com.cn Inc. All Rights Reserved. 
* @Title UserService.java
* @Package com.anxinyiheng.service
* @Description: TODO:
* @author eric
* @date 2018年5月2日下午12:09:21
* @version V1.0
*/
package com.anxinyiheng.service;

import java.util.List;

import com.anxinyiheng.entity.User;

/**
 * @Title UserService.java
 * @Package com.anxinyiheng.service
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:09:21
 * @version V1.0
 */
public interface UserService {
  public List<User> getUserInfo();  
  public void insert(User user);  
}
