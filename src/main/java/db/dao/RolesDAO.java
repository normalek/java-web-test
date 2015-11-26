package db.dao;

import db.mapping.RolesEntity;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Dmitriy on 22.11.2015.
 * Project TestWebApp.
 */
public interface RolesDAO {
    public void addRole(RolesEntity role) throws SQLException;
    public void updateRole(int idRec, RolesEntity role) throws SQLException;
    public RolesEntity getRoleById(int idRec) throws SQLException;
    public Collection getAllRoles() throws SQLException;
    public void deleteRole(RolesEntity role) throws SQLException;
}
