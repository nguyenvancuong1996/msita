<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form processing get method result</title>
</head>
<body>
    <%
        String[] parameterValues = request.getParameterValues("subject");
        if (parameterValues == null || parameterValues.length == 0) {
            out.println("Empty");
        }
        else {
            for (String subject : parameterValues) {
                out.println(subject);
            }
        }
    %>
</body>
</html>
