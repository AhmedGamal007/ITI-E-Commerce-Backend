package gov.iti.jets.ecommerce.business.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsOrderDTO {

    private Integer pro_id;
    private String name;
    private String description;
    private Double price;
    private Integer amount;
}
