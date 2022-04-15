package com.updox.providerdirectory.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@JsonInclude(NON_NULL)
public class Response {
    private int statusCode;
    private HttpStatus httpStatus;
    private LocalDateTime timestamp;
    private String message;
    private Map<?,?> data;

    public int getStatusCode() {
        return statusCode;
    }

    public Response setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Response setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Response setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Response setMessage(String message) {
        this.message = message;
        return this;
    }

    public Map<?, ?> getData() {
        return data;
    }

    public Response setData(Map<?, ?> data) {
        this.data = data;
        return this;
    }

}
