<%-- 
    Document   : index
    Created on : 5 de out de 2021, 20:43:39
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
        <form action="Valida" method="post">
            <div class="container col-6 mt-5">
                <div align="center">
                    <h2>Sistema de Utilidades Pessoais - SUP</h2>
                    <h4>::: Login :::</h4>
                </div>
                <label>Nome</label>
                <input type="text" name="userName" class="form-control" required/><br/>
                <label>Senha</label>
                <input type="password" name="userPass" class="form-control" required/><br/>
                <div align="center">
                    <input type="submit" value="Entrar" class="btn btn-outline-primary col-6"/>
                </div>
            </div>
        </form>
        
        <script type="text/javascript" src="js
                /bootstrap.min.js"/>
    </body>
</html>
