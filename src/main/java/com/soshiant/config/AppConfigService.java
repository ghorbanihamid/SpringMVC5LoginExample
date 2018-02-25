package com.soshiant.config;


import com.soshiant.service.users.UserService;
import com.soshiant.service.users.UserServiceImpl;
import com.soshiant.service.welcome.WelcomeService;
import com.soshiant.service.welcome.WelcomeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.soshiant.service"})
public class AppConfigService {

    //==================================================================================================================
    @Bean(name="welcomeService")
    public WelcomeService welcomeService() {
        return new WelcomeServiceImpl();
    }
    //==================================================================================================================
    @Bean(name="userService")
    public UserService userService() {
        return new UserServiceImpl();
    }
    //==================================================================================================================
}
