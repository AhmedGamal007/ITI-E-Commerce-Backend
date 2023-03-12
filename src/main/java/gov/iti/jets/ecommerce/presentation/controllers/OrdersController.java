package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;
import gov.iti.jets.ecommerce.business.dtos.ResponseDTO;
import gov.iti.jets.ecommerce.business.servicesImpl.OrdersServiceImpl;

@RestController
@RequestMapping("order")
public class OrdersController {

    private final OrdersServiceImpl ordersServiceImpl;

    public OrdersController(OrdersServiceImpl ordersServiceImpl) {
        this.ordersServiceImpl = ordersServiceImpl;
    }

    @GetMapping("/orders")
    List<OrdersDTO> getAllOrders() {
        return ordersServiceImpl.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseDTO getOrderById(@PathVariable Integer id) {

        return new ResponseDTO("order", true, 200, ordersServiceImpl.getOrderById(id));
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<List<OrdersDTO>> getCustomerOrderById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(ordersServiceImpl.getCustomerOrders(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public void addOrder(@RequestBody OrdersDTO ordersDTO) {
        ordersServiceImpl.addOrder(ordersDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(Integer id) {
        ordersServiceImpl.removeOrder(id);
    }

    @PutMapping
    public void updateOrder(@RequestBody OrdersDTO ordersDTO) {
        ordersServiceImpl.updateOrder(ordersDTO);
    }

}
