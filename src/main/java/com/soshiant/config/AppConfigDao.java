package com.soshiant.config;


import com.soshiant.repository.UserDao;
import com.soshiant.repository.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.soshiant.repository"})
public class AppConfigDao {

    //==================================================================================================================
    @Bean(name="userDao")
    public UserDao userDao() {
        return new UserDaoImpl();
    }
    //==================================================================================================================
}
