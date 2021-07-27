package com.xiang.learn.propertiesBean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Xiang
 **/
@Data
@Component
@ConfigurationProperties(prefix = "user")
public class UserBean {
    private String lastName;
    private Integer age;
    private Map<String,String> maps;
    private List<Integer> list;
}
