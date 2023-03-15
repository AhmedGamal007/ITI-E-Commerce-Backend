package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.iti.jets.ecommerce.business.dtos.OrderProductDTO;
import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;
import gov.iti.jets.ecommerce.business.dtos.ResponseDTO;
import gov.iti.jets.ecommerce.business.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    // Get All Products
    @GetMapping
    public ResponseDTO getAllProducts() {

        return new ResponseDTO("All products", true, 200, productService.getAllProducts());

    }

    // // Get Stock Of Product By ID
    // @GetMapping("/stock/{id}")
    // public ResponseDTO getStockById(@PathVariable Integer id){
    //     return new ResponseDTO("stock", true, 200, productService.getStockById(id));
    // }

    // Get Product By ID
    @GetMapping("/{id}")
    public ResponseDTO getProduct(@PathVariable Integer id) {

        return new ResponseDTO("product", true, 200, productService.getProduct(id));
    }

    // Authorization required ****Pending****
    @PostMapping("/stock")
    public ResponseDTO checkStockProduct(@RequestBody List<OrderProductDTO> productDTO) {

        return new ResponseDTO("Update Product Successfully", true, 200, this.productService.checkStockProduct(productDTO));
    }

     // Authorization required ****Pending****
     @PutMapping("/stock")
     public void updateStockProduct(@RequestBody List<OrderProductDTO> productDTO) {
 
         this.productService.updateStockProduct(productDTO);
     }



    // Add Products
    // Authorization required ****Pending****
    @PostMapping
    public ResponseDTO addProduct(@RequestBody ProductCategoriesDTO productDTO) {

        this.productService.addProduct(productDTO);
        return new ResponseDTO("Update Product Successfully", true, 200);
    }

    // update product
    // Authorization required ****Pending****
    @PutMapping
    public ResponseDTO updateProduct(@RequestBody ProductCategoriesDTO productDTO) {

        this.productService.updateProduct(productDTO);
        return new ResponseDTO("Update Product Successfully", true, null);
    }

    // delete product by id
    // Authorization required ****Pending****
    @DeleteMapping
    public ResponseDTO deleteProduct(@PathVariable Integer id) {

        this.productService.deleteProduct(id);
        return new ResponseDTO("Delete Product Successfully", true, null);
    }



}