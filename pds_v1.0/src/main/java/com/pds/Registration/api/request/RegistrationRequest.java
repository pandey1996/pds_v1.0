package com.pds.Registration.api.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class RegistrationRequest {
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private String mobile;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String postcode;
    private String state;
    private String country;
    private String username;
    private String ip;
}
