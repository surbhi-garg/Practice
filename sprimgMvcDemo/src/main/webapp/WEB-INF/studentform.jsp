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
<%--Question10--%>
${heading}
<form method="post" action="/student2/submitForm">
    <label for="fname">First Name:</label>
    <input type="text" name="fname" id="fname"/><br/>
    <label for="lname">Last Name:</label>
    <input type="text" name="lname" id="lname"/><br/>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
