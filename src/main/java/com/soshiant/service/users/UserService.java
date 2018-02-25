package com.soshiant.service.users;


import com.soshiant.model.user.UserInfo;

import java.util.List;

public interface UserService {

    public boolean login(String userName, String password);

    public boolean saveNewUser(UserInfo userInfo);

    public List<UserInfo> getUsersList();

}
