package gov.iti.jets.ecommerce.business.dtos;

import java.util.Date;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {

    private String userName;
    private String email;
    private String password;
    private String phone;
    private Boolean isMale;
    private Date dob;
    
}
