package com.pds.Registration.service.impl;

import com.pds.Registration.api.request.RegistrationRequest;
import com.pds.Registration.api.response.RegistrationResponse;
import com.pds.Registration.model.PatientDetails;
import com.pds.Registration.repository.PatientRepository;
import com.pds.Registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    PatientRepository patientRepository;
    public RegistrationResponse register(RegistrationRequest request){
        String userId=generateUserId();
        PatientDetails patientDetails=new PatientDetails(null,userId,request.getFirstName(),request.getLastName(),request.getEmailId(),request.getMobile(),request.getPhone(),
                request.getAddressLine1(),request.getAddressLine2(),request.getPostcode(),request.getState(),request.getCountry(),request.getUsername());
        try {
            patientRepository.save(patientDetails);
        }catch (Exception e){
            RegistrationResponse response=new RegistrationResponse();
            response.setStatus("FAILURE");
            response.setErrorCode("REGISTRATION_FAILED");
            response.setErrorDescription(e.toString());
            return response;
        }
        return RegistrationResponse.builder().externalId(userId).emailId(request.getEmailId()).build();
    }
    private String generateUserId(){
        Long l=1000000000000000L;
        Random rnd = new Random();
        Long n = l + rnd.nextLong(9*l);
        return n.toString();
    }
}
