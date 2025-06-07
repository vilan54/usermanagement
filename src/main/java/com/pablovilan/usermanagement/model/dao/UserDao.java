package com.pablovilan.usermanagement.model.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pablovilan.usermanagement.model.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

    /**
     * Finds a user by their username.
     *
     * @param username the username of the user
     * @return an Optional containing the User if found, or empty if not found
     */
    Optional<User> findByUsername(String username);

    /**
     * Checks if a user exists by their email.
     *
     * @param email the email of the user
     * @return true if a user with the given email exists, false otherwise
     */
    boolean existsByEmail(String email);

} 
