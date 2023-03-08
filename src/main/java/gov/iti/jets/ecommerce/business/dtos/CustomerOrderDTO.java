package gov.iti.jets.ecommerce.business.dtos;

import java.util.Set;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrderDTO {

    private Integer id;
    private Set<AddressDTO> addresses;
    private String userName;
    private String email;
    private double walletLimit;
    private String phone;

}
