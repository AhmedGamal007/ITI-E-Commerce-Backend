package gov.iti.jets.ecommerce.business.services;

import java.util.List;


import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;

public interface OrdersService  {
    public List<OrdersDTO> getAllOrders();
    public OrdersDTO getOrderById(Integer id);
    public void addOrder(OrdersDTO ordersDTO);
    public void removeOrder(Integer id);
    public OrdersDTO getCart(Integer id);
    public void updateOrder(OrdersDTO ordersDTO);
}
