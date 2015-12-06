package controllers;

import db.dao.UserDAO;
import db.dao.impl.UserDAOImpl;
import db.mapping.RolesEntity;
import db.mapping.UserEntity;
import org.hibernate.Session;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import utils.Factory;
import utils.HibernateUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Dmitriy on 27.11.2015.
 * Project TestWebApp.
 */

public class UsersTable extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate.xml");
        String user_id = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        String first_name = request.getParameter("first_name").trim();
        String last_name = request.getParameter("last_name").trim();
        String role = request.getParameter("role").trim();

        //System.out.print(user_id+" "+password);
        try {
            Collection users = Factory.getInstance().getUserDAO().getAllUsers();
            request.setAttribute("users", users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Collection users = Factory.getInstance().getUserDAO().getAllUsers();
            request.setAttribute("users", users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}


