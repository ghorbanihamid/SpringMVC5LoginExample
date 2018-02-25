package com.soshiant.service.welcome;


public class WelcomeServiceImpl implements WelcomeService {



    //==================================================================================================================
    public String getWelcomeMessage(String name) {

        if(name == null || name.equals( "")){
            System.out.println("Empty Message");
            return "";
        }
        System.out.println("Welcome Message is : Hello " + name +"!");
        return "Hello " + name + "!";
    }
    //======================================================================================================================
}

