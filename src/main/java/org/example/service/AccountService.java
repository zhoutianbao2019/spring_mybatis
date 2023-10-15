package org.example.service;

import org.example.pojo.Account;

public interface AccountService {
    void save();
    Account selectById(int id);

}
