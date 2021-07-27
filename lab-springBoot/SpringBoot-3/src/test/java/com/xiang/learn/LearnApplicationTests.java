package com.xiang.learn;

import com.xiang.learn.propertiesBean.PersonBean;
import com.xiang.learn.propertiesBean.User1Bean;
import com.xiang.learn.propertiesBean.UserBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnApplicationTests {

    @Autowired
    UserBean userBean;
//    @Autowired
//    User1Bean user1Bean;
//    @Autowired
//    PersonBean personBean;

    @Test
    void contextLoads() {
        System.out.println(userBean);
//        System.out.println(user1Bean);
//        System.out.println(personBean);
    }

}
