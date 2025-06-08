package com.pablovilan.usermanagement.model.dao;

import com.pablovilan.usermanagement.model.entity.Permission;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Data Access Object (DAO) interface for managing permissions.
 * This interface extends JpaRepository to provide CRUD operations for Permission entities.
 * It includes methods to find a permission by its name and check if a permission exists by its name.
 */
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
