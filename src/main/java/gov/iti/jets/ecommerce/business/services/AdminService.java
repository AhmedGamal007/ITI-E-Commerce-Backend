package gov.iti.jets.ecommerce.business.services;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import gov.iti.jets.ecommerce.business.dtos.AdminRegisterDTO;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    public AdminDTO find(String username, String password);
    public AdminDTO find(Integer id);
    public AdminDTO add(AdminRegisterDTO adminRegisterDTO);
    public void delete(AdminDTO adminDTO);
    public AdminDTO update(AdminDTO adminDTO);

}
