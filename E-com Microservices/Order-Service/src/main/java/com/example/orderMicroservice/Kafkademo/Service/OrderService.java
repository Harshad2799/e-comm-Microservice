package com.example.orderMicroservice.Kafkademo.Service;

import com.example.orderMicroservice.Kafkademo.DTO.OrderDetailDto;
import com.example.orderMicroservice.Kafkademo.Entity.OrderDetails;
import com.example.orderMicroservice.Kafkademo.Repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderDetailDto> getAllOrders(){
        List<OrderDetails> orders = orderRepository.findAll();
        List<OrderDetailDto> orderList = new ArrayList<>();
        orders.forEach(ord -> {
            OrderDetailDto order = new OrderDetailDto();
            BeanUtils.copyProperties(ord, order);
            orderList.add(order);
        });
        return orderList;
    }

    public OrderDetails getOrderById(Long Id){
        return orderRepository.findById(Id).orElseThrow(()
                -> new RuntimeException("Order Not Found For Order Id" + Id));

    }
}
