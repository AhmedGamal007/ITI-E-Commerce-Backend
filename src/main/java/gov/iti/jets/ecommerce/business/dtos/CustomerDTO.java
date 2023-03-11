package gov.iti.jets.ecommerce.business.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Integer id;
    private String username;
    private Boolean isMale;
    private double walletLimit;
    
}
