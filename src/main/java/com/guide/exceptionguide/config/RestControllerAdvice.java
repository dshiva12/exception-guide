package com.guide.exceptionguide.config;

import com.guide.exceptionguide.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Object> handleBusinessException(BusinessException businessException){
        return new ResponseEntity(businessException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
