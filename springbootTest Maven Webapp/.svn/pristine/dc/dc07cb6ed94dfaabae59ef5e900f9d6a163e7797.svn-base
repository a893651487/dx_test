/**
 * Copyright 2018 qmhd.com.cn Inc. All Rights Reserved. 
 * @Title Application.java
 * @Package com.anxinyiheng
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:08:33
 * @version V1.0
 */
package com.anxinyiheng;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title Application.java
 * @Package com.anxinyiheng
 * @Description: TODO:
 * @author eric
 * @date 2018年5月2日下午12:08:33
 * @version V1.0
 */
@SpringBootApplication
public class Application {

  @Resource
  DataSource dataSource;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  /**
   * 查看用了什么数据库连接池
   */
  public void run(String... args) throws Exception {
    System.out.println("DATASOURCE = " + dataSource);
  }
}
