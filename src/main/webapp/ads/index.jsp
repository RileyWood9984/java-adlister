<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Riley
  Date: 5/8/23
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Ad list"/>
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"/>
<div class="container">
    <h1>Ad List</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <div class="container-fluid">
                <h4>Title: ${ad.title}</h4>
                <h4>User Id: ${ad.userId}</h4>
                <p>Description: ${ad.description}</p>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
