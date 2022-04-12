package com.instawins.random.controller;

import com.instawins.random.service.RegistrationService;
import com.instawins.request.RegistrationRequest;
import com.instawins.response.RegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * New user registration controller
 */
@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping(value="/user/create")
    public ResponseEntity<RegistrationResponse> registerPlayer(@RequestBody RegistrationRequest request){
        return registrationService.registerUser(request);
    }
}
