package com.springboot.practice.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2019-03-01
 * Time: 17:13:23
 * Description:
 */
@Configuration
@ConfigurationProperties(prefix = "com.m")
@PropertySource("classpath:test.properties")
public class ConfigTestBean
{
    private String name;
    private String age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }
}
