package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.UserDAO;

public class CalculadoraImc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        float height = Float.parseFloat(request.getParameter("height"));
        float weight = Float.parseFloat(request.getParameter("weight"));
        
        float imc = (float) (weight / (Math.pow(height, 2))); //Cáclculo do IMC
        request.setAttribute("imc", imc);
        String diagnostic = "";
        
        if(imc < 17) {
            diagnostic = "Muito abaixo do peso";
            request.setAttribute("diagnostic", diagnostic);
            request.setAttribute("image", 0);
        } else if(imc >= 17 && imc <= 18.5) {
            diagnostic = "Abaixo do peso";
            request.setAttribute("diagnostic", diagnostic);
            request.setAttribute("image", 1);
        } else if(imc >= 18.5 && imc <= 24.9) {
            diagnostic = "Peso normal";
            request.setAttribute("diagnostic", diagnostic);
            request.setAttribute("image", 2);
        } else if(imc >= 25 && imc <= 29.9) {
            diagnostic = "Acima do peso";
            request.setAttribute("diagnostic", diagnostic);
            request.setAttribute("image", 3);
        } else if(imc >= 30 && imc <= 34.9) {
            diagnostic = "Obesidade Grau 1";
            request.setAttribute("diagnostic", diagnostic);
            request.setAttribute("image", 4);
        } else if(imc >= 35 && imc <= 39.9) {
            diagnostic = "Obesidade Grau 2";
            request.setAttribute("diagnostic", diagnostic);
            request.setAttribute("image", 5);
        } else if(imc > 40) {
            diagnostic = "Obesidade Grau 3";
            request.setAttribute("diagnostic", diagnostic);
            request.setAttribute("image", 6);
        }
        
        try{
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("userSession");
            user.setImc(imc);
            user.setResultImc(diagnostic);
            UserDAO userDao = new UserDAO();
            userDao.updateUser(user); //Método que atualizará os dados no banco
        } catch (Exception erro) {
            System.out.println("Erro: "+erro);
        }
        
        request.getRequestDispatcher("imc.jsp").forward(request, response);
        
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



