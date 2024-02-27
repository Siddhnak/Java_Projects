package net.sidnaik.springboot.rest.api.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ResNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResNotFoundException exception,
                                                                        WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "USER_NOT_FOUND"
//        web

        );
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ErrorDetails> handleEmailAlreadyExistsException(EmailAlreadyExistsException exception,
                                                                        WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "User_Email_Already_Exists"
//        web

        );
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

    // BELOW LOGIC WILL TAKE CARE  order to handle all
    // those exceptions apart from the email not found and resnotfound
    //  we have written this global exception HANDLER

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception exception,
                                                                          WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                exception.getMessage(),
                webRequest.getDescription(false),
                "INTERNAL SERVER ERROR"
//        web

        );
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
//     AS we need to provide own imple   return super.handleMethodArgumentNotValid(ex, headers, status, request);
        Map<String, String> errors = new HashMap<>();
        List<ObjectError> errorList= ex.getBindingResult().getAllErrors(); //storing the list of errors using the GetBinding Result method under the handleMethodArgumentNotValid method

        errorList.forEach((error)->{
            String fieldName = ((FieldError)error).getField();
            String message = ((FieldError) error).getDefaultMessage();
            /*Next let's get the corresponding validation error message.*/

            errors.put(fieldName,message); //field name as a key and msg as a value

        });

        /*Next, we need to return this map to the client.
         */
        return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
    }
}














