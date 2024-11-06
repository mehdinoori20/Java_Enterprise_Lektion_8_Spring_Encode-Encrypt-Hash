package com.mehdi.Enterprise_Lektion_56_Spring_Security_Intro.controller;


import com.mehdi.Enterprise_Lektion_56_Spring_Security_Intro.config.AppPasswordConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

   private final AppPasswordConfig appPasswordConfig;

   @Autowired
    public TestController(AppPasswordConfig appPasswordConfig) {
       this.appPasswordConfig = appPasswordConfig;
   }

   @GetMapping("/hash")
    public String testHash() {

       return appPasswordConfig.bycryptPasswordEncoder().encode("123");
   }

}