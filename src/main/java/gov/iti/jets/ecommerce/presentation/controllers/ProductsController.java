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
        try {
            return new ResponseDTO("product", "success", productService.getProduct(id));
        } catch (Exception ex) {
            return new ResponseDTO("product not found", "failed", null);
        }
    }

    // Add Products
    // Authorization required ****Pending****
    @PostMapping("/products")
    public ResponseDTO addProduct(@RequestBody ProductCategoriesDTO productDTO) {
        try {
            return new ResponseDTO("Update Product Successfully", "success", null);
        } catch (Exception ex) {
            return new ResponseDTO("Update Product Failed", "failed", null);
        }
    }

    // update product
    // Authorization required ****Pending****
    @PutMapping("/products")
    public ResponseDTO updateProduct(@RequestBody ProductCategoriesDTO productDTO) {
        try {
            return new ResponseDTO("Update Product Successfully", "success", null);
        } catch (Exception ex) {
            return new ResponseDTO("Update Product Failed", "failed", null);
        }
    }

    // delete product by id
    // Authorization required ****Pending****
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Integer id) {

        // productService.deleteProduct(id);
    }

}