package gov.iti.jets.ecommerce.business.mappers;

import gov.iti.jets.ecommerce.business.dtos.AddressDTO;
import gov.iti.jets.ecommerce.persistence.entities.Address;

public class AddressMapper {
    
    public AddressDTO addresstoDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setArea(address.getArea());
        addressDTO.setBuildingNum(address.getBuildingNum());
        addressDTO.setFloorNum(address.getFloorNum());
        addressDTO.setId(address.getId());
        addressDTO.setStreet(address.getStreet());
        return addressDTO ;
    }

    public Address AdressDTOtoAddress(AddressDTO addressDTO){
        Address address = new Address();
        address.setArea(addressDTO.getArea());
        address.setBuildingNum(addressDTO.getBuildingNum());
        address.setFloorNum(addressDTO.getFloorNum());
        address.setId(addressDTO.getId());
        address.setStreet(addressDTO.getStreet());
        return address;
    }
    
}
