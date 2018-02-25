package com.soshiant.service.welcome;


import org.springframework.stereotype.Service;

@Service
public interface WelcomeService {

    public String getWelcomeMessage(String name);

}
