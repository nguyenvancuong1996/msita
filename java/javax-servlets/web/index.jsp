<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <%
      out.println("You ip address: " + request.getRemoteAddr());
    %>
    <br/>
    <jsp:include page="WEB-INF/jsp/date.jsp"/>
  </body>
</html>