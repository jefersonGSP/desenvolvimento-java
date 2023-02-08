<%-- 
    Document   : index
    Created on : 15 de set de 2021, 19:52:45
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>App de Vendas</title>
    </head>
    <body>
        <h1>Paginas de vendas</h1>
        <form action="ProcessaVenda" method="post">
            <p>Produto:</p>
            <input type="text" name="produto" placeholder="Nome do produto">
            <p>Preço:</p>
            <input type="number" name="preco" placeholder="Preço do produto" step="0.01">
            <p>Quandidade:</p>
            <input type="number" name="qtde"  step="1">
            <br><br>
            <input type="submit" value="Prosseguir">
            <input type="reset" value="Limpar">
            
        </form>
    </body>
</html>
