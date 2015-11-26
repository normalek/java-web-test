package controllers;

import db.mapping.UserEntity;
import utils.Factory;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by Dmitriy on 26.11.2015.
 * Project TestWebApp.
 */
@javax.servlet.annotation.WebServlet(name = "UsersTable")
public class UsersTable extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Collection users = null;
        try {
            users = Factory.getInstance().getUserDAO().getAllUsers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Object u : users) {
            UserEntity user = (UserEntity) u;
            System.out.println("Пользователь: " + user.getFirstName() + ", пароль: " + user.getPassword());
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
