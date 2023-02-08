<%-- 
    Document   : saude
    Created on : 5 de out de 2021, 20:44:59
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
        <form action="CalculadoraImc" method="post">
            <div class="container col-8 mt-5">
                <div align="right">
                <%@include file="INCLUDE/verifica_sessao.jsp" %>
            </div><br/>
                <div align="center">
                    <h2>Dados para o cálculo do IMC:</h2><br/>
                    <div class="row">
                        <div class="col-4">
                            <label>Altura (m)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" name="height" step="0.01" class="form-control form-control-sm" required/><br/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-4">
                            <label>Peso (Kg)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" name="weight" step="0.001" class="form-control form-control-sm" required/><br/>
                        </div>
                    </div>
                    <!-- Campos de presentação -->
                    <%@include  file="INCLUDE/seleciona_dados.jsp"%>
                    <div class="row">
                        <div class="col-4">
                            <label>Último resultado (Kg/m²)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" class="form-control form-control-sm" value="<%= user.getImc() %>" readonly/><br/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-4">
                            <label>Laudo</label>
                        </div>
                        <div class="col-8">
                            <input type="text" class="form-control form-control-sm" value="<%= user.getResultImc() %>" readonly/><br/>
                        </div>
                    </div>
                    <!-- Fim -->
                    <input type="submit" value="Calcular" class="btn btn-primary col-4"/>
                    <input type="reset" value="Limpar" class="btn btn-warning col-4"/>
                </div>
            </div>
        </form>   
        <script type="text/javascript" src="JS/bootstrap.min.js"/>
    </body>
</html>
