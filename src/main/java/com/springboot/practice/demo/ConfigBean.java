package com.springboot.practice.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2019-03-01
 * Time: 16:50:24
 * Description:
 */
@ConfigurationProperties(prefix = "com.language")
public class ConfigBean
{
    private String name;
    private String tool;
    private String method;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTool()
    {
        return tool;
    }

    public void setTool(String tool)
    {
        this.tool = tool;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }
}
