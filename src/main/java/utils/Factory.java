package utils;

import db.dao.RolesDAO;
import db.dao.UserDAO;
import db.dao.impl.RolesDAOImpl;
import db.dao.impl.UserDAOImpl;

/**
 * Created by Dmitriy on 22.11.2015.
 * Project TestWebApp.
 */
public class Factory {
    private static UserDAO userDAO = null;
    private static RolesDAO rolesDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO(){
        if (userDAO == null){
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

    public RolesDAO getRolesDAO(){
        if (rolesDAO == null){
            rolesDAO = new RolesDAOImpl();
        }
        return rolesDAO;
    }
}
