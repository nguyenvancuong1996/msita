<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create company</title>
</head>
<body>
    <form action="/createCompany" method="post">
        <label>Name</label>
        <input type="text" name="companyName"/>
        <br>
        <input type="submit" value="Create company"/>
    </form>
</body>
</html>
