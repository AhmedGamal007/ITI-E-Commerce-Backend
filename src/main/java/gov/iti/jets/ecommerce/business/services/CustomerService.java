package gov.iti.jets.ecommerce.business.services;
import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;

import java.util.List;

public interface CustomerService {
    public List<CustomerDTO> getAll();
    public CustomerDTO get(Integer id);
    public CustomerDTO get(String userName , String password);
    public CustomerDTO add(CustomerDTO customerDTO);
    public boolean delete(Integer customerId);
    public boolean delete(CustomerDTO customerDTO);
    public CustomerDTO update(CustomerDTO customerDTO);
}
