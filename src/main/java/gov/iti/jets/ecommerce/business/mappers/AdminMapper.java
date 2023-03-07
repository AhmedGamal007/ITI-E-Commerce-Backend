package gov.iti.jets.ecommerce.business.mappers;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import gov.iti.jets.ecommerce.business.dtos.AdminRegisterDTO;
import gov.iti.jets.ecommerce.persistence.entities.Admin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdminMapper {

    AdminDTO adminToAdminDto(Admin admin);

    Admin adminDtoToAdmin(AdminDTO adminDTO);

    Admin adminRegisterDtoToAdmin(AdminRegisterDTO adminRegisterDTO);
}
