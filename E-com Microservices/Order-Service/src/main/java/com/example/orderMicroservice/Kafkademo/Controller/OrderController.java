package com.example.orderMicroservice.Kafkademo.Controller;


import com.example.orderMicroservice.Kafkademo.DTO.OrderDetailDto;
import com.example.orderMicroservice.Kafkademo.Entity.OrderDetails;
import com.example.orderMicroservice.Kafkademo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getAllOrders")
    public List<OrderDetailDto> getAllOrder(){
        return orderService.getAllOrders();
    }

    @RequestMapping("/getOrderById/{id}")
    public OrderDetails getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @RequestMapping("/createOrder")
    public OrderDetailDto createOrder(){
        return new OrderDetailDto();
    }
}
