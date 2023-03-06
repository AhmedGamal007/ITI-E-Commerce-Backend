package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;
import gov.iti.jets.ecommerce.business.servicesImpl.OrdersServiceImpl;

public class OrdersController {
    
    private final OrdersServiceImpl ordersServiceImpl;

    public OrdersController(OrdersServiceImpl ordersServiceImpl) {
        this.ordersServiceImpl = ordersServiceImpl;
    }

    @GetMapping("/orders")
    List<OrdersDTO> getAllOrders(){
        return ordersServiceImpl.getAllOrders();
    }
}
