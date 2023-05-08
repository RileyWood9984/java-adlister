<%--
  Created by IntelliJ IDEA.
  User: Riley
  Date: 5/8/23
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Profile"/>
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"/>
<div class="container">
    <h3>Welcome, ${sessionScope.user}.</h3>
    <h4>Viewing your profile.</h4>
</div>
<form action="logout" method="post">
    <button type="submit">Logout</button>
</form>
</body>
</html>
