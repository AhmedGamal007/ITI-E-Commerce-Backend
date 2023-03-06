package gov.iti.jets.ecommerce.business.mappers;//package gov.iti.jets.ecommerce.business.mappers;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.ecommerce.business.dtos.CategoriesDTO;
import gov.iti.jets.ecommerce.business.dtos.ProductDTO;
import gov.iti.jets.ecommerce.persistence.entities.Category;
import gov.iti.jets.ecommerce.persistence.entities.Product;

@Mapper(componentModel = "spring" )
public interface ProductMapper {

 ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

 List<ProductDTO> productToProductDto (List<Product> product);

 List<Product> productDtoTOProduct (List<ProductDTO> productDTO);

    

}


