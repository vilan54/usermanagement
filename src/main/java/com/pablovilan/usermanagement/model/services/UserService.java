package com.pablovilan.usermanagement.model.services;

import java.util.List;

import com.pablovilan.usermanagement.model.entity.User;

/**
 * Service interface for managing users in the system.
 * This interface defines methods for creating, deleting, finding, and updating users,
 * as well as checking user existence by username and email.
 */
public interface UserService {

    /**
     * Creates a new user with the specified username and password.
     *
     * @param username the username of the new user
     * @param password the password of the new user
     * @return true if the user was created successfully, false otherwise
     */
    boolean createUser(String username, String password);

    /**
     * Deletes a user by their username.
     *
     * @param username the username of the user to delete
     * @return true if the user was deleted successfully, false otherwise
     */
    boolean deleteUser(String username);

    /**
     * Finds a user by their username.
     *
     * @param username the username of the user to find
     * @return the User object if found, or null if not found
     */
    User findUserByUsername(String username);

    /**
     * Updates the password of an existing user.
     *
     * @param username the username of the user to update
     * @param oldPassword the current password of the user
     * @param newPassword the new password for the user
     * @return true if the password was updated successfully, false otherwise
     */
    boolean updatePassword(String username, String oldPassword, String newPassword);

    /**
     * Updates the profile of an existing user.
     * 
     * @param username the username of the user to update
     * @param newUsername the new username for the user
     * @param newPassword the new password for the user
     * @param newEmail the new email for the user
     * @return the updated User object if the update is successful, or null if the user does not exist
     */
    User updateUser(String username, String newUsername, String newPassword, String newEmail);

    /**
     * Retrieves all users in the system.
     *
     * @return a list of all User objects
     */
    List<User> findAllUsers();

    /**
     * Checks if a user exists by their username.
     *
     * @param username the username to check
     * @return true if the user exists, false otherwise
     */
    boolean existsByUsername(String username);

    /**
     * Checks if a user exists by their email.
     *
     * @param email the email to check
     * @return true if the user exists, false otherwise
     */
    boolean existsByEmail(String email);
}
