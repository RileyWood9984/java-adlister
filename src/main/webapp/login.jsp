<%--
  Created by IntelliJ IDEA.
  User: Riley
  Date: 5/5/23
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login.jsp" method="POST">
    <div>
        <label for="username">Username</label>
        <input id="username">
    </div>
    <div>
        <label for="password">Password </label>
        <input id="password">
    </div>
    <button type="submit">Login</button>
</form>

</body>
</html>
