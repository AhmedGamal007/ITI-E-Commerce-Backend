package gov.iti.jets.ecommerce.business.mappers;

import gov.iti.jets.ecommerce.business.dtos.AdminDTO;
import gov.iti.jets.ecommerce.persistence.entities.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    AdminMapper INSTANCE = Mappers.getMapper(AdminMapper.class);


    @Mapping(source = "id" , target = "id")
    AdminDTO adminToAdminDto(Admin admin);

    Admin adminDtoToAdmin(AdminDTO adminDTO);
}
