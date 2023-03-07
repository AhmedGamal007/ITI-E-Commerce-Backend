package gov.iti.jets.ecommerce.business.services;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;


public interface ProductService {
   
     List<ProductCategoriesDTO> getAllProducts();
     Optional<ProductCategoriesDTO> getProduct(Integer id);
     void addProduct (ProductCategoriesDTO productDTO);


}
