package gov.iti.jets.ecommerce.persistence.repositories;

import gov.iti.jets.ecommerce.persistence.entities.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrdersRepo extends JpaRepository<Orders , Integer> {

    @Query(value = "select * from orders where cust_id = ? and is_submitted = false" , nativeQuery = true)
    public Orders getCart(Integer id);
}