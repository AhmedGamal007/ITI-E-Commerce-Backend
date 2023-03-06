// package gov.iti.jets.ecommerce.business.mappers;

// import java.util.List;

// import org.mapstruct.Mapper;
// import org.mapstruct.Mapping;
// import org.mapstruct.Named;
// import org.mapstruct.factory.Mappers;

// import gov.iti.jets.ecommerce.business.dtos.CategoriesDTO;
// import gov.iti.jets.ecommerce.persistence.entities.Category;
// import gov.iti.jets.ecommerce.persistence.repositories.CategoriesRepo;

// @Mapper(componentModel = "spring" , uses = ProductMapper.class)
// public interface CategoriesMapper {

//  CategoriesMapper mapper = Mappers.getMapper(CategoriesMapper.class);

//  List<CategoriesDTO> categoriesToCategoriesDto (List<Category> product);


//  List<Category> categoriesDtoToCategories (List<CategoriesDTO> productDTO);

// }