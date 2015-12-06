<%@ page import="utils.Factory" %>
<%@ page import="java.util.Collection" %>
<%@ page import="db.mapping.UserEntity" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="db.mapping.RolesEntity" %>
<%--
  Created by IntelliJ IDEA.
  User: Dmitriy
  Date: 26.11.2015
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Test web app</title>
  </head>
  <body>
  <table border="2" width="2" cellspacing="2" cellpadding="2">
    <thead>
    <h3>Users table</h3>

    </thead>
    <tbody>
    <tr>
      <th>ID</th>
      <th>User</th>
      <th>Password</th>
      <th>Role</th>
    </tr>
      <% ArrayList<UserEntity> users = (ArrayList<UserEntity>) request.getAttribute("users");
        for (UserEntity u : users){
      %>
    <tr>
      <td><%=u.getIdRec()%></td>
      <td><%=u.getUsername()%></td>
      <td><%=u.getPassword()%></td>
      <td><%=u.getUserRole().getDescription()%></td>
    </tr>
      <%}%>
    </tbody>
  </table>
  <h3>Add new user</h3>
  <form action="users-table" method="post">
      <table>
          <tr>
              <td>Login :</td>
              <td><input type="text" name="username"/></td>
          </tr>
          <tr>
              <td>Password :</td>
              <td><input type="password" name="password"/></td>
          </tr>
          <tr>
              <td>First name :</td>
              <td><input type="text" name="first_name"/></td>
          </tr>
          <tr>
              <td>Last name :</td>
              <td><input type="text" name="last_name"/></td>
          </tr>
          <tr>
              <td>Role :</td>
              <td><input type="text" name="role"/></td>
          </tr>
          <tr>
              <td colspan="2" align="center"><input type="submit" value="Create"></td>
          </tr>
      </table>
  </form>

  </body>
</html>