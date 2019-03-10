<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
    <form action="/deleteUser" method="post">
        Id: <input type="text" name="userId">
        <input type="submit" value="Delete user">
    </form>
</body>
</html>
