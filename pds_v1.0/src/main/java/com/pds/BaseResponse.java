package com.pds;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse {
    private String status;
    private String errorCode;
    private String errorDescription;
}
