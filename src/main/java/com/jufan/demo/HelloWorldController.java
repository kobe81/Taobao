package com.jufan.demo;

import com.jufan.demo.config.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

/**
 * @author hongtong
 * date: 2017/8/25
 */
@RestController
public class HelloWorldController {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/hello1")
    public String hello1(){
        return  "Hello World";
    }

    @RequestMapping("/hello2")
    public List<String> hello2() {
        return Arrays.asList(new String[]{"A","B","C"});
    }

    @RequestMapping("/")
    String index(){
       /* return "book name is:"+bookName+" and book author is:"+bookAuthor;*/
        return "book name is:"+ authorSettings.getName()+" and book author is:"+authorSettings.getAge();
    }


}
