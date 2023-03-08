package gov.iti.jets.ecommerce.business.services;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;


public interface ProductService {
   
    public List<ProductCategoriesDTO> getAllProducts();
    public Optional<ProductCategoriesDTO> getProduct(Integer id);
    public void addProduct (ProductCategoriesDTO productDTO);
    public void deleteById(Integer id);


}
