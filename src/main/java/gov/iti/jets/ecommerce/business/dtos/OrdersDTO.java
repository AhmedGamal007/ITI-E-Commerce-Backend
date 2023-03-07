package gov.iti.jets.ecommerce.business.dtos;

import java.sql.Timestamp;
import java.util.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersDTO {

    private Integer id;
    private Double totalPrice = 0.0;
    private Boolean isSubmitted = false;
    private String paymentType;
    private Timestamp submitDate;
    private CustomerDTO customerDTO;
    private AddressDTO addressDTO;
    private Set<ProductsOrderDTO> orderHasProducts = new HashSet<ProductsOrderDTO>(0);
    
}
