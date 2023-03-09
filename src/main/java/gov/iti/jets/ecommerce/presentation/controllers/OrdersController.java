package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @GetMapping("/order/{id}")
    public Optional<OrdersDTO> getOrderById(@PathVariable Integer id){
        return ordersServiceImpl.getOrderById(id);
    }

    @PostMapping("/product")
    public void addOrder(@RequestBody OrdersDTO ordersDTO){
        ordersServiceImpl.addOrder(ordersDTO);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(Integer id) {
        ordersServiceImpl.removeOrder(id);
    }

}
