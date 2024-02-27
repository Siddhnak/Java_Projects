package net.sidnaik.springboot.rest.api.repository;

import net.sidnaik.springboot.rest.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

//To retrieve the user by custom query method..
    Optional<User> findByEmail(String email);
}
