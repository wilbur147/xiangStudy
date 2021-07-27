package com.xiang.learn.propertiesBean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Xiang
 **/
@Data
@Component
//@ConfigurationProperties(prefix = "user")
public class User1Bean {
    @Value("${user1.lastName}")
    private String lastName;
    @Value("${user1.age}")
    private Integer age;
    @Value("#{${user1.maps}}")
    private Map<String,String> maps;
    @Value("#{'${user1.list}'.split(',')}")
    private List<Integer> list;
}
