package com.pds.Registration.controller;

import com.pds.Registration.api.request.RegistrationRequest;
import com.pds.Registration.api.response.RegistrationResponse;
import com.pds.Registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/RegistrationController")
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @PostMapping("/register")
    @ResponseBody
    public RegistrationResponse register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
    
}
