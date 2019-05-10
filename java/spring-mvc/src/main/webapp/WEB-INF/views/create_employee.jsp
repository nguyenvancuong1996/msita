<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add user</title>
</head>
<body>
    <form:form action="/createEmployee" 
               method="post" 
               modelAttribute="employeeForm">
        <form:label path="name">Name: </form:label>
        <form:input path="name"/>
        <br>
        <form:label path="gender">Gender: </form:label>
        <form:radiobuttons path="gender" items="${genders}"/>
        <br>
        <form:label path="homeTown">Hometown:</form:label>
        <form:input path="homeTown"/>
        <br>
        <form:label path="companyId">Company: </form:label>
        <form:select path="companyId" items="${companies}"/>
        <br>
        <input type="submit" value="Create company"/>
    </form:form>
</body>
</html>
