package gov.iti.jets.ecommerce.presentation.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;
import gov.iti.jets.ecommerce.business.dtos.ResponseDTO;
import gov.iti.jets.ecommerce.business.services.ProductService;

@RestController
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    // Get All Products
    @GetMapping("/products")
    public ResponseDTO getAllProducts() {

        return new ResponseDTO("All products", "success", productService.getAllProducts());
      
    }

    // Get Product By ID
    @GetMapping("/products/{id}")
    public ResponseDTO getProduct(@PathVariable Integer id) {

        return new ResponseDTO("get Product by id","succes",productService.getProduct(id));
    }

    // Add Products
    // Authorization required ****Pending****
    @PostMapping("/products")
    public void addProduct(@RequestBody ProductCategoriesDTO productDTO) {

        productService.addProduct(productDTO);
    }

    // update product
    // Authorization required ****Pending****
    @PutMapping("/products")
    public void updateProduct(@RequestBody ProductCategoriesDTO productDTO) {

        productService.addProduct(productDTO);
    }

    // delete product by id
    // Authorization required ****Pending****
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Integer id) {

        // productService.deleteProduct(id);
    }



}