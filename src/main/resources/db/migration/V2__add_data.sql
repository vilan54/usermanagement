-- Insert default roles
INSERT INTO roles (name, description) VALUES
('Admin', 'Administrator with full access'),
('Editor', 'Editor with limited access'),
('Viewer', 'User with view-only access');

-- Insert default permissions
INSERT INTO permissions (name, description) VALUES
('READ', 'Permission to read data'),
('WRITE', 'Permission to write data'),
('DELETE', 'Permission to delete data'),
('UPDATE', 'Permission to update data');

-- Assign permissions to roles
INSERT INTO roles_permissions (id_role, id_permission) VALUES
(1, 1), -- Admin can READ
(1, 2), -- Admin can WRITE
(1, 3), -- Admin can DELETE
(1, 4), -- Admin can UPDATE
(2, 1), -- Editor can READ
(2, 2), -- Editor can WRITE
(2, 4), -- Editor can UPDATE
(3, 1); -- Viewer can only READ