package com.food.service;

import org.springframework.ui.ModelMap;

public interface FoodService {
    public String login(String email, String password, ModelMap model);
}
