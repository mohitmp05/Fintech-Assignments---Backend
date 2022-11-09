package com.orderdetails.dao;

import com.orderdetails.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDetails,Integer> {
}
