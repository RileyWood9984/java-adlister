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
        <jsp:param name="title" value="Color Picker"/>
    </jsp:include>
</head>
<body>
<form action="viewcolor" method="post">
    <label for="color">Enter a color</label>
    <input type="text" name="color" id="color">
    <button type="submit">Submit</button>
</form>

</body>
</html>