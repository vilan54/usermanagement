package com.pablovilan.usermanagement.model.dao;

import java.security.Permission;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission, Long> {

    /**
     * Finds a permission by its name.
     *
     * @param name the name of the permission
     * @return an Optional containing the Permission if found, or empty if not found
     */
    Optional<Permission> findByName(String name);

    /**
     * Checks if a permission exists by its name.
     *
     * @param name the name of the permission
     * @return true if a permission with the given name exists, false otherwise
     */
    boolean existsByName(String name); 

}
