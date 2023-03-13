package gov.iti.jets.ecommerce.presentation.controllers;


import javax.management.RuntimeErrorException;

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
    @Autowired
    private ResponseDTO responseDTO;
    
    @GetMapping
    public ResponseDTO getAll() {
        responseDTO.setMessage("all categories");
        responseDTO.setStatus("ok");
        responseDTO.setData(categoriesService.getAll());
        return responseDTO;
    }

    // get category by id
    @GetMapping("{id}")
    public ResponseEntity<CategoriesProductDTO> getById(@PathVariable int id) {
        
            // return categoriesService.getById(id);
            return new ResponseEntity<>(categoriesService.getById(id), HttpStatus.OK);
        
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

    @PutMapping
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
