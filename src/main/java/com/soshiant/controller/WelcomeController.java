package com.soshiant.controller;


import com.soshiant.service.welcome.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;
    //==================================================================================================================
    @RequestMapping(value = {"","/","/index"}, method = RequestMethod.GET)
    public ModelAndView index()  {

        ModelAndView model = new ModelAndView("index");
        return model;
    }
    //==================================================================================================================
    @RequestMapping(value = {"","/reactExample"}, method = RequestMethod.GET)
    public ModelAndView reactExample()  {

        ModelAndView model = new ModelAndView("reactExample");
        return model;
    }
    //==================================================================================================================
    @RequestMapping(value = {"/welcome"}, method = RequestMethod.GET)
    public ModelAndView welcome(@RequestParam("name") String name, ModelMap modelMap)  {

        ModelAndView model = new ModelAndView("welcome");
        String message = welcomeService.getWelcomeMessage(name);
        if(message != null && message != "") {
            modelMap.addAttribute("message",message);
            model.setStatus(HttpStatus.OK);
        }
        else
            model.setStatus(HttpStatus.BAD_REQUEST);

        return model;
    }
    //==================================================================================================================
}
