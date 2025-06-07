package com.pablovilan.usermanagement.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Entity class representing a User in the system.
 * This class maps to the "users" table in the database.
 * It contains fields for user details such as username, password, email,
 * timestamps for creation and last update and role.
 */

@Entity
@Table(name = "users")
public class User {
    /**
     * Unique identifier for the user.
     * This is the primary key of the "users" table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Username of the user.
     * This field is unique and cannot be null.
     */
    @Column(nullable = false, unique = true)
    private String username;

    /**
     * Password of the user.
     * This field cannot be null.
     */
    @Column(nullable = false)
    private String password;

    /**
     * Email of the user.
     * This field cannot be null.
     */
    @Column(nullable = false)
    private String email;

    /**
     * Timestamp of when the user was created.
     * This field is set automatically and cannot be updated.
     */
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    /**
     * Timestamp of when the user was last updated.
     * This field is set automatically on update.
     */
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    /**
     * Role of the user.
     * This field is a foreign key referencing the Role entity.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    /**
     * Default constructor for JPA.
     */
    public User() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    /**
     * Constructor with parameters to initialize user details.
     *
     * @param username the username of the user
     * @param password the password of the user
     * @param email    the email of the user
     */
    public User(String username, String password, String email, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.role = role;
    }

    // Getters and Setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
