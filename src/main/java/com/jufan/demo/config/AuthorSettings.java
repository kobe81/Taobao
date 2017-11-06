package com.jufan.demo.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hongtong
 * date: 2017/8/25
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {

    private String name;
   private Long age;

    public String getName() {
        return name;
    }

    public AuthorSettings setName(String name) {
        this.name = name;
        return this;
    }

    public Long getAge() {
        return age;
    }

    public AuthorSettings setAge(Long age) {
        this.age = age;
        return this;
    }
}

