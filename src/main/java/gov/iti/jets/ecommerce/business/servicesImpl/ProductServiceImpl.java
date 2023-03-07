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

    // public Optional<ProductCategoriesDTO> getProduct(Integer id) {
    
    //         return productRepo.findById(id).map(productMapper::productToProductDto);

    // }

    // public void addProduct (ProductDTO productDTO){

    //     productRepo.save
    // }

}
