package gov.iti.jets.ecommerce.presentation.controllers;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping
    @ResponseBody
    public AdminDTO getAdmin(){
        AdminDTO admin = new AdminDTO();
        admin.setId(5);
        admin.setUserName("mohamed");
        return  admin;
    }
    
}
