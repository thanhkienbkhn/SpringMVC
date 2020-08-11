package com.tk.controller;

import com.tk.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView homePage(){
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

    @RequestMapping(value = "/spring-mvc", method = RequestMethod.GET)
    public ModelAndView springMvcPage(){
        ModelAndView mav = new ModelAndView("spring-mvc");
        return mav;
    }
}
