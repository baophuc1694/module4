<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/11/2020
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/convert" method="post">

    <label>
      Rate:
      <input type="text" name="rate" placeholder="Input Rate"/>
    </label>
    <br><br>

    <label>
      USD:
      <input type="text" name="usd" placeholder="Enter USD"/>
    </label>
    <br><br>

    <input class="submit" type="submit" value="Convert"/>

  </form>
  </body>
</html>
