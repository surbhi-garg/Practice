<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 15/3/19
  Time: 10:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>StudentForm</title>
</head>
<body>
<form method="post" action="/student3/submitFormData">
    <label for="fname">First Name:</label>
    <input type="text" name="firstName" id="fname"/><br/>
    <label for="lname">Last Name:</label>
    <input type="text" name="lastName" id="lname"/><br/>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
