package com.nasr.paymentservice.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class ExternalServiceException  extends RuntimeException{
    private HttpStatus errorCode;

    public ExternalServiceException(String message, HttpStatus errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ExternalServiceException(HttpStatus errorCode) {
        this.errorCode = errorCode;
    }
}
