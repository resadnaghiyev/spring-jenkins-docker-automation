package com.rashad.springjenkinsdockerautomation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockerAutomationApplication {

    @GetMapping
    public String message(){
        return "Welcome to Jenkins Docker Automation";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsDockerAutomationApplication.class, args);
    }

}
