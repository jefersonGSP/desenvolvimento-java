<%-- 
    Document   : encerra_sessao
    Created on : 28 de set de 2021, 21:21:53
    Author     : julio
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Logout</title>
        <meta http-equiv="refresh" content="3; index.jsp"/>
    </head>
    <body>
        <%
            out.println("<h3>Saindo...</h3>");

            session.invalidate();
        %>
    </body>
</html>

