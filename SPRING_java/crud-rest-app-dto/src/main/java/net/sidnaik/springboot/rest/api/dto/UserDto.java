package net.sidnaik.springboot.rest.api.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    /*So make sure that you don't include the sensitive
    information in a UserDto because the rest API don't
     have to send the sensitive information to the
      client, isn't it?*/

    private Long id;
    @NotEmpty(message = "User first name can't be null or empty") //User fname should'nt be null or empty
    private String firstName;
    @NotEmpty(message = "User last name can't be null or empty")
    private String lastName;

    @NotEmpty(message = "User email can't be null or empty")
    @Email(message = "Email address should be Valid")
    private String email;

//Step 2 : Refactor Create user Rest Api to use DTO


}
