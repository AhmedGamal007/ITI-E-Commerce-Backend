package gov.iti.jets.ecommerce.business.mappers;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.web.servlet.FlashMapManager;

import gov.iti.jets.ecommerce.business.dtos.CategoriesDTO;
import gov.iti.jets.ecommerce.persistence.entities.Category;


@Mapper(componentModel = "spring" )
public interface CategoriesMapper {

    List<CategoriesDTO> categoriesToCategoriesDto (List<Category> category);

    List<Category> categoriesDtoToCategories (List<CategoriesDTO> category);

  
    }
