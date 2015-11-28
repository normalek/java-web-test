package controllers;

import db.dao.UserDAO;
import db.dao.impl.UserDAOImpl;
import db.mapping.RolesEntity;
import db.mapping.UserEntity;
import org.hibernate.Session;
import utils.Factory;
import utils.HibernateUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dmitriy on 27.11.2015.
 * Project TestWebApp.
 */

public class UsersTable extends HttpServlet {

    private ArrayList<UserEntity> userEnt = new ArrayList<UserEntity>();
    private ArrayList<RolesEntity> roleEnt = new ArrayList<RolesEntity>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Collection users = Factory.getInstance().getUserDAO().getAllUsers();
            Collection roles = Factory.getInstance().getRolesDAO().getAllRoles();
            for (Object u : users){
                UserEntity user = (UserEntity) u;
                userEnt.add(user);
            }
            for (Object r : roles){
                RolesEntity role = (RolesEntity) r;
                roleEnt.add(role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("users", userEnt);
        request.setAttribute("role", roleEnt);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}


