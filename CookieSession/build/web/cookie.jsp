<%-- 
    Document   : Cookie
    Created on : 28 de set de 2021, 19:27:21
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recebe cookie</title>
    </head>
    <body>
        <%
            String userName = "";
            if(request.getParameter("user") != null && request.getParameter("user") != "") {
                userName = request.getParameter("user");
                String cookieUser = userName.replaceAll(" ", "-");
                
                //Criando o primeiro cookie
                Cookie cookie = new Cookie("cookieUser", cookieUser);
                cookie.setMaxAge(60*60*2); //Durará 2 horas
                response.addCookie(cookie);
                
                //Criando o segundo cookie
                Cookie cookieNum = new Cookie("cookieNum", "0");
                cookieNum.setMaxAge(60*2); //Durará 2 minutos
                response.addCookie(cookieNum);
                
            } else {
                Cookie[] cookies = request.getCookies();
                for(Cookie cookie : cookies) {
                    if(cookie.getName().equals("cookieUser")){
                        userName = cookie.getValue().replaceAll("-", " ");
                    }
                    if(cookie.getName().equals("cookieNum")){
                        int cookieInt = Integer.parseInt(cookie.getValue());
                        cookieInt++;
                        Cookie cookieNum = new Cookie("cookieNum", String.valueOf(cookieInt));
                        response.addCookie(cookieNum);
                    }
                }
                if(userName.equals("")){
                    response.sendRedirect("index.jsp");
                }
            }
                        
            out.println("<h1>Seja bem vindo "+userName+"!</h1>");

        %>
    </body>
</html>
