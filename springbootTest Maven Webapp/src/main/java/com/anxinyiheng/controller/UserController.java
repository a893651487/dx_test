/**
 * Copyright 2018 qmhd.com.cn Inc. All Rights Reserved. 
 * @Title UserController.java
 * @Package com.anxinyiheng.controller
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:08:43
 * @version V1.0
 */
package com.anxinyiheng.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.anxinyiheng.entity.User;
import com.anxinyiheng.service.UserService;

/**
 * @Title UserController.java
 * @Package com.anxinyiheng.controller
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:08:43
 * @version V1.0
 */
@Controller
@RequestMapping
public class UserController {

  @Resource
  private UserService userService;

  @RequestMapping("/")
  public String index(ModelMap modelMap) {
    System.out.println("index");
    modelMap.put("msg", "SpringBoot Ajax 示例");
    return "/html/index";
  }

  @RequestMapping("/home")
  @ResponseBody
  public String home() {
    return "home";
  }

  @RequestMapping("/data")
  @ResponseBody
  public List<User> data() {
    List<User> list = new ArrayList<User>();

    for (long i = 0; i < 10; i++) {
      User user = new User();
      user.setId(i + 1);
      user.setName("springboot" + i);
      list.add(user);
    }

    return list;
  }

  @RequestMapping("/getUserInfo")
  public List<User> getUserInfo() {
    List<User> user = userService.getUserInfo();
    System.out.println(user.toString());
    return user;
  }

  @RequestMapping("/addUserInfo")
  public String addUserInfo() {
    User user = new User();
    user.setName("cwh");
    userService.insert(user);
    return "success:" + user.toString();
  }
}
