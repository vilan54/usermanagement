package com.pablovilan.usermanagement.model.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

/**
 * Entity class representing a Role in the system.
 * This class maps to the "roles" table in the database.
 * It contains fields for role details such as name and description.
 */
@Entity
@Table(name = "roles")
public class Role {

    /**
     * Unique identifier for the role.
     * This is the primary key of the "roles" table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the role.
     * This field is unique and cannot be null.
     */
    @Column(nullable = false, unique = true)
    private String name;

    /**
     * Description of the role.
     * This field can be null and is used to provide additional information about the role.
     */
    @Column(nullable = true)
    private String description;

    /**
     * List of permissions associated with the role.
     * This field is used to define the permissions granted to this role.
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "role_permissions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<Permission> permissions = new HashSet<>();

    /**
     * Default constructor for JPA.
     */
    public Role() {
    }

    /**
     * Constructor to create a Role with specified name and description.
     *
     * @param name        the name of the role
     * @param description the description of the role
     */
    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

}
