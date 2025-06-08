-- Insert default roles
INSERT INTO roles (id, name, description) VALUES
(1, 'Admin', 'Administrator with full access'),
(2, 'User', 'Normal user with limited access');

-- Insert default permissions
INSERT INTO permissions (id, name, description) VALUES

-- Permissions for Admin
(1, 'ADMIN_CREATE', 'Permission to create admin'),
(2, 'ADMIN_READ', 'Permission to read admin data'),
(3, 'ADMIN_WRITE', 'Permission to write admin data'),
(4, 'ADMIN_DELETE', 'Permission to delete admin data'),
(5, 'ADMIN_UPDATE', 'Permission to update admin data'),
(6, 'ADMIN_VIEW_ALL', 'Permission to view all users'),
(7, 'ADMIN_MANAGE_ROLES', 'Permission to manage user roles'),
(8, 'ADMIN_MANAGE_PERMISSIONS', 'Permission to manage user permissions'),

-- Permissions for User
(9, 'USER_DELETE_SELF', 'Permission to delete user'),
(10, 'USER_VIEW_SELF', 'Permission to view own user details'),
(11, 'USER_UPDATE_SELF', 'Permission to update own user details'),
(12, 'USER_CHANGE_PASSWORD_SELF', 'Permission to change own password');


-- Assign permissions to roles
INSERT INTO roles_permissions (role_id, permission_id) VALUES
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
