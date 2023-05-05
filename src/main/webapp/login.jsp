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
        String username = request.getParameter("uname");
        String password = request.getParameter("pword");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
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
        <label for="uname">Username</label>
        <input id="uname">
    </div>
    <div>
        <label for="pword">Password </label>
        <input id="pword">
    </div>
    <button type="submit">Login</button>
</form>

</body>
</html>
