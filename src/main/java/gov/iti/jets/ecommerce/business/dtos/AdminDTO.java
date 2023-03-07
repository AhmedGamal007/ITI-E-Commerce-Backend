package gov.iti.jets.ecommerce.business.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDTO {

    private Integer id;
    private String userName;
    private String email;
    private String phone;

}
