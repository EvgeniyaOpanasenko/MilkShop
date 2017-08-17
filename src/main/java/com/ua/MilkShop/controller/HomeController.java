package com.ua.MilkShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class HomeController {

    @RequestMapping("/hello")
    public String index() {
        /*ModelAndView mav = new ModelAndView();
        mav.setViewName("index.html");
        return mav;*/

        //return "redirect:/app/login";
        return "hello from may first shop!";
    }

    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }
}
