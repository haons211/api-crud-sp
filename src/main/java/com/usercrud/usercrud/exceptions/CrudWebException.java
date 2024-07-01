package com.usercrud.usercrud.exceptions;


public class CrudWebException extends Exception{
    public CrudWebException() {
        super();
    }
    public CrudWebException(String message) {
        super(message);
    }
    public CrudWebException(String message, Throwable cause) {
        super(message, cause);
    }
}
