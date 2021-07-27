package com.xiang.learn.propertiesBean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @author Wilbur
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "person")
@PropertySource(value = "classpath:person.properties")
public class PersonBean {
    private String lastName;
    private Integer age;
    private Map<String,String> maps;
    private List<Integer> list;

}
