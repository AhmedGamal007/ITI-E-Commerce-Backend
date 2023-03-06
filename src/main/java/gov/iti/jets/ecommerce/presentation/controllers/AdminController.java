package gov.iti.jets.ecommerce.presentation.controllers;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import gov.iti.jets.ecommerce.business.mappers.AdminMapper;
import gov.iti.jets.ecommerce.persistence.entities.Admin;
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
        Admin  admin = new Admin();
        admin.setId(5);
        admin.setUserName("addd");
        admin.setPassword("5555");
        AdminDTO adminDto = AdminMapper.INSTANCE.adminToAdminDto(admin);
        adminDto.setUserName("mohamed");
        return  adminDto;
    }
    
}
