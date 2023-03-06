package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.iti.jets.ecommerce.business.dtos.ProductDTO;
import gov.iti.jets.ecommerce.business.services.ProductService;

@RestController
public class ProductsController {


    private final ProductService productService ;

    public ProductsController (ProductService productService){
        this.productService=productService;
    }


   @GetMapping("/products")
    public List<ProductDTO> getAllProducts(){

         return productService.getAllProducts();
    }
    
}