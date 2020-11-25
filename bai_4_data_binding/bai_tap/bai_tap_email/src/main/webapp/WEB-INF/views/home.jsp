<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/11/2020
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/up" modelAttribute="update" method="post">
<p>Languages :
    <span><form:select type="text" path="language" items="${languages}"/> </span>

</p>


<p>Page Size:
    <span>Show</span>
    <span><form:select type="text" path="pageSize" items="${pageSizes}"/>
        <span>email</span>
        </span>
</p>

<p>Spams Filter:
    <input type="checkbox" name="spamsFilter" checked="checked" value="true"/>
    <label>page</label>
</p>

<p>Signature:
    <textarea name="signature" id="" cols="30" rows="10"></textarea>
    <br>
</p>
<input type="submit" value="Update"/>

</form:form>
</body>
</html>
