package gov.iti.jets.ecommerce.business.mappers;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.ecommerce.business.dtos.ProductsOrderDTO;
import gov.iti.jets.ecommerce.persistence.entities.OrderHasProduct;

@Mapper
public interface ProductOrderMapper {
    
    ProductOrderMapper mapper = Mappers.getMapper(ProductOrderMapper.class);

    Set<ProductsOrderDTO> ordersProductToOrderProductDTO (Set<OrderHasProduct> product);
   
    Set<OrderHasProduct> orderProductDTOToOrdersProduct (Set<ProductsOrderDTO> productDTO);
}
