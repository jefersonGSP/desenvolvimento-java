<%-- 
    Document   : resultado
    Created on : 7 de out de 2021, 19:34:22
    Author     : julio
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="css/estilo.css">
        <link rel="stylesheet" href="css/bootstrap.css">
    </head>
    <body>
         <div class="borda">  
                <div align="center">
                    <% 
                    if (request.getAttribute("newUser") != null  ) {
                        User newUser= (User) request.getAttribute("newUser");   
                                          
                    %>
              
                    
               <tr><td align="left">ID:</td> <td align="right"> <%= newUser.getId()  %>   </td>  </tr>
              <tr><td align="left">EMAIL:</td> <td align="right"><%= newUser.getEmail()  %> </td>  </tr>
              <tr><td align="left">SENHA:</td> <td align="right"><%= newUser.getPassword()  %>  </td>  </tr>
                  <% 
                      } else  { %>
                      <div>Usuario não registrado</div>
              <%
                        }                  
                    %>  
                     
               
               
            </div>
            </div>
    </body>
</html>
