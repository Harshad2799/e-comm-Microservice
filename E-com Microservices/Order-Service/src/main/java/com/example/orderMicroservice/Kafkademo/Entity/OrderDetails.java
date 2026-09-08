package com.example.orderMicroservice.Kafkademo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity(name = "ORDER_DETAIL")
@Data
public class OrderDetails {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column
    private Long userId;
    @Column
    private String userName;
    @Column
    private String paymentId;
    @Column
    private Long productDetails;
    @Column
    private Date orderDate;
    @Column
    private String deliveryStatus;
    @Column
    private Date deliveryDate;
    @Column
    private String deliveryAddress;


}
