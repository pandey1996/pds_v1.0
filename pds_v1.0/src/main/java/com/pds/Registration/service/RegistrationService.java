package com.pds.Registration.service;

import com.pds.Registration.api.request.RegistrationRequest;
import com.pds.Registration.api.response.RegistrationResponse;

public interface RegistrationService {
    RegistrationResponse register(RegistrationRequest request);
}
