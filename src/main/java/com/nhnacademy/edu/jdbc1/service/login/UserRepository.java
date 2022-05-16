package com.nhnacademy.edu.jdbc1.service.login;

import com.nhnacademy.edu.jdbc1.domain.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
    boolean findByIdAndPwd(int id,String pwd);
}
