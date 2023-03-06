package gov.iti.jets.ecommerce.persistence.repositories;
import gov.iti.jets.ecommerce.persistence.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {
 
    @Query(value = " select * from product where name like name " ,nativeQuery = true)
    Product getProductByName(String name);
    
}
