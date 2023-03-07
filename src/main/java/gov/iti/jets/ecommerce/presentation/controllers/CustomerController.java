package gov.iti.jets.ecommerce.presentation.controllers;

import gov.iti.jets.ecommerce.business.services.CustomerService;
import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @ResponseBody
    @GetMapping
    public CustomerDTO getProfile(){
    return customerService.find(2);
    }
}
