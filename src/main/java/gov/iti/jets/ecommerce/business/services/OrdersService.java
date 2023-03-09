package gov.iti.jets.ecommerce.business.services;

import java.util.List;
import java.util.Optional;


import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;

public interface OrdersService  {
    public List<OrdersDTO> getAllOrders();
    public Optional<OrdersDTO> getOrderById(Integer id);
    public void addOrder(OrdersDTO ordersDTO);
    public void removeOrder(Integer id);
}
