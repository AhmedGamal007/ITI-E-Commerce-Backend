package gov.iti.jets.ecommerce.persistence.repositories;

import gov.iti.jets.ecommerce.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User , Integer> {

    Optional<User> findUserByUsername(String userName);
    Optional<User> findUserByEmail(String email);
  
}
