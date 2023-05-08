<%--
  Created by IntelliJ IDEA.
  User: Riley
  Date: 5/8/23
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Guessing Game"/>
    </jsp:include>

</head>
<body>
<form action="guess" method="post">
    <div>
        <label for="guess" >Guess A Number Between 1-3
            <input type="text" name="guess" id="guess">
        </label>
        <button type="submit">Submit</button>
    </div>
</form>
</body>
</html>
