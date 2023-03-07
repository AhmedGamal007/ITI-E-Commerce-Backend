package gov.iti.jets.ecommerce.business.servicesImpl;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import gov.iti.jets.ecommerce.business.dtos.AdminRegisterDTO;
import gov.iti.jets.ecommerce.business.mappers.AdminMapper;
import gov.iti.jets.ecommerce.business.services.AdminService;
import gov.iti.jets.ecommerce.persistence.entities.Admin;
import gov.iti.jets.ecommerce.persistence.repositories.AdminRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class AdminServiceImpl  implements AdminService {
    private final AdminRepo adminRepo;
    private final AdminMapper adminMapper;


    @Override
    public AdminDTO find(String username, String password) {
       Admin admin =  adminRepo.findAdminByUserNameAndPassword(username , password);
       if (admin != null){

       return  adminMapper.adminToAdminDto(admin);
       }
       return null;
    }

    @Override
    public AdminDTO find(Integer id) {

        Optional <Admin> admin = adminRepo.findById(id);
        return admin.map(adminMapper::adminToAdminDto).orElse(null);
    }

    @Override
    public AdminDTO add(AdminRegisterDTO adminRegisterDTO) {
       Admin admin =  adminRepo.save(adminMapper.adminRegisterDtoToAdmin(adminRegisterDTO));
        return adminMapper.adminToAdminDto(admin);
    }

    @Override
    public void delete(AdminDTO adminDTO) {
        adminRepo.delete(adminMapper.adminDtoToAdmin(adminDTO));
    }

    @Override
    public AdminDTO update(AdminDTO adminDTO) {
        Admin admin = adminRepo.save(adminMapper.adminDtoToAdmin(adminDTO));
        return  adminMapper.adminToAdminDto(admin);
    }


}
