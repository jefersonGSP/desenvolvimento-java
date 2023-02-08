<%-- 
    Document   : home
    Created on : 5 de out de 2021, 20:44:33
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
        <div class="container mt-5 col-8">
            <div align="right">
                <%@include file="INCLUDE/verifica_sessao.jsp" %>
            </div><br/>
                <div align="center">
                    <h2>Escolha o utilitário</h2>
                    <div class="row justify-content-center">
                        <div class="col-4 bg-warning bg-opacity-25 m-2 p-5">
                            <a href="computador.jsp">
                                <img src="IMG/carro.png" alt="Computador de bordo" width="100"/>
                            </a>
                        </div>
                        <div class="col-4 bg-warning bg-opacity-25 m-2 p-5">
                            <a href="saude.jsp">
                                <img src="IMG/balanca.png" alt="Cálculo do IMC" width="100"/>
                            </a>
                        </div>
                </div>
            </div>
        </div>
        
        <script type="text/javascript" src="JS/bootstrap.min.js"/>
    </body>
</html>
