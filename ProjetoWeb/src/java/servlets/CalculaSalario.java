
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Assistente;
import model.Diretor;
import model.Gerente;
import model.Oficial;


@WebServlet(name = "CalculaSalario", urlPatterns = {"/CalculaSalario"})
public class CalculaSalario extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    } 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String nomeRecebido=request.getParameter("nome");
     request.setAttribute("nome", nomeRecebido);
     
     double salarioRecebido=Double.parseDouble(request.getParameter("salario"));
     request.setAttribute("salario", salarioRecebido);
     
     double aumento=Double.parseDouble(request.getParameter("aumentoFinal"));
        if (Validate.valida(request.getParameterValues("turnos"))==false) {
            try (PrintWriter out=response.getWriter()){
                out.println("<script>"
                +"alert('Precisa marcar no minimo um turno');"
                +"history.back(-1);"
                +"</script>");
            }
        } 
        int contTurnos=0;
        
        String[]turnosRecebidos=request.getParameterValues("turnos");
        
        for (String cadaTurno : turnosRecebidos) {
            request.setAttribute("turnos[]", cadaTurno);
            contTurnos++;
           
            
        }
        request.setAttribute("contTurnos", contTurnos);
        
        switch(contTurnos){
        case 1:aumento +=3;
        break;
        case 2:aumento +=6;
        break;
        case 3:aumento +=9;
        break;}
        
        String regimeRecebido=request.getParameter("regime");
         request.setAttribute("regime", regimeRecebido);
         
         switch(regimeRecebido){
             case "Terceirizado":aumento +=0.5;
             break;
          case "Autônomo":aumento +=0.75;
             break;
          case "Contratado":aumento +=1;
             break;}
        
        String cargoRecebido=request.getParameter("cargo");
        request.setAttribute("cargo", cargoRecebido);
        
        switch(cargoRecebido){
            case "Assitente":
                Assistente assistente=new Assistente(salarioRecebido);
                request.setAttribute("novoSalario", assistente.calculaDissidio(aumento));
                request.setAttribute("aumentoFinal",Assistente.aumCateg+aumento);
                break;
                
                case "Oficial":
                Oficial oficial=new Oficial(salarioRecebido);
                request.setAttribute("novoSalario", oficial.calculaDissidio(aumento));
                request.setAttribute("aumentoFinal",Oficial.aumCateg+aumento);
                break;
                
                case "Gerente":
                Gerente gerente=new Gerente(salarioRecebido);
                request.setAttribute("novoSalario", gerente.calculaDissidio(aumento));
                request.setAttribute("aumentoFinal",Gerente.aumCateg+aumento);
                break;
                
                case "Diretor":
                Diretor diretor=new Diretor(salarioRecebido);
                request.setAttribute("novoSalario", diretor.calculaDissidio(aumento));
                request.setAttribute("aumentoFinal",Diretor.aumCateg+aumento);
                break;
               
        }
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
                
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
