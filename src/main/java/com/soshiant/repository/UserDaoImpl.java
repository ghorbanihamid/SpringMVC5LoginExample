package com.soshiant.repository;


import com.soshiant.model.user.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //==================================================================================================================
    public UserInfo getUserInfo(String userName) {

        String sqlText = "select * from UserInfo where username = ?";

        UserInfo userInfo = null;
        try{
            userInfo = jdbcTemplate.queryForObject(sqlText,new Object[]{userName},new BeanPropertyRowMapper<>(UserInfo.class));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return userInfo;
    }
    //==================================================================================================================
    public List<UserInfo> getAllUsers() {

        String sqlText = "select * from UserInfo";

        try{
           List<UserInfo> userInfoList = jdbcTemplate.query(sqlText,new BeanPropertyRowMapper<>(UserInfo.class));
           return  userInfoList;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //==================================================================================================================
    public boolean saveNewUser(UserInfo userInfo) {

        String sqlText = "INSERT INTO UserInfo(UserFirstName,UserLastName, Username, password) VALUES (?, ?, ?, ?)";
        try{
            jdbcTemplate.update(sqlText,new Object[]{userInfo.getUserFirstName(),userInfo.getUserLastName(),userInfo.getUsername(),userInfo.getPassword()});
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    //==================================================================================================================
}
