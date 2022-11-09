package com.food.controller;

import com.food.dao.CustomerRepo;
import com.food.model.Customer;
import com.food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

    @Autowired
    CustomerRepo repo;

    @Autowired
    FoodService foodService;

    @RequestMapping("")
    public String viewHomePage(){
        return "index.jsp";
    }

    @RequestMapping("/register")
    public String home(){
        return "home.jsp";
    }

    @PostMapping("/addUser")
    public String addCustomer(@ModelAttribute Customer customer){
        repo.save(customer);
        return "/getUser";
    }

    @RequestMapping("/getUser")
    public ModelAndView getCustomer(){
        ModelAndView mv = new ModelAndView("registered.jsp");
        return mv;
    }

    @RequestMapping("/login")
    public String login(String email, String password, ModelMap model) {
        return foodService.login(email, password, model);
    }
}
