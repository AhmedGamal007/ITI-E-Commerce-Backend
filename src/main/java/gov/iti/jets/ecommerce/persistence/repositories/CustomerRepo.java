package gov.iti.jets.ecommerce.persistence.repositories;

import gov.iti.jets.ecommerce.persistence.entities.Admin;
import gov.iti.jets.ecommerce.persistence.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    Customer findCustomerByUsernameAndPassword(String userName , String password);

    Optional<Customer> findCustomerByUsername(String userName);
}
