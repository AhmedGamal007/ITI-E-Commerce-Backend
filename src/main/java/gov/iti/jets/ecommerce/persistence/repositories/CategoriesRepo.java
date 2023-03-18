package gov.iti.jets.ecommerce.persistence.repositories;

import gov.iti.jets.ecommerce.persistence.entities.Category;
import gov.iti.jets.ecommerce.persistence.entities.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriesRepo extends JpaRepository<Category , Integer> {
    @Query(value = "From Category c INNER JOIN c.products p WHERE c.isDeleted = false and p.isDeleted = false order by c.name")
    List<Category> findAllCategories();


    @Modifying
    @Transactional
    @Query(value = "UPDATE Category c SET c.isDeleted = true WHERE c.id = :id")
    void deleteCategoryById(Integer id);

    
}
