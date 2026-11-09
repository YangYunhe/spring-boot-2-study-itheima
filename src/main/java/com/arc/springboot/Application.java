package com.arc.springboot;

import com.arc.springboot.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        HelloController bean = applicationContext.getBean(HelloController.class);
        System.out.println(bean);
    }

}
