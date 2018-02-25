package com.soshiant.model.user;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper  implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserFirstName(resultSet.getString("UserFirstName"));
        userInfo.setUserLastName(resultSet.getString("UserLastName"));
        userInfo.setUsername(resultSet.getString("username"));
        userInfo.setPassword(resultSet.getString("password"));

        return null;
    }
}
