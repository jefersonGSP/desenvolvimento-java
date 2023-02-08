<%-- 
    Document   : pega_data
    Created on : 20 de set de 2021, 19:11:25
    Author     : julio
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.DataHora" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pega data</title>
    </head>
    <body>
        <h1>Data e hora:</h1>
        <%
            DataHora.dataAtual();
         %>
         <br/>
         <%
            DataHora.horaAtual();
         %>
        
    </body>
</html>
