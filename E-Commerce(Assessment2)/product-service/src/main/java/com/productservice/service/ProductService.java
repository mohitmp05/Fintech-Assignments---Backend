package com.productservice.service;

import com.productservice.dao.ProductRepository;
import com.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    List<Product> list = List.of(
            new Product(101,"Bed", 20000,"Furniture"),
            new Product(102,"Sofa", 80000,"Furniture"),
            new Product(103,"Laptop", 45000,"Electronics"),
            new Product(104,"Mobile", 15000,"Electronics"),
            new Product(105,"Television", 60000,"Electronics"),
            new Product(106,"Table", 7000,"Furniture"),
            new Product(107,"T-shirt", 800,"Apparel"),
            new Product(108,"Shirt", 2000,"Apparel"),
            new Product(109,"Dinner Set", 5000,"Kitchen"),
            new Product(110,"Gas Stove", 6000,"Kitchen")
    );

    public void showProducts(){
        repository.saveAll(list);
    }
}
