package com.pablovilan.usermanagement.model.services;

import com.pablovilan.usermanagement.model.entity.Role;

/**
 * Service interface for managing roles in the system.
 * This interface defines methods for creating, deleting, finding roles,
 * and assigning/removing roles to/from users.
 */
public interface RoleService {
    
    /**
     * Creates a new role with the specified name.
     *
     * @param name        the name of the new role
     * @param description a description of the role
     * @return true if the role was created successfully, false otherwise
     */
    boolean createRole(String name, String description);

    /**
     * Deletes a role by its name.
     *
     * @param name the name of the role to delete
     * @return true if the role was deleted successfully, false otherwise
     */
    boolean deleteRole(String name);

    /**
     * Finds a role by its name.
     *
     * @param name the name of the role to find
     * @return the Role object if found, or null if not found
     */
    Role findRoleByName(String name);

    /**
     * Assigns a role to a user.
     *
     * @param username the username of the user to assign the role to
     * @param role     the name of the role to assign
     * @return true if the role was assigned successfully, false otherwise
     */
    Boolean assignRoleToUser(String username, String role);

    /**
     * Removes a role from a user.
     *
     * @param username the username of the user
     * @param role     the name of the role to remove
     * @return true if the role was removed successfully, false otherwise
     */
    Boolean removeRoleFromUser(String username, String role);
}
