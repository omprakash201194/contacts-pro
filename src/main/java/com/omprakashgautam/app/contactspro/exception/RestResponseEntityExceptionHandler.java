package com.omprakashgautam.app.contactspro.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @author omprakash gautam
 * Created on 04-Jul-21 at 1:08 PM.
 */
@ControllerAdvice
@Slf4j
public class RestResponseEntityExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { InvalidInputException.class })
    public ResponseEntity<ExceptionResponse> handleInvalidInputException(InvalidInputException ex, WebRequest webRequest) {
        log.error("Invalid Input Exception: {}", ex.getMessage());
        ExceptionUtils.printRootCauseStackTrace(ex);
        ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(),
                webRequest.getDescription(false),
                LocalDateTime.now(), HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(exceptionResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = { ContactProException.class })
    public ResponseEntity<ExceptionResponse> handleBusinessException(ContactProException ex, WebRequest webRequest) {
        log.error("Contact Pro Exception: {}", ex.getMessage());
        ExceptionUtils.printRootCauseStackTrace(ex);
        ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(),
                webRequest.getDescription(false),
                LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<ExceptionResponse> handleException(Exception ex, HttpServletRequest httpServletRequest) {
        log.error("Exception: {}",ex.getMessage());
        ExceptionUtils.printRootCauseStackTrace(ex);
        ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessage(),
                httpServletRequest.getRequestURI(),
                LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
