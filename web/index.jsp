<%@ page import="utils.Factory" %>
<%@ page import="java.util.Collection" %>
<%@ page import="db.mapping.UserEntity" %>
<%@ page import="java.util.ArrayList" %>
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
    <tr>
      <% ArrayList<UserEntity> users = (ArrayList<UserEntity>) request.getAttribute("users");
        for (UserEntity u : users){
      %>
      <td><%=u.getIdRec()%></td>
      <td><%=u.getUsername()%></td>
      <td><%=u.getPassword()%></td>
      <td><%=u.getPassword()%></td>
      <%}%>
    </tr>
    </tbody>
  </table>


  </body>
</html>