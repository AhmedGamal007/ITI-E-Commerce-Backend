package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zaxxer.hikari.pool.ProxyDatabaseMetaData;
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

    // Get Product By ID
    @GetMapping("/products/{id}")
    public Optional<ProductCategoriesDTO> getProduct(@PathVariable Integer id){

         return productService.getProduct(id);
    }

       // Add Products 
       // Authorization required ****Pending****
    @PostMapping("/products")
    public void addProduct (@RequestBody ProductCategoriesDTO productDTO){

            productService.addProduct(productDTO);
    }

        // update product
        @PutMapping("/products")
        public void updateProduct (@RequestBody ProductCategoriesDTO productDTO){
    
            productService.addProduct(productDTO);
    }

        // update product
        @PutMapping("/products")
        public void updateProduct (@RequestBody ProductCategoriesDTO productDTO){
    
            productService.addProduct(productDTO);
        }
    
        // delete product by id
        @DeleteMapping("/products/{id}")
        public void deleteProduct (@PathVariable Integer id){
    
              productService.deleteProduct(id);
    }

    
}