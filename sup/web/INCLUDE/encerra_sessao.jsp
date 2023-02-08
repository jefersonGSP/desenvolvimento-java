<%-- 
    Document   : encerra_sessao
    Created on : 29 de set de 2021, 19:39:18
    Author     : julio
--%>

<%
    session.invalidate();
    response.sendRedirect(request.getContextPath()+"/index.jsp");
%>
