<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/11/2020
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculate" method="post">
    <input type="text" name="num1" placeholder="Enter number 1">
    <input type="text" name="num2" placeholder="Enter number 2">
    <br><br>
    <input type="submit" value="Addition(+)" name="calculator"/>
    <input type="submit" value="Subtraction(-)" name="calculator"/>
    <input type="submit" value="Multiply(*)" name="calculator"/>
    <input type="submit" value="Division(/)" name="calculator"/>
</form>
<a href="/">Resert</a>
<h3>${result}</h3>

</body>
</html>
