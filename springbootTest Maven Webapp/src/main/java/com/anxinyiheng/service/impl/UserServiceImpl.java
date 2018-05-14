/**
 * Copyright 2018 qmhd.com.cn Inc. All Rights Reserved. 
 * @Title UserServiceImpl.java
 * @Package com.anxinyiheng.service.impl
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:09:11
 * @version V1.0
 */
package com.anxinyiheng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anxinyiheng.entity.User;
import com.anxinyiheng.mapper.UserMapper;
import com.anxinyiheng.mapper2.User1Mapper;
import com.anxinyiheng.service.UserService;

/**
 * @Title UserServiceImpl.java
 * @Package com.anxinyiheng.service.impl
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:09:11
 * @version V1.0
 */
@Service
public class UserServiceImpl implements UserService{

  @Resource
  private UserMapper userMapper;
  
  @Resource
  private User1Mapper user1Mapper;

  public List<User> getUserInfo() {
    return userMapper.findUserInfo();
  }

  public void insert(User user) {
    userMapper.addUserInfo(user);
    user1Mapper.addUserInfo(user);
  }
}
