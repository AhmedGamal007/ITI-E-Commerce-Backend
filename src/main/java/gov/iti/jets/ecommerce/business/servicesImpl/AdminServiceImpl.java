package gov.iti.jets.ecommerce.business.servicesImpl;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import gov.iti.jets.ecommerce.business.mappers.AdminMapper;
import gov.iti.jets.ecommerce.business.services.AdminService;
import gov.iti.jets.ecommerce.persistence.entities.Admin;
import gov.iti.jets.ecommerce.persistence.repositories.AdminRepo;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl  implements AdminService {
    private final AdminRepo adminRepo;

    public AdminServiceImpl(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }

    @Override
    public AdminDTO findAdmin(String username, String password) {
       Admin admin =  adminRepo.findAdminByUserNameAndPassword(username , password);
       if(admin != null){
           AdminDTO adminDTO = AdminMapper.INSTANCE.adminToAdminDto(admin);
           return adminDTO;
       }
       return null;
    }


}
