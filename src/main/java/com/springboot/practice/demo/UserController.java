package com.springboot.practice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Author: zky
 * Date: 2019-03-01
 * Time: 16:53:33
 * Description:
 */
@RestController
public class UserController
{
    @Value("${com.yes}")
    private String yes;

    @Autowired
    ConfigBean configBean;

    @Autowired
    ConfigTestBean configTestBean;


    @Value("${com.sercert.int}")
    private int a;
    @Value("${com.sercert.value}")
    private String b;
    @Value("${com.sercert.long}")
    private Long c;
    @Value("${com.sercert.uuid}")
    private String d;
    @Value("${com.sercert.intTopTen}")
    private int e;
    @RequestMapping("/hello")
    public String hello()
    {
        return ""+configBean.getName()+configBean.getTool()+configBean.getTool()+"::::::::::::::::"+yes;
    }


    @RequestMapping("/java")
    public String java()
    {
        return configTestBean.getAge()+" "+configTestBean.getName();
    }


    @RequestMapping("/a")
    public int compute()
    {
        return a;
    }


    @RequestMapping("/str")
    public String str()
    {
        return
                "random int:"+a+"\n"+
                "random value:"+b+"\n"+
                "random long:"+c+"\n"+
                "random uuid:"+d+"\n"+
                "random top ten:"+e+"\n"
                ;
    }

}
