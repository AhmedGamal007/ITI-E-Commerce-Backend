package gov.iti.jets.ecommerce.business.dtos;

import java.util.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String imagePath;
    private Double rate;
    private Set<CategoriesDTO> categories = new HashSet<CategoriesDTO>(0);
    
}
