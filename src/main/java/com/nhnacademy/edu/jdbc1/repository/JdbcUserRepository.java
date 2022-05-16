package com.nhnacademy.edu.jdbc1.repository;

import com.nhnacademy.edu.jdbc1.DBUtils;
import com.nhnacademy.edu.jdbc1.domain.User;
import com.nhnacademy.edu.jdbc1.service.login.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserRepository implements UserRepository {
    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from JdbcUsers");){
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                list.add(new User(resultSet.getInt(1),resultSet.getString(3)));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean findByIdAndPwd(int id,String pwd){
        try(Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from JdbcUsers where  id = ?, pwd = ?");){
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,pwd);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
