package org.spring.cert.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_ACCEPTABLE;

@ResponseStatus(code = NOT_ACCEPTABLE, reason = "Custom Data Rejected")
public class CustomDataRejectedException extends RuntimeException {
}
