<%--
  Created by IntelliJ IDEA.
  User: thomas
  Date: 17/12/2019
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First_vue</title>
</head>
<body>
<h1>Hey congrats ! </h1>
<p>It's your first vue :)</p>
<p>
    <%
    String attribut = (String) request.getAttribute("test");
    out.println(attribut);

    String parametre = request.getParameter("auteur");
    out.println(parametre);
    %>
</p>
</body>
</html>
