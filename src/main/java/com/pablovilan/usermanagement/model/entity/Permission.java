package com.pablovilan.usermanagement.model.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a Role in the system.
 * This class maps to the "roles" table in the database.
 * It contains fields for role details such as name and description.
 */
@Entity
@Table(name = "permissions")
public class Permission {

    /**
     * Unique identifier for the permission.
     * This is the primary key of the "permissions" table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Name of the permission.
     * This field is unique and cannot be null.
     */
    @Column(nullable = false, unique = true)
    private String name;

    /**
     * Description of the permission.
     * This field can be null and is used to provide additional information about the permission.
     */
    @Column(nullable = true)
    private String description;    

    /**
     * Default constructor for JPA.
     */
    public Permission() {
    }

    /**
     * Constructor to create a Permission with specified name and description.
     *
     * @param name        the name of the permission
     * @param description the description of the permission
     */
    public Permission(String name, String description) {
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
}
