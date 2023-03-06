package gov.iti.jets.ecommerce.business.mappers;

import gov.iti.jets.ecommerce.business.dtos.ProductsOrderDTO;
import gov.iti.jets.ecommerce.persistence.entities.OrderHasProduct;
import gov.iti.jets.ecommerce.persistence.entities.OrderHasProductId;

public class ProductOrderMapper {
 
    public ProductsOrderDTO orderHasProductsOrderDTO(OrderHasProduct orderHasProduct) {

        ProductsOrderDTO productsOrderDTO = new ProductsOrderDTO();
        productsOrderDTO.setAmount(orderHasProduct.getAmount());
        return productsOrderDTO;
    }
    
}
