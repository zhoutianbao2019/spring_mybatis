package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    List<Account> selectAll();

    @Select(" select * from account where id = #{id}")
    Account selectById(Integer id);

    int insert(Account account);


    int update(Account account);
}
