package com.atguigu.gmall.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  
  @GetMapping
  public String github(){
    return "hello";
  }
}
