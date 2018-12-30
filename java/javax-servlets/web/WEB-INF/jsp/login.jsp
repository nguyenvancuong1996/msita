<%--
  Created by IntelliJ IDEA.
  User: dinhhuy258
  Date: 12/30/18
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
        function validateLoginForm() {
            var x = document.forms["login-form"]["username"].value;
            if (x === "") {
                alert("username field must be filled out");
                return false;
            }
            x = document.forms["login-form"]["password"].value;
            if (x === "") {
                alert("password field must be filled out");
                return false;
            }

        }
    </script>
</head>

<body>
    <form name="login-form" action="/login" method="post" onsubmit="return validateLoginForm()">
        ${error_message}
        <br/>
        Username: <input name="username" type="text"/>
        <br/>
        Password: <input name="password" type="password"/>
        <br/>
        <input type="submit" value="Login">
    </form>
</body>
</html>
