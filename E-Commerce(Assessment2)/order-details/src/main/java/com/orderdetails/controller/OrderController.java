package com.orderdetails.controller;

import com.orderdetails.dao.OrderRepository;
import com.orderdetails.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderRepository repository;

    @GetMapping("/{pid}/{username}")
    public String order(@PathVariable int pid, @PathVariable String username){
        String customerName = restTemplate.getForObject("http://customer-service/" + username, String.class);
        String productName = restTemplate.getForObject("http://product-service/products/getname/" + pid, String.class);
        String productPrice = restTemplate.getForObject("http://product-service/products/getprice/" + pid, String.class);
        String order = "Thanks "+customerName+", Your Order for "+productName+" of price ₹"+productPrice+", has been placed and will be shipped shortly.";
        OrderDetails orderDetails = new OrderDetails(productName,customerName);
        repository.save(orderDetails);
        return order;
    }
}
