package gov.iti.jets.ecommerce.business.mappers;
import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;
import gov.iti.jets.ecommerce.persistence.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> customerListToCustomerDtoList (List<Customer> customers);
    List<Customer> customerDtoListToCustomerList(List<CustomerDTO> customerDTOS);
}
