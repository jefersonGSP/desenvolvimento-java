<%-- 
    Document   : captura_dados
    Created on : 15 de set de 2021, 21:38:13
    Author     : jeferson
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1" import="model.User"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Captura dados</title>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>Capturando dados com JSP</h1>
        <form method="post" action="captura_dados.jsp">
            <p>
                <label>Nome:</label>
                <input type="text" name="user" id="userField" required/>
            </p>
            <p>
                <input type="submit" value="Registrar"/>
            </p>
        </form>
        
        <%
            String userName = request.getParameter("user");
            String userIp = request.getRemoteAddr();
                        
            if (userName != "" && userName != null) {
        
                User user = new User();
                user.setName(userName);
                user.setIp(userIp);
                
                User.userInstance.setListaUser(user);
                
                for(int i=0; i < User.userInstance.listSize(); i++) {
            out.println("<hr/>" + User.userInstance.getListaUser(i) + " <input type='button' onclick=window.location.href='delete?indexDel="+i+"' value='Apagar' />");
                }
            } else if(User.userInstance.listSize() > 0) {
                for(int i=0; i < User.userInstance.listSize(); i++) {
            out.println("<hr/>" + User.userInstance.getListaUser(i) + " <input type='button' onclick=window.location.href='delete?indexDel="+i+"' value='Apagar' />");
                }
            } else {
                out.println("Registre um usuário");
            }
        %>
        
    </body>
        
</html>







