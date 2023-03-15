package gov.iti.jets.ecommerce.persistence.repositories;
import gov.iti.jets.ecommerce.persistence.entities.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {
 
    @Query(value = " select * from product where name like name " ,nativeQuery = true)
    Product getProductByName(String name);


    @Query(value = "From Product p WHERE p.isDeleted = false ")
    List<Product> findAllProducts();


    @Modifying
    @Transactional
    @Query(value = "UPDATE Product p SET p.isDeleted = true WHERE p.id = :id")
    void deleteProductById(Integer id);
}
