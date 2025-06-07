package com.pablovilan.usermanagement.model.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pablovilan.usermanagement.model.entity.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

    /**
     * Finds a role by its name.
     *
     * @param name the name of the role
     * @return an Optional containing the Role if found, or empty if not found
     */
    Optional<Role> findByName(String name);

    /**
     * Checks if a role exists by its names.
     *
     * @param name the name of the role
     * @return true if a role with the given name exists, false otherwise
     */
    boolean existsByName(String name);

}
