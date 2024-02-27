package net.sidnaik.springboot.rest.api.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResNotFoundException extends RuntimeException{

    private String resName;         // Creating instance var for this class
    private String fieldName;
    private Long fieldValue;

    public ResNotFoundException(String resName,String fieldName,Long fieldValue){
        super(String.format("%s not found with %s : '%s'",
                resName , fieldName,fieldValue));  /*let's call a super keyword
                                    to call superclass constructor and let's pass a custom error message to this
                                    super method call. and then giving placeholders for the same.*/
        this.resName=resName;
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;
    }

}
