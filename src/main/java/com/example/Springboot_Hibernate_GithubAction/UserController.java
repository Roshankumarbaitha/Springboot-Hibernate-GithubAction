package com.example.Springboot_Hibernate_GithubAction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
 @GetMapping("/test")
 public String test()
 {
     return"this is sample test ";
 }
}
