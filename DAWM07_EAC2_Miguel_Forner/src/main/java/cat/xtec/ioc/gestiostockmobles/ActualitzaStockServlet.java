package cat.xtec.ioc.gestiostockmobles;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ActualitzaStockServlet")
public class ActualitzaStockServlet extends HttpServlet {

    @EJB
    // TODO EX4 - Bean necessària
    private StockSessionBean stockBS;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO EX4 - Agafar el stock de la sessió
        List<Moble> stock = stockBS.getStock();

        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>Actualitza l'estoc d'un moble</h1>");

            // TODO EX4 - Crear el formulari amb el desplegable dels noms dels mobles
           out.println("<form action='ActualitzaStockServlet' method='POST'>");
           out.println("Mobles: <br><select id='noms' name='noms'>");
           out.println("<option value=''>Selecciona un moble </option>");
           for (Moble moble : stock){
               out.println("<option value='" + moble.getNom() +"'>"+moble.getNom()+"</option>");
           }
           out.println("</select><br>");
           out.println("Quantitat: <br><input type='number' name='quantitat' required>");
           out.println("<input type='submit' value='Actualitzar estoc'></form>");
            out.println("<a href='ConsultaStockServlet'>Torna a la pàgina de consulta d'estoc</a>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                // TODO EX4 - Agafem els valors i actualitzem la quantitat del moble seleccionat
                String nomMobleNou = request.getParameter("noms");
                int quantitatMobleNou = Integer.parseInt(request.getParameter("quantitat"));
                System.out.println("Nom: " + nomMobleNou);
                System.out.println("quantitatMobleNou; " + quantitatMobleNou);
                stockBS.actualitzaMoble(nomMobleNou, quantitatMobleNou);
    

        // Després d'actualitzar, redirigim a la consulta d'estoc
        response.sendRedirect("ConsultaStockServlet");
        
    }
}
