<%-- 
    Document   : resultado
    Created on : 22 de set de 2021, 20:55:16
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado do Calculo</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
    <form action="" method="post">
        <div class="borda">
        <h2>Resultado do Calculo</h2>
        <div class="container"> 
        Nome:<% %>
        <b><%=request.getAttribute("nome")%></b>
        </div>

        <div class="container"> 
        Salario atual:
        <b><%=request.getAttribute("salario")%></b></div>
    

        <div class="container"> 
        Cargo:
        <b><%=request.getAttribute("cargo") %></b></div>
    

        <div class="container"> 
        Turnos(s):[<%=request.getAttribute("contTurnos")%>]
        <% for (String cadaTurno:request.getParameterValues("turnos")) {
            out.println("<b>"+cadaTurno+"</b>");
        }%></div>
  

        <div class="container"> 
        Regime:
        <b><%=request.getAttribute("regime")%></b></div>


        <div class="container"> 
        Percentual de aumento:
        <b><%=request.getAttribute("aumentoFinal")%></b></div>


        <div class="container"> 
        Valor do salario atualizado:
        <b><%=request.getAttribute("novoSalario")%></b></div>
        <div class="botoes">
        <input type="button" value="Novo Calculo" onclick="history.back(-1);"></div>
    </div>
    </form>
    </body>
</html>
