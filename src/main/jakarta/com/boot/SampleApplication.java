package com.boot;

import com.boot.controller.SampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author CHENGRui
 * @Since 2018/5/30
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.boot.mapper"})
public class SampleApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
