package com.soshiant.controller.login;


import com.soshiant.service.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.xml.ws.Response;


@CrossOrigin(origins = "/**")
@Controller
@RequestMapping("/springmvc")
public class LoginController {


    @Autowired
    private UserService userService;

    //===================================== Url : http://localhost:8080/springmvc/showLogin=============================
    @RequestMapping(value = {"index","/showLogin","/logout"},method = RequestMethod.GET)
    public ModelAndView showLoginForm()  {

        ModelAndView model = new ModelAndView("/login/login");
        return model;
    }
    //=============================== Url : http://localhost:8080/springmvc/springLogin=================================
    @RequestMapping(value = "/springLogin",method = RequestMethod.POST)
    public ModelAndView springLogin(@RequestParam(value= "username",required = true) String username,
                              @RequestParam(value= "password",required = true) String password) throws Exception {

        ModelAndView tempModel = new ModelAndView();
        boolean loginResult = userService.login(username,password);
        if (! loginResult){
            tempModel.setViewName("error");
            tempModel.setStatus(HttpStatus.NOT_ACCEPTABLE);
        }
        else {
            tempModel.setViewName("/dashboard/dashboard");
            tempModel.setStatus(HttpStatus.OK);
        }
        return tempModel;
    }
    //================================ Url : http://localhost:8080/springmvc/reactLogin=================================
    @RequestMapping(value = "/reactLogin",method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity reactLogin(@RequestParam(value= "username",required = true) String username,
                               @RequestParam(value= "password",required = true) String password) throws Exception {

        boolean loginResult = userService.login(username,password);
        String resBody = "{\"loginStatus\":\"" + loginResult+"\",\"loginUser\":\"" + username + "\"}";
        if (loginResult){
            System.out.println("login from React App successfully done, username : " + username);
            return new ResponseEntity(resBody , HttpStatus.OK);
        }
        else {
            System.out.println("login from React App failed, username : " + username);
            return new ResponseEntity(resBody , HttpStatus.UNAUTHORIZED);
        }
    }
    //================================== Url : http://localhost:8080/springmvc/logout===================================
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public RedirectView logout(RedirectAttributes attributes) {
        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
        attributes.addAttribute("attribute", "redirectWithRedirectView");
        return new RedirectView("/");
    }
    //================================== Url : http://localhost:8080/springmvc/logout===================================
    @RequestMapping(value = "/reactLogout",method = RequestMethod.POST)
    public ResponseEntity reactLogout(ModelMap model) throws Exception {
        return new ResponseEntity("{loginStatus:false}" , HttpStatus.OK);
    }
}
