<%-- 
    Document   : seleciona_dados
    Created on : 7 de out de 2021, 00:52:43
    Author     : julio
--%>
<%@page import="model.UserDAO"%>
<%@page import="model.User"%>
<%
    UserDAO userDao = new UserDAO();
    User userObj = (User) session.getAttribute("userSession");
    User user = userDao.selectOneUser(userObj.getUserCod());
%>
