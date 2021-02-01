package com.example.demo;

import com.example.demo.dao.current.TUserMapper;
import com.example.demo.dao.other.SecendTUserMapper;
import com.example.demo.model.TUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	static Logger logger = LoggerFactory.getLogger(DemoApplication.class.getName());


    @Autowired
    SecendTUserMapper secendTUserMapper;
    @Autowired
    TUserMapper tUserMapper;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



    @PostMapping("testInsert")
    void testInsert() {

        TUser tUser = new TUser();
        tUser.setName("primary");
        int pInsert = tUserMapper.insert(tUser);

        tUser.setName("secend");
        int sInsert = secendTUserMapper.insert(tUser);

        System.out.println(pInsert);
        System.out.println(sInsert);


    }

    @GetMapping("testSelect")
    void getResult() {

        System.out.println(tUserMapper.selectByPrimaryKey(1));
        System.out.println(secendTUserMapper.selectByPrimaryKey(1));
    }


}
