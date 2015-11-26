package db.dao;

import db.mapping.UserEntity;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Dmitriy on 22.11.2015.
 * Project TestWebApp.
 */
public interface UserDAO {
    public void addUser(UserEntity user) throws SQLException;
    public void updateUser(int idRec, UserEntity user) throws SQLException;
    public UserEntity getUserById(int idRec) throws SQLException;
    public Collection getAllUsers() throws SQLException;
    public void deleteUser(UserEntity user) throws SQLException;
}
