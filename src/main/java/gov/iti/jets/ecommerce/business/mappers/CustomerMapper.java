package gov.iti.jets.ecommerce.business.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;
import gov.iti.jets.ecommerce.persistence.entities.Customer;

@Mapper
public interface CustomerMapper {
    

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> customerListToCustomerDtoList (List<Customer> customers);
    List<Customer> customerDtoListToCustomerList(List<CustomerDTO> customerDTOS);
}
