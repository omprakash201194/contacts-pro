package com.omprakashgautam.app.contactspro.exception;

import lombok.NoArgsConstructor;

/**
 * @author omprakash gautam
 * Created on 04-Jul-21 at 1:13 PM.
 */

public class InvalidInputException extends RuntimeException{
    public InvalidInputException() {
        super();
    }

    public InvalidInputException(final String message) {
        super(message);
    }
}
