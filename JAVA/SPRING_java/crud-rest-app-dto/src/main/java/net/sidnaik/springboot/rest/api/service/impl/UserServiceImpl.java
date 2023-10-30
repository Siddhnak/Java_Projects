package net.sidnaik.springboot.rest.api.service.impl;

import lombok.AllArgsConstructor;
import net.sidnaik.springboot.rest.api.dto.UserDto;
import net.sidnaik.springboot.rest.api.entity.User;
import net.sidnaik.springboot.rest.api.repository.UserRepository;
import net.sidnaik.springboot.rest.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository; //creating a repository of userRepository
    @Override
    public UserDto createUser(UserDto userDto) {

        //Convert UserDto to User JPA Entity

         User user = new User(                  //Creating inst of user JPA
                 userDto.getId(),
                 userDto.getFirstName(),
                 userDto.getLastName(),
                 userDto.getEmail()
         );
         User savedUser=userRepository.save(user);

         //Converting User JPA entity to UserDto

        UserDto savedUserDto = new UserDto(
                savedUser.getId(),
                savedUser.getFirstName(),
                savedUser.getLastName(),
                savedUser.getEmail()
        );
        return savedUserDto;
    }

/*Let's remove the null as we want to get something now
Well, we can get a User object from this Optional User by using get method.
get() method returns a User*/
    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();  //it was null here
//        return null;
    }
    // L65 GetAllUsers rest API
    @Override
    public List<User> getAlluser() /* will get all users from the DB*/ {
        return userRepository.findAll();
    }

    @Override

    public User updateUser(User user) {
        /*Well, let's first get the existing User
         object from the database and then we'll update that User object.*/
        User existingUser = userRepository.findById(user.getId()).get();
        /* let's call User.getId() and this findById() method returns
                 optional of type User so.. So let's call a get() method.*/

/*
        Next, what we'll do, we'll update all the information from
        this User object into this existing User.*/
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        userRepository.save(existingUser);
        User updatedUser= userRepository.save(existingUser);
        return updatedUser;

    }


    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }
}
