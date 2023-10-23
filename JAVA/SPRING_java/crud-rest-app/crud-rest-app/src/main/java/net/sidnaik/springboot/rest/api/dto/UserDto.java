package net.sidnaik.springboot.rest.api.dto;


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
    private String firstname;
    private String lastname;
    private String email;

//Step 2 : Refactor Create user Rest Api to use DTO


}
