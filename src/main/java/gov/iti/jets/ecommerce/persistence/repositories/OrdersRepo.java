package gov.iti.jets.ecommerce.persistence.repositories;

import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<OrdersDTO , Integer> {
}
