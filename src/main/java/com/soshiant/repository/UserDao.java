package com.soshiant.repository;


import com.soshiant.model.user.UserInfo;

import java.util.List;

public interface UserDao {

    public UserInfo getUserInfo(String userName);

    public List<UserInfo> getAllUsers();

    public boolean saveNewUser(UserInfo userInfo);
}
