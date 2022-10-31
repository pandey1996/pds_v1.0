package com.pds.Registration.api.response;

import com.pds.BaseResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RegistrationResponse extends BaseResponse {
    private String externalId;
    private String emailId;
    private String ip;
}
