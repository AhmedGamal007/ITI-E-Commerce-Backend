package gov.iti.jets.ecommerce.business.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper mapper = Mappers.getMapper(ProductMapper.class);
   
    
}
