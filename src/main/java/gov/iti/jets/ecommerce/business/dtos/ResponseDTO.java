package gov.iti.jets.ecommerce.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {
    String message;
    boolean status;
    Integer code;
    Object data;
    
    public ResponseDTO(String message, boolean status, Integer code) {
        this.message = message;
        this.status = status;
        this.code = code;
    }

    
}
