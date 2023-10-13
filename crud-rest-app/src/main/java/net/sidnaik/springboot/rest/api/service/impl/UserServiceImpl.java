package net.sidnaik.springboot.rest.api.service.impl;

import lombok.AllArgsConstructor;
import net.sidnaik.springboot.rest.api.entity.User;
import net.sidnaik.springboot.rest.api.repository.UserRepository;
import net.sidnaik.springboot.rest.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository; //creating a repository of userRepository
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

/*Let's remove the null as we want to get something now
Well, we can get a User object from this Optional User by using get method.
get() method returns a User*/
    @Override
    public User getUserById(Long userId) {

        return null;
    }
}
