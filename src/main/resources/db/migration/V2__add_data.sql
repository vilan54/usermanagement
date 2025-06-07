-- Insert default roles
INSERT INTO roles (name, description) VALUES
('Admin', 'Administrator with full access'),
('User', 'Normal user with limited access');

-- Insert default permissions
INSERT INTO permissions (name, description) VALUES

-- Permissions for Admin
('ADMIN_CREATE', 'Permission to create admin'),
('ADMIN_READ', 'Permission to read admin data'),
('ADMIN_WRITE', 'Permission to write admin data'),
('ADMIN_DELETE', 'Permission to delete admin data'),
('ADMIN_UPDATE', 'Permission to update admin data'),
('ADMIN_VIEW_ALL', 'Permission to view all users'),
('ADMIN_MANAGE_ROLES', 'Permission to manage user roles'),
('ADMIN_MANAGE_PERMISSIONS', 'Permission to manage user permissions'),

-- Permissions for User
('USER_DELETE_SELF', 'Permission to delete user'),
('USER_VIEW_SELF', 'Permission to view own user details'),
('USER_UPDATE_SELF', 'Permission to update own user details'),
('USER_CHANGE_PASSWORD_SELF', 'Permission to change own password');


-- Assign permissions to roles
INSERT INTO roles_permissions (id_role, id_permission) VALUES
(1, 1), -- Admin can CREATE ADMIN
(1, 2), -- Admin can READ ADMIN
(1, 3), -- Admin can WRITE ADMIN
(1, 4), -- Admin can DELETE ADMIN
(1, 5), -- Admin can UPDATE ADMIN
(1, 6), -- Admin can VIEW ALL USERS
(1, 7), -- Admin can MANAGE ROLES
(1, 8), -- Admin can MANAGE PERMISSIONS

(2, 9), -- User can DELETE SELF
(2, 10), -- User can VIEW SELF
(2, 11), -- User can UPDATE SELF
(2, 12); -- User can CHANGE PASSWORD SELF
