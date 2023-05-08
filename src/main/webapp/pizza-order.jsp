<%--
  Created by IntelliJ IDEA.
  User: Riley
  Date: 5/8/23
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pizza Page"/>
    </jsp:include>
</head>
<body>
<h1>Pizza Time</h1>
<form action="pizza-order" method="post">
<section>
    <h4>Size</h4>
    <select class="form-select" name="size" id="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>

    <h4>Crust</h4>
    <select class="form-select" name="crust" id="crust">
        <option value="stuffed">Stuffed</option>
        <option value="double">Double</option>
        <option value="thin">Thin</option>
    </select>

    <h4>Sauce</h4>
    <select class="form-select" name="sauce" id="sauce">
        <option value="white">White</option>
        <option value="red">Red</option>
        <option value="pesto">Pesto</option>
    </select>
    <h4>Toppings</h4>
    <div>
        <input class="form-check" type="checkbox" value="sausage" name="top" id="sausage">
        <label class="form-check-label" for="sausage">Sausage</label>
    </div>
    <div>
        <input class="form-check" type="checkbox" value="xtr cheese" name="top" id="xtr cheese">
        <label class="form-check-label" for="xtr cheese">Extra Cheese</label>
    </div>
    <div>
        <input class="form-check" type="checkbox" value="bacon" name="top" id="bacon">
        <label class="form-check-label" for="bacon">Cream Cheese</label>
    </div>

<h4>Address</h4>
<input class="form-control" type="text" name="address" id="address">
    <button class="btn" type="submit">Order</button>
</section>
</form>

</body>
</html>
