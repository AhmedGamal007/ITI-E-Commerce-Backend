package gov.iti.jets.ecommerce.business.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.iti.jets.ecommerce.business.dtos.ProductDTO;
import gov.iti.jets.ecommerce.business.mappers.ProductMapper;
import gov.iti.jets.ecommerce.business.services.ProductService;
import gov.iti.jets.ecommerce.persistence.repositories.ProductRepo;
import org.mapstruct.Mapper;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepo productRepo ,ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper=productMapper;
    }

 
    public List<ProductDTO> getAllProducts() {

     return productMapper.mapper.productToProductDto(productRepo.findAll());

    }

}
