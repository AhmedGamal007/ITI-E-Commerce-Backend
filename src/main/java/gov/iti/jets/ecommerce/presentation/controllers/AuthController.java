package gov.iti.jets.ecommerce.presentation.controllers;

import gov.iti.jets.ecommerce.business.dtos.AuthRequest;
import gov.iti.jets.ecommerce.business.dtos.AuthResponse;
import gov.iti.jets.ecommerce.business.dtos.RegisterRequest;
import gov.iti.jets.ecommerce.business.services.AuthService;
import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service ;
    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.customerRegister(request));
    }
    @RolesAllowed("ADMIN")

    @PostMapping("/admin/register")
    public ResponseEntity<AuthResponse> adminRegister(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.adminRegister(request));
    }


    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request){
        return ResponseEntity.ok(service.login(request));
    }



}

