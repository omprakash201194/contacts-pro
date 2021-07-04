package com.omprakashgautam.app.contactspro.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author omprakash gautam
 * Created on 04-Jul-21 at 1:49 PM.
 */
@Data
@AllArgsConstructor
public class ExceptionResponse {
    private String errorMessage;
    private String requestedURI;
    private LocalDateTime date;
    private int errorCode;
}
