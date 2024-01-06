package net.sidnaik.springboot.rest.api.service.impl;

import lombok.AllArgsConstructor;
import net.sidnaik.springboot.rest.api.dto.UserDto;
import net.sidnaik.springboot.rest.api.entity.User;
import net.sidnaik.springboot.rest.api.exception.ResNotFoundException;
import net.sidnaik.springboot.rest.api.mapper.AutoUserMapper;
import net.sidnaik.springboot.rest.api.mapper.UserMapper;
import net.sidnaik.springboot.rest.api.repository.UserRepository;
import net.sidnaik.springboot.rest.api.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository; //creating a repository of userRepository
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {//Convert UserDto to User JPA Entity User user =
//      UserMapper.mapToUser(userDto);         //feels nice
//        User user =  modelMapper.map(userDto,User.class) ;     //using model mapper
        User user = AutoUserMapper.MAPPER.mapToUser(userDto);    //Just using our Mapper class
        User savedUser = userRepository.save(user);
        //Converting User JPA entity to UserDto
//        UserDto savedUserDto = UserMapper.mapToUserDto(user);       //feels nice
//        UserDto savedUserDto = modelMapper.map(savedUser,UserDto.class);    // using modelmapper refactoring

        UserDto savedUserDto = AutoUserMapper.MAPPER.mapToUserDto(savedUser);

        return savedUserDto;
    }
    /*Let's remove the null as we want to get something now
    Well, we can get a User object from this Optional User by using get method.
    get() method returns a User*/
    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow( //Refactor Using orElseThrow
                /*Expecting a lambda here*/
                ()->new ResNotFoundException("User","id",userId)
        );

//        return UserMapper.mapToUserDto(user);
//        return modelMapper.map(user,UserDto.class);  //TO map modelmapper to map User entity into UserDto
//        return null;

        return AutoUserMapper.MAPPER.mapToUserDto(user);
    }

    // L65 GetAllUsers rest API
    @Override
    public List<UserDto> getAlluser() /* will get all users from the DB*/ {
        List<User> users = userRepository.findAll();
//        return users.stream().map(UserMapper::mapToUserDto)
//                .collect(Collectors.toList());
        //converting this list of User JPA entity into a list of UserDto
        /*we need to convert a list of User entity into list of UserDto*/

        //Model mapper below..for   GET ALL USERS..
//        return users.stream().map((user ->modelMapper.map(user,UserDto.class) ))                                 //map method takes function as a functional interface
//                .collect(Collectors.toList());

        return users.stream().map((user -> AutoUserMapper.MAPPER.mapToUserDto(user)))                                 //map method takes function as a functional interface
                .collect(Collectors.toList());

    }   //passing of the lambda expression as map method takes function as the Functional arg

    @Override

    public UserDto updateUser(UserDto user) {
        /*Well, let's first get the existing User
         object from the database and then we'll update that User object.*/
        User existingUser = userRepository.findById(user.getId()).orElseThrow(
                ()-> new ResNotFoundException("User","id",user.getId())
        );
        /* let's call User.getId() and this findById() method returns
                 optional of type User so.. So let's call a get() method.*/

/*
        Next, what we'll do, we'll update all the information from
        this User object into this existing User.*/
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        userRepository.save(existingUser);
        User updatedUser = userRepository.save(existingUser);        //So let's convert this User entity object into UserDto.
//        return UserMapper.mapToUserDto(updatedUser);
//        return modelMapper.map(updatedUser,UserDto.class);   //ModelMapper refactor

        return AutoUserMapper.MAPPER.mapToUserDto(updatedUser);   //ModelMapper refactor


    }


    public void deleteUser(Long userId) {
        User existingUser = userRepository.findById(userId).orElseThrow(
                ()-> new ResNotFoundException("User","id",userId)
        );
        userRepository.deleteById(userId);
    }
}

