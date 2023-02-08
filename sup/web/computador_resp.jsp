<%-- 
    Document   : computador_resp
    Created on : 5 de out de 2021, 20:44:21
    Author     : julio
--%>


<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="IMG/favicon.ico"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <title>SUP</title>
    </head>
    <body>
            <div class="container col-8 mt-5">
                <div align="right">
                <%@include file="INCLUDE/verifica_sessao.jsp" %>
            </div><br/>
                <div align="center">
                    <h2>Resultado do cálculo:</h2><br/>
                    <div class="row">
                        <div class="col-4">
                            <label>Distância (Km)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" value="<%= request.getAttribute("distance") %>" class="form-control form-control-sm" readonly/><br/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-4">
                            <label>Valor total (R$)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" value="<%= request.getAttribute("totalValue") %>" class="form-control form-control-sm" readonly/><br/>
                        </div>
                    </div>
                        <input type="button" value="Novo cálculo" class="btn btn-primary col-4" onclick="window.location.href='computador.jsp'"/>
                        <input type="button" value="Ir para Home" class="btn btn-warning col-4" onclick="window.location.href='home.jsp'"/>
                </div>
            </div>
        <script type="text/javascript" src="JS/bootstrap.min.js"/>
    </body>
</html>
