package com.yohersa.controller;

import com.yohersa.model.Order;
import com.yohersa.model.Product;
import com.yohersa.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/order")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/list")
    public List<Order> getAllOrders(){
        return orderService.findAllOrders();
    }

    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order){
        return  orderService.saveOrder(order);
    }


}
