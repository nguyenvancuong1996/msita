<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    Welcome to jsp tutorial
    <br/>
    <label>${username}</label>
    <form method="post" action="/logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
