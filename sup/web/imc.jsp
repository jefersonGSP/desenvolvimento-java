<%-- 
    Document   : imc
    Created on : 5 de out de 2021, 20:44:46
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
                    <h2>Resultado do cálculo</h2><br/>
                </div>
                <div class="row">
                    <div class="container col-8">
                        <label>Valor do IMC (Kg/m²)</label>
                        <input type="text" value="<%= request.getAttribute("imc")%>" class="form-control" readonly/>
                        <br/>
                        <label>Diagnóstico</label>
                        <input type="text" value="<%= request.getAttribute("diagnostic")%>" class="form-control" readonly/>
                        <br/>
                        <div class="row justify-content-evenly mt-5">
                            <input type="button" onclick="window.location.href='saude.jsp'" value="Novo cálculo" class="btn btn-primary col-4"/>
                            <input type="button" onclick="window.location.href='home.jsp'" value="Ir para Home" class="btn btn-warning col-4"/>
                        </div>
                    </div>
                        <div class="container col-4" align="center">
                            <img src="IMG/<%= request.getAttribute("image")%>.PNG" height="100%" alt="Imagem ilustrativa do diagnóstico"/>
                        </div>
                </div>
            </div>
    </body>
</html>
