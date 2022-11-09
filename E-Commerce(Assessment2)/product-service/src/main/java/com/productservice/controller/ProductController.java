package com.productservice.controller;

import com.productservice.dao.ProductRepository;
import com.productservice.model.Product;
import com.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private ProductRepository repository;

    @GetMapping("/")
    public List<Product> getProducts(){
        service.showProducts();
        return repository.findAll();
    }

    @GetMapping("/getname/{pid}")
    public String getProductName(@PathVariable int pid){
        return repository.findById(pid).get().getPname();
    }

    @GetMapping("/getprice/{pid}")
    public Integer getProductPrice(@PathVariable int pid){
        return repository.findById(pid).get().getPrice();
    }

    @GetMapping("/{category}")
    public List<Product> getProductsByCategory(@PathVariable String category){
        return repository.findByCategory(category);
    }
}
