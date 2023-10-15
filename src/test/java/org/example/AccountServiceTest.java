package org.example;

import org.example.config.SpringConfig;
import org.example.pojo.Account;
import org.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    AccountService accountService;

    @Test
    public void testGet(){

        Account account = accountService.selectById(11);

        System.out.println(account);
    }

}
