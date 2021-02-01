package com.example.demo;

import com.example.demo.model.TUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("输出info");
		logger.debug("输出debug");
		logger.error("输出error");
	}

	@Autowired
	private com.example.demo.dao.other.SecendTUserMapper secendUserMapper;

	@Autowired
	private com.example.demo.dao.current.TUserMapper primaryUserMapper;

	@Test
	void testInsert() {

		TUser tUser = new TUser();
		tUser.setName("primary");
		int pInsert = primaryUserMapper.insert(tUser);

		tUser.setName("secend");
		int sInsert = secendUserMapper.insert(tUser);

		System.out.println(pInsert);
		System.out.println(sInsert);


	}


	@Test
	void test() {

		TUser pU = primaryUserMapper.selectByPrimaryKey(1);

		TUser sU = secendUserMapper.selectByPrimaryKey(1);

		System.out.println(pU);
		System.out.println(sU);
	}


}
