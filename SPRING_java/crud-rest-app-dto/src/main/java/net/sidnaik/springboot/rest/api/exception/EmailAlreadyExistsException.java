package net.sidnaik.springboot.rest.api.exception;

public class EmailAlreadyExistsException extends RuntimeException{
    private String message;

    public EmailAlreadyExistsException(String message){
    super(message);
    }
}
