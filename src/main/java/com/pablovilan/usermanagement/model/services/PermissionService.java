package com.pablovilan.usermanagement.model.services;

import java.util.List;

import com.pablovilan.usermanagement.model.entity.Permission;

/**
 * Service interface for managing permissions in the system.
 * This interface defines methods for creating, deleting, finding permissions,
 * and assigning/removing permissions to/from roles.
 */
public interface PermissionService {

    /**
     * Creates a new permission with the specified name and description.
     *
     * @param name        the name of the new permission
     * @param description a description of the permission
     * @return true if the permission was created successfully, false otherwise
     */
    boolean createPermission(String name, String description);

    /**
     * Deletes a permission by its name.
     *
     * @param name the name of the permission to delete
     * @return true if the permission was deleted successfully, false otherwise
     */
    boolean deletePermission(String name);

    /**
     * Finds a permission by its name.
     *
     * @param name the name of the permission to find
     * @return the Permission object if found, or null if not found
     */
    Permission findPermissionByName(String name);

    /**
     * Assigns a permission to a role.
     *
     * @param permissionList the list of permissions to assign
     * @param role           the name of the role to assign the permissions to
     * @return true if the permissions were assigned successfully, false otherwise
     */
    Boolean asignPermissionsToRole(List<Permission> permissionList, String role);

    /**
     * Removes a permission from a role.
     *
     * @param permissionList the list of permissions to remove
     * @param role           the name of the role to remove the permissions from
     * @return true if the permissions were removed successfully, false otherwise
     */
    Boolean removePermissionsFromRole(List<Permission> permissionList, String role);
}
