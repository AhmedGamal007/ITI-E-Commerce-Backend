package gov.iti.jets.ecommerce.business.mappers;
import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;
import gov.iti.jets.ecommerce.persistence.entities.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> customerListToCustomerDtoList (List<Customer> customers);
    List<Customer> customerDtoListToCustomerList(List<CustomerDTO> customerDTOS);
}
