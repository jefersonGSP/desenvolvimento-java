<%-- 
    Document   : index
    Created on : 28 de set de 2021, 19:26:45
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookie & Session</title>
    </head>
    <body>
        <form method="post" action="cookie.jsp">
            <h1>Testando cookie</h1>
            <input type="text" name="user" placeholder="Insira um dado qualquer..." required/>
            <input type="submit" value="Enviar"/>
            <%

                Cookie[] cookies = request.getCookies();
                for(Cookie cookie : cookies) {
                    if(cookie.getName().equals("cookieUser")){
                        response.sendRedirect("cookie.jsp");
                        //out.println("<input type='button' onclick=window.location.href='cookie.jsp?user="+cookie.getValue()+"' value='Ir para outra página!'>");
                    }
                }

            %>
            
        </form>
        
            <h1>Teste de Session</h1>    
            <form action="index.jsp" method="post">
                <input type="text" name="userName" placeholder="Seu nome"/>
                <input type="password" name="userPass" placeholder="Sua senha"/>
                <input type="submit" value="Enviar"/>
            </form>
            <%
                String userSession = (String)session.getAttribute("userSession");
                if(userSession != null) {
                    response.sendRedirect("session.jsp");
                }
                
                String userName = request.getParameter("userName");
                String userPass = request.getParameter("userPass");
                
                if(userName != null && userPass.equals("1234")) {
                    session.setAttribute("userSession", userName);
                    response.sendRedirect("session.jsp");
                }
            %>    
    </body>
</html>
