package gov.iti.jets.ecommerce.business.mappers;


import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import gov.iti.jets.ecommerce.business.dtos.OrdersDTO;
import gov.iti.jets.ecommerce.business.dtos.ProductsOrderDTO;
import gov.iti.jets.ecommerce.persistence.entities.OrderHasProduct;
import gov.iti.jets.ecommerce.persistence.entities.Orders;

@Mapper(componentModel = "spring")
public interface OrdersMapper {


     // @Mapping(target = "addressDTO" ,source = "address")
     // @Mapping(target  = "customerDTO" ,source  = "customer")
     // OrdersDTO OrdersEntitytoDto(Orders orders);

     // @Mapping(source = "customerDTO" ,target  = "customer")
     // @Mapping(source = "addressDTO" ,target  = "address")
     // Orders OrdersDTOtoEntity(OrdersDTO ordersDTO);

     // @Mapping(source = "orderHasProducts" ,target  = "orderHasProducts.product")
     // Set<ProductsOrderDTO> map(Set<OrderHasProduct> set);
     
//     AddressMapper addressMapper = new AddressMapper();
//     ProductOrderMapper productOrderMapper;
//     public OrdersDTO maptoDto(Orders orders){
//         OrdersDTO ordersDTO = new OrdersDTO();
//         ordersDTO.setId(orders.getId());
//         ordersDTO.setIsSubmitted(orders.getIsSubmitted());
//         ordersDTO.setPaymentType(orders.getPaymentType());
//         ordersDTO.setOrderHasProducts(productOrderMapper.ordersProductToOrderProductDTO(orders.getOrderHasProducts()));
//         ordersDTO.setTotalPrice(orders.getTotalPrice());
//         ordersDTO.setAddressDTO(addressMapper.addresstoDTO(orders.getAddress()));
//         return ordersDTO;
//    }

//    public Orders maptoEntity(OrdersDTO ordersDTO){
//         Orders orders = new Orders();
//         orders.setId(ordersDTO.getId());
//         orders.setIsSubmitted(ordersDTO.getIsSubmitted());
//         orders.setOrderHasProducts(productOrderMapper.orderProductDTOToOrdersProduct(ordersDTO.getOrderHasProducts()));
//         orders.setPaymentType(ordersDTO.getPaymentType());
//         orders.setTotalPrice(ordersDTO.getTotalPrice());
//         orders.setAddress(addressMapper.AdressDTOtoAddress(ordersDTO.getAddressDTO()));

//         return orders;
//    }


}
