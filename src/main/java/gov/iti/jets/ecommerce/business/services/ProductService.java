package gov.iti.jets.ecommerce.business.services;

import java.util.List;
import java.util.Optional;

import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;


public interface ProductService {
   
    public List<ProductCategoriesDTO> getAllProducts();
    List<ProductCategoriesDTO> findALlProducts();
    public Optional<ProductCategoriesDTO> getProduct(Integer id);
    public void addProduct (ProductCategoriesDTO productDTO);
    public void updateProduct (ProductCategoriesDTO productDTO);
    public void deleteProduct (Integer id);


}
