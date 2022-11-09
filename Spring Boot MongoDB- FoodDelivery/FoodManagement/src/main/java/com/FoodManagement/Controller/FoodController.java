package com.FoodManagement.Controller;

import com.FoodManagement.Repository.FoodRepository;
import com.FoodManagement.Servcie.FoodService;
import com.FoodManagement.model.FoodDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class FoodController {

    @Autowired
    private FoodService service;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FoodRepository repo;

    @PostMapping("/add")
    public FoodDetails addFood(@RequestBody FoodDetails details){
        return service.addFood(details);
    }

    @GetMapping("/get")
    public ResponseEntity<List<FoodDetails>> getAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/get/{rid}")
    public List<FoodDetails> getFood(@PathVariable int rid){
        return repo.findByRid(rid);
    }
}
