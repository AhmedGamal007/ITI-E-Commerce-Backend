package gov.iti.jets.ecommerce.business.dtos;

import java.util.HashSet;
import java.util.Set;

import gov.iti.jets.ecommerce.persistence.entities.Category;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategoriesDTO {
   
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String imagePath;
    private Double rate;
    private Set<Category> categories = new HashSet<Category>(0);
    
}
