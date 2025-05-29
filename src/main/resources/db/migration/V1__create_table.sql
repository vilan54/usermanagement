-- Table of user roles
CREATE TABLE IF NOT EXISTS roles (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(255)
);

-- Table of permissions
CREATE TABLE IF NOT EXISTS permissions (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(255)
);

-- Relationship table between roles and permissions
CREATE TABLE IF NOT EXISTS roles_permissions (
    id_role BIGINT NOT NULL,
    id_permission BIGINT NOT NULL,
    PRIMARY KEY (id_role, id_permission),
    FOREIGN KEY (id_role) REFERENCES roles(id) ON DELETE CASCADE,
    FOREIGN KEY (id_permission) REFERENCES permissions(id) ON DELETE CASCADE
);

-- Table of users
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    id_role BIGINT NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_role) REFERENCES roles(id) ON DELETE CASCADE
);
