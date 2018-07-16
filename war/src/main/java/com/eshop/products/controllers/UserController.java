package com.eshop.products.controllers;
import com.eshop.products.entities.Account;
import com.eshop.products.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

/*    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {

        ModelAndView model = new ModelAndView();
        model.setViewName("login");

        return model;
    }*/

        @RequestMapping(value = "/login", method = RequestMethod.GET)
        public String login (Model model, String error, String logout){
            if (error != null)
                model.addAttribute("error", "Your username and password is invalid.");
            if (logout != null)
                model.addAttribute("message", "You have been logged out successfully.");
            model.addAttribute("current", "/WEB-INF/views/login.jsp");
            return "login";

        }
    }

