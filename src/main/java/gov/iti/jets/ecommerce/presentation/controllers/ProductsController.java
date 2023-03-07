package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;
import gov.iti.jets.ecommerce.business.services.ProductService;

@RestController
public class ProductsController {


    private final ProductService productService ;

    public ProductsController (ProductService productService){
        this.productService=productService;
    }

   // Get All Products
   @GetMapping("/products")
    public List<ProductCategoriesDTO> getAllProducts(){

         return productService.getAllProducts();
    }

    //Get Product By ID
//     @GetMapping("/products/{id}")
//     public Optional<ProductCategoriesDTO> getProduct(@PathVariable Integer id){

//          return productService.getProduct(id);
//     }

    //Add Products 
    // Authorization required ****Pending****
    // @PostMapping("/products")
    // public void addProduct (@RequestBody ProductDTO productDTO){
      
    //     if(productDTO.getId() != null){
         // throw an exception
    //     }
    //     else{
    //         productService.addProduct(productDTO);
    //     }

    // }

    
}