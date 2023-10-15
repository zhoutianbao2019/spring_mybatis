package org.example;

import org.example.config.SpringConfig;
import org.example.mapper.AccountMapper;

import org.example.pojo.Account;
import org.example.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
    public static void main(String[] args) throws IOException {


        AnnotationConfigApplicationContext  context= new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService service= context.getBean(AccountService.class);

        Account account = service.selectById(11);

        System.out.println(account);
        context.close();

    }
}
