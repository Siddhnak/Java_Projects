package net.sidnaik.springboot.rest.api.repository;

import net.sidnaik.springboot.rest.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
