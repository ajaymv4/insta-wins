package com.instawins.random.service;

import com.instawins.request.RegistrationRequest;
import com.instawins.response.RegistrationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Service class to register new user
 */
@Service
public class RegistrationService {

    private RegistrationResponse successResponse;

    public ResponseEntity<RegistrationResponse> registerUser(RegistrationRequest request){
        //TODO:Add logic to save it to database
        ResponseEntity<RegistrationResponse> registrationResponseResponseEntity = new ResponseEntity<>(getSuccessResponse(), HttpStatus.CREATED);
        return registrationResponseResponseEntity;
    }

    private RegistrationResponse getSuccessResponse(){
        if(null == successResponse){
            successResponse = new RegistrationResponse(true,"Success");
        }
        return successResponse;
    }

}
