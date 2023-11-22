package com.msemail.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.msemail.email.repositories"})
@SpringBootApplication()
public class MsEmailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEmailApplication.class, args);
    }

}
