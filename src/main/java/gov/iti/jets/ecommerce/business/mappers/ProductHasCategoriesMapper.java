package gov.iti.jets.ecommerce.business.mappers;//package gov.iti.jets.ecommerce.business.mappers;


import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import gov.iti.jets.ecommerce.business.dtos.CategoriesDTO;
import gov.iti.jets.ecommerce.business.dtos.ProductCategoriesDTO;
import gov.iti.jets.ecommerce.persistence.entities.Category;
import gov.iti.jets.ecommerce.persistence.entities.Product;


@Mapper(componentModel = "spring", uses = {CategoriesMapper.class} )
public interface ProductHasCategoriesMapper {


List<ProductCategoriesDTO> productToProductDto (List<Product> product);



// List<Product> productDtoToProduct (List<ProductCategoriesDTO> product);




}
