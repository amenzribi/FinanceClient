package com.O2S.FinanceClient.Controllers;

import com.O2S.FinanceClient.DTO.AuthenticationRequest;
import com.O2S.FinanceClient.DTO.AuthenticationResponse;
import com.O2S.FinanceClient.DTO.RegistrationRequest;
import com.O2S.FinanceClient.Entities.Client;
import com.O2S.FinanceClient.Entities.Collaborateur;
import com.O2S.FinanceClient.Services.AuthenticationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@Tag(name = "Authentication")
public class AuthenticationController {


    private final AuthenticationService service;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<?> register(
            @RequestBody @Valid RegistrationRequest request
    ) throws MessagingException {
        service.register(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
    @GetMapping("/activate-account")
    public void confirm(
            @RequestParam String token
    ) throws MessagingException {
        service.activateAccount(token);
    }



    //**************************************************************************
    // EndPoints pour les clients et collaborateurs



    @GetMapping("/clients")
    public List<Client> getClients() {
        return service.getAllClients();
    }

    @GetMapping("/clients/{CO_NO}")
    public List<Client> getClientsByCollaborateur(@PathVariable Integer CO_NO) {
        return service.getClientsByCollaborateur(CO_NO);
    }

    @GetMapping("/collaborateurs")
    public List<Collaborateur> getCollaborateurs() {
        return service.getAllCollaborateurs();
    }


}
