package gov.iti.jets.ecommerce.business.services;

import gov.iti.jets.ecommerce.persistence.entities.Customer;
import gov.iti.jets.ecommerce.persistence.entities.Role;
import gov.iti.jets.ecommerce.persistence.repositories.CustomerRepo;
import gov.iti.jets.ecommerce.business.dtos.AuthRequest;
import gov.iti.jets.ecommerce.business.dtos.AuthResponse;
import gov.iti.jets.ecommerce.business.dtos.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final CustomerRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private  final  JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    public AuthResponse register(RegisterRequest request) {
        var user = new Customer();
        user.setUsername(request.getUserName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setRole(Role.CUSTOMER);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepo.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthResponse authenticate(AuthRequest request) {
         authenticationManager.authenticate(
                 new UsernamePasswordAuthenticationToken(
                         request.getUserName(),
                         request.getPassword()
                 )
         );
         var user = userRepo.findCustomerByUsername(request.getUserName()).orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder()
                .token(jwtToken)
                .build();
    }
}
