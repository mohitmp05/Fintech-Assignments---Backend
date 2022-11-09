package com.core.amazonupdated.controller;

import com.core.amazonupdated.model.UserDetails;
import com.core.amazonupdated.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping("/get")
    public ResponseEntity<List<UserDetails>> getAll(){
        return ResponseEntity.ok(userservice.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDetails> findById(@PathVariable Long id){
        return ResponseEntity.ok(userservice.findById(id).orElse(null));
    }

    @PostMapping("/add")
    public ResponseEntity<UserDetails> addAll(@RequestBody UserDetails us){
        return ResponseEntity.ok(userservice.save(us));
    }

    @PutMapping("/update")
    public ResponseEntity<UserDetails> update(@RequestBody UserDetails us){
        return ResponseEntity.ok(userservice.save(us));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<UserDetails> delete(@PathVariable Long id){
        userservice.findById(id).ifPresent(userservice::delete);
        return ResponseEntity.ok().build();
    }
}
