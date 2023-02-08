
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessaVenda extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=ISO-8859-1");
        
      String produto= request.getParameter("produto");
      double preco= Double.parseDouble(request.getParameter("preco"));
      int qtde=Integer.parseInt(request.getParameter("qtde"));
      double valorTotal=preco*qtde;
      final Calendar dataDaVenda=Calendar.getInstance();
      

        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessaVenda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Dados da Venda</h1>");
            out.println("<p>Produto: "+produto+"</p>");
            out.println("<p>Preço: R$"+preco+"</p>");
            out.println("<p>Quantidade: "+qtde+"</p>");
            out.println("<hr/><p>Valor total: R$"+valorTotal+"</p>");
            out.println("<hr/><p>Venda cadastrada em: "+dataDaVenda.getTime()+"</p>");
         
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
