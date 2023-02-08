package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.UserDAO;

public class Valida extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            HttpSession session = request.getSession();
            
            String userName = request.getParameter("userName");
            String userPass = request.getParameter("userPass");
            
            User user = new User(userName, userPass);
            
            try {
                if(user.isLogged()) {
                    UserDAO userDao = new UserDAO();
                    ArrayList<User> listUser = userDao.selectUser();
                    for(User userVar : listUser) {
                        if(userVar.getUserName().equals(userName) && userVar.getUserPass().equals(userPass)) {
                            user.setUserCod(userVar.getUserCod());
                            session.setAttribute("userSession", user);
                        }
                    }
                    
                    response.sendRedirect("home.jsp");
                } else {
                    response.sendRedirect("index.jsp");
                }
            } catch (Exception erro) {
                System.out.println("Erro: "+erro);
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
