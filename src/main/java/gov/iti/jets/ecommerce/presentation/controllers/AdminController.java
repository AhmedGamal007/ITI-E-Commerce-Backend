package gov.iti.jets.ecommerce.presentation.controllers;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import gov.iti.jets.ecommerce.business.dtos.AdminRegisterDTO;
import gov.iti.jets.ecommerce.business.services.AdminService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;



@AllArgsConstructor
@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;



//    @GetMapping
//    @ResponseBody
//    public AdminDTO getAdmin(){
//        return  adminService.find("mohamed","123456");
//    }

    @PostMapping
    @ResponseBody
    public  AdminDTO add(@RequestBody AdminRegisterDTO adminRegisterDTO){
        return  adminService.add(adminRegisterDTO);
    }

    
}
