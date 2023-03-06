package gov.iti.jets.ecommerce.business.services;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {

    public AdminDTO findAdmin(String username, String password);
}
