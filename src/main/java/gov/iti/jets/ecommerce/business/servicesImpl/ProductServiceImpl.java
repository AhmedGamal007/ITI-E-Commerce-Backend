package gov.iti.jets.ecommerce.business.servicesImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.iti.jets.ecommerce.business.dtos.CategoriesDTO;
import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;
import gov.iti.jets.ecommerce.business.mappers.ProductHasCategoriesMapper;
import gov.iti.jets.ecommerce.business.services.ProductService;
import gov.iti.jets.ecommerce.persistence.entities.Product;
import gov.iti.jets.ecommerce.persistence.repositories.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ProductHasCategoriesMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo, ProductHasCategoriesMapper productMapper ) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
    
    }

    public List<ProductCategoriesDTO> getAllProducts() {

        return productMapper.productToProductDto(productRepo.findAll());

    }

    public Optional<ProductCategoriesDTO> getProduct(Integer id) {
           
           Optional<Product> product = productRepo.findById(id);

           if (product.isEmpty()){
            // throwing an exception
           }
      
            return (product.map(productMapper::productToProductDtoId));

    }

    public void addProduct (ProductCategoriesDTO productDTO){

        productRepo.save(productMapper.productDtoToProduct(productDTO));
    }

}
