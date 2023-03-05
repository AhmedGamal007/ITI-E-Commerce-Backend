package gov.iti.jets.ecommerce.business.dtos;

import java.util.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriesDTO {
    
    private Integer id;
    private String name;
    private String description;
    private Set<ProductDTO> products = new HashSet<ProductDTO>(0);
}
