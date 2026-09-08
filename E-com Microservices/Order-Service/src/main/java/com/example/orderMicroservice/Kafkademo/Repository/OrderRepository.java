package com.example.orderMicroservice.Kafkademo.Repository;

import com.example.orderMicroservice.Kafkademo.Entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Long>{


}
