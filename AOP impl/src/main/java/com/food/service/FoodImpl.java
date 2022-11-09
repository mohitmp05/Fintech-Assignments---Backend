package com.food.service;

import com.food.dao.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class FoodImpl implements FoodService {

	@Autowired
	CustomerRepo repo;

	@Override
	public String login(String email, String password, ModelMap model) {
		if(repo.existsByEmail(email)){
			if(repo.findByEmail(email).getPassword().equals(password)){
				model.put("customerName",repo.findByEmail(email).getFirstName());
				return "welcome.jsp";
			}
			else {
				model.put("errorMsg","Please provide correct credentials and try again.");
				return "login.jsp";
			}
		}
		else {
			model.put("errorMsg","Please provide correct credentials and try again.");
			return "login.jsp";
		}
	}
}

