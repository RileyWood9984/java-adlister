<%--
  Created by IntelliJ IDEA.
  User: Riley
  Date: 5/8/23
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Picked Color"/>
  </jsp:include>
  <style>
    body{
      background-color:${color};
    }
  </style>
</head>
<body>
<div>
  <h1>The color is ${color}</h1>
</div>
</body>
</html>
