package com.FoodManagement.Servcie;

import com.FoodManagement.Repository.FoodRepository;
import com.FoodManagement.model.FoodDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repo;

    public FoodDetails addFood(FoodDetails details){
        return repo.save(details);
    }
}
