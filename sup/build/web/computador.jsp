<%-- 
    Document   : computador
    Created on : 5 de out de 2021, 20:44:06
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
        <form action="ComputadorDeBordo" method="post">
            <div class="container col-8 mt-5">
                <div align="right">
                <%@include file="INCLUDE/verifica_sessao.jsp" %>
            </div><br/>
                <div align="center">
                    <h2>Dados para o computador de bordo:</h2><br/>
                    <div class="row">
                        <div class="col-4">
                            <label>Total de combustível (litros)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" name="gas" step="0.1" class="form-control form-control-sm" required/><br/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-4">
                            <label>Preço do combustível (R$)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" name="price" step="0.01" class="form-control form-control-sm" required/><br/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-4">
                            <label>Consumo médio (Km/litro)</label>
                        </div>
                        <div class="col-8">
                            <input type="number" name="consum" step="0.1" class="form-control form-control-sm" required/><br/>
                        </div>
                    </div>
                    <input type="submit" value="Calcular" class="btn btn-primary col-4"/>
                    <input type="reset" value="Limpar" class="btn btn-warning col-4"/>
                </div>
            </div>
        </form>
        
        <script type="text/javascript" src="js/bootstrap.min.js"/>
    </body>
</html>

