package gov.iti.jets.ecommerce.presentation.controllers;

import gov.iti.jets.ecommerce.business.services.CustomerService;
import gov.iti.jets.ecommerce.business.dtos.CustomerDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    final private CustomerService customerService;

    @ResponseBody
    @GetMapping("/{id}")
    public CustomerDTO getProfile(@PathVariable Integer id){
    return customerService.find(id);
    }

    @ResponseBody
    @GetMapping("/all")
    public List<CustomerDTO> getAllCustomers(){
        return customerService.getAll();
    }

   @PostMapping
   public CustomerDTO addCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.add(customerDTO);
   }
    @DeleteMapping
    public void delete(@RequestBody CustomerDTO customerDTO){
        customerService.delete(customerDTO);
    }
    @PutMapping
    public CustomerDTO update(@RequestBody CustomerDTO customerDTO){
        return customerService.update(customerDTO);
    }
}
