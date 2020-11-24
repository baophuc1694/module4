<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/11/2020
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        h1{
            color: tomato;
        }


        label{
            font-weight: bolder;
            color: blue;
        }


        h2{
            font-weight: bold;
            color: green;
        }
    </style>
</head>
<body>
<h1>Sandwich Condiment</h1>
<form action="/save" method="post">
<input type="checkbox"  id="lettuce" name="condiment" value="lettuce">
<label for="lettuce">Lettuce</label>

<input type="checkbox" id="tomato" name="condiment" value="tomato">
<label for="tomato">Tomato</label>

<input type="checkbox" id="mustard" name="condiment" value="mustard">
<label for = "mustard">Mustard</label>

<input type="checkbox" id="sprouts" name="condiment" value="sprouts">
<label for = sprouts>Sprouts</label>

<input type="hidden" name="condiment">
<br><br>
    <hr/>

<input type="submit" value="Save">
    <hr/>
</form>

<h2>${result}</h2>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js"
        integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
        crossorigin="anonymous"></script>
</body>
</html>
