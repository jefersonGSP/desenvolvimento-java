<%-- 
    Document   : pagetwo
    Created on : 13 de set de 2021, 21:19:07
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> <div>
            <h1>Vendas de produtos</h1>
            <form method="post" action="ProcessaVenda">
            Produto:<br>
            <input type="text" name="produto" placeholder="Digite o nome do produto"/><br>
            Preço:<br>
            <input type="text" name="preco" placeholder="Digite o preço do produto"/><br>
            Quantidade:<br>
            <input type="number" step="1" name="qtde"/><br><br>
            <input type="submit" value="Proximo" />
              <input type="reset" value="Limpar"/>  
            </form>            
        </div>
              
    

            </body>
</html>
