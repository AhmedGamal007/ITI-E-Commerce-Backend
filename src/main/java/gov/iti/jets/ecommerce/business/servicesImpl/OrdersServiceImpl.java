package gov.iti.jets.ecommerce.business.servicesImpl;

import java.util.List;

import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;
import gov.iti.jets.ecommerce.persistence.repositories.OrdersRepo;

public class OrdersServiceImpl {

    private final OrdersRepo ordersRepo;
    public OrdersServiceImpl(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }
    // public List<OrdersDTO> getAllOrders() {
    //     return ordersRepo.findAll();
    // }
    public List<OrdersDTO> getAllOrders() {
        return null;
    }
    
}
