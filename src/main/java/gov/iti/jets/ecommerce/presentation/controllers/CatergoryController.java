package gov.iti.jets.ecommerce.presentation.controllers;

import java.util.List;

import javax.management.RuntimeErrorException;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.iti.jets.ecommerce.business.dtos.CategoriesProductDTO;
import gov.iti.jets.ecommerce.business.dtos.ResponseDTO;
import gov.iti.jets.ecommerce.business.services.CategoriesService;

@RestController
@RequestMapping("/category")
public class CatergoryController {
    @Autowired
    private CategoriesService categoriesService;


    // get all categories
    @RolesAllowed("CUSTOMER")
    @GetMapping
    public ResponseDTO getAll() {
       
        return new ResponseDTO("All products", true, 200,  categoriesService.getAll());
       
    }

    // get category by id
    @GetMapping("{id}")
    public ResponseDTO getById(@PathVariable int id) {
       
        return new ResponseDTO("All products", true, 200, categoriesService.getById(id));
        
    }

    @PostMapping
    public void addCategory(@RequestBody CategoriesProductDTO category) {

        try {
            categoriesService.addCategory(category);
        } catch (Exception e) {
            // make your own custom exception!!!!!!!!!
            throw new RuntimeErrorException(null);
        }

    }

    @PutMapping()
    public void updateCategory(@RequestBody CategoriesProductDTO category) {

        categoriesService.addCategory(category);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteCategory(@PathVariable int id) {
        try {
            categoriesService.deleteById(id);
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteAllCategory() {

        try {
            categoriesService.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
