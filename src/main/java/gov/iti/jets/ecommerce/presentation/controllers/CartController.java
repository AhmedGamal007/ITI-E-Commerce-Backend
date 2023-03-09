package gov.iti.jets.ecommerce.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;
import gov.iti.jets.ecommerce.business.services.OrdersService;


@RestController
@RequestMapping("/cart")
public class CartController {

    private final OrdersService ordersService;

    public CartController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/{id}")
    public OrdersDTO getCart(@PathVariable Integer id) {
        return ordersService.getCart(id);
    }
}
