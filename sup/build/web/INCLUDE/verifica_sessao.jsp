<%-- 
    Document   : verifica
    Created on : 29 de set de 2021, 19:39:31
    Author     : julio
--%>

<%@page import="model.User"%>
<%
    User userSession = (User) session.getAttribute("userSession");
    
    if(userSession == null) {
        response.sendRedirect("index.jsp");
    } else {
        %>
            <div>Bem vindo(a) <%= userSession.getUserName() %>! &nbsp;&nbsp;
                <input type="button" onclick="window.location.href='INCLUDE/encerra_sessao.jsp'"
                       value="Sair" class="btn btn-sm btn-secondary"/>
            </div>
        <%
    }
%>
