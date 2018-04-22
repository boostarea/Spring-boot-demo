package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chenr
 * @date: 2018/4/22
 */
@RestController
public class FirstController {

    @Value("${com.chen.title}")
    private String title;

    @RequestMapping("/")
    public String firstTest() {
        return "Hello " + title;
    }

}
