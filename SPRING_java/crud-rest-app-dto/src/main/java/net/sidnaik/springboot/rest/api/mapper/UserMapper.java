package net.sidnaik.springboot.rest.api.mapper;

import net.sidnaik.springboot.rest.api.dto.UserDto;
import net.sidnaik.springboot.rest.api.entity.User;

public class UserMapper {

    //User entity to dTo conversion
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()

        );
        return userDto;
    }
        //User dTo conversion to user entity
        public static User mapToUser(UserDto userDto){
            User user = new User(
                    userDto.getId(),
                    userDto.getFirstName(),
                    userDto.getLastName(),
                    userDto.getEmail()
            );
            return user;
        }


}
