package gov.iti.jets.ecommerce.business.servicesImpl;

import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;
import gov.iti.jets.ecommerce.business.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<CustomerDTO> getAll() {
        return null;
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
