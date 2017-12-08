/**
 * 
 */
package com.myjava.test;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myjava.entity.AccountInfo;
import com.myjava.service.AccountInfoService;

/**
 * @author dingjunjie
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-mybatis.xml"})
public class TestMybatis {

	private static Logger logger = Logger.getLogger(TestMybatis.class); 
	
	@Autowired
	private AccountInfoService accountInfoService;
	
	@Test
	public void test(){
		logger.info("开始根据id查询数据库");
		AccountInfo entity = accountInfoService.getAccountInfoById(1);
		logger.info("查询结束");
	}
}
