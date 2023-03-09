package gov.iti.jets.ecommerce.business.servicesImpl;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;
import gov.iti.jets.ecommerce.business.services.OrdersService;
import gov.iti.jets.ecommerce.persistence.repositories.OrdersRepo;

public class OrdersServiceImpl implements OrdersService {

    private final OrdersRepo ordersRepo;
    public OrdersServiceImpl(OrdersRepo ordersRepo) {
        this.ordersRepo = ordersRepo;
    }

    
    public List<OrdersDTO> getAllOrders() {
        return ordersRepo.findAll();
    }

    public Optional<OrdersDTO> getOrderById(Integer id) {
        return ordersRepo.findById(id);
    }

    public void addOrder(OrdersDTO ordersDTO) {
        ordersRepo.save(ordersDTO);
    }

    public void removeOrder(Integer id) {
        ordersRepo.deleteById(id);
    }
}
