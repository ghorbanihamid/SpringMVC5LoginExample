package com.soshiant.service.users;


import com.soshiant.model.user.UserInfo;
import com.soshiant.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    //==================================================================================================================
    public boolean login(String userName, String password) {

        UserInfo userInfo = userDao.getUserInfo(userName);
        return userInfo != null && userInfo.getPassword().equals(password);
    }
    //======================================================================================================================
    public boolean saveNewUser(UserInfo userInfo) {

        userDao.saveNewUser(userInfo);
        return true;
    }

    //======================================================================================================================
    public List<UserInfo> getUsersList(){

        List<UserInfo> userInfoList = userDao.getAllUsers();
        return userInfoList;
    }
}

