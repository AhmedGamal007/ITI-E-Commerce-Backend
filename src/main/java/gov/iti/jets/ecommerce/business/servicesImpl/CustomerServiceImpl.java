package gov.iti.jets.ecommerce.business.servicesImpl;

import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;
import gov.iti.jets.ecommerce.business.mappers.CustomerMapper;
import gov.iti.jets.ecommerce.business.services.CustomerService;
import gov.iti.jets.ecommerce.persistence.repositories.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private  final CustomerMapper customerMapper;
    private  final CustomerRepo customerRepo;

    @Override
    public List<CustomerDTO> getAll(){
        return  customerMapper.customerListToCustomerDtoList(customerRepo.findAll());
    }

    @Override
    public CustomerDTO get(Integer id) {
        return null;
    }

    @Override
    public CustomerDTO get(String userName, String password) {
        return null;
    }

    @Override
    public CustomerDTO add(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public boolean delete(Integer customerId) {
        return false;
    }

    @Override
    public boolean delete(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public CustomerDTO update(CustomerDTO customerDTO) {
        return null;
    }
}
