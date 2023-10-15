package org.example.service.impl;


import org.example.mapper.AccountMapper;
import org.example.pojo.Account;
import org.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceeImpl implements AccountService  {

    @Value("${name}")
    String userName;

    @Autowired
    AccountMapper mapper;


    @Override
    public void save() {


        System.out.println("service save");
    }

    @Override
    public Account selectById(int id) {
        return  mapper.selectById(id);
    }


}
