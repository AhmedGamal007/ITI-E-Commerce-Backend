package gov.iti.jets.ecommerce.persistence.repositories;

import gov.iti.jets.ecommerce.persistence.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AddressRepo extends JpaRepository<Address,Integer> {
    Set<Address> findAllByCustomerId(Integer id);
}
