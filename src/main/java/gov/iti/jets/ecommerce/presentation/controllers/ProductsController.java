package gov.iti.jets.ecommerce.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

   @GetMapping("/test")
    public String test(){

        return "ka3ooooooooood";
    }
    
}
