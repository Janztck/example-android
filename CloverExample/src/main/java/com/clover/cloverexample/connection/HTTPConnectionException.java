package com.clover.cloverexample.connection;

public class HTTPConnectionException extends Exception {
    HTTPConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    HTTPConnectionException(String message) {
        super(message);
    }
}
