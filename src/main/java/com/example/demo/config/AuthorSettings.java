package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wt on 17/9/3.
 */
@Component
@ConfigurationProperties(prefix = "author")//locations={"classpath:config/author.properties"} 指定properties文件位置
public class AuthorSettings {

    private String name;
    private Long age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
