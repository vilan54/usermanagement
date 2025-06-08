package com.pablovilan.usermanagement.model.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pablovilan.usermanagement.model.entity.User;

/**
 * Data Access Object (DAO) interface for managing users.
 * This interface extends JpaRepository to provide CRUD operations for User entities.
 * It includes methods to find a user by their username and check if a user exists by their email.
 */
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
