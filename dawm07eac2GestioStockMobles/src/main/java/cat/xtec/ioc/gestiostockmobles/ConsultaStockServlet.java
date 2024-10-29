package cat.xtec.ioc.gestiostockmobles;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/ConsultaStockServlet")
public class ConsultaStockServlet extends HttpServlet {

    @EJB
    // TODO EX2 - Bean necessària
    StockSessionBean stockSession = new StockSessionBean();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO EX2 - Agafar el stock de la sessió
        List<Moble> stock = stockSession.getStock();
        
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
                      
            out.println("<h1>Estoc disponible</h1>");
            out.println("<table border='1'><tr><th>Nom</th><th>Preu</th><th>Quantitat</th><th>Categoria</th></tr>");
            // TODO EX2 - Mostrar els mobles de la llista de mobles
            for(Moble moble : stock){
                out.println("<tr> <td> " + moble.getNom()+"</td><td>" +
                        moble.getPreu()+"</td><td>"+moble.getQuantitat()+ moble.getCategoria()+"</td></tr>");
            }
            out.println("</table>");
            out.println("<br>");
            out.println("<a href=\"AltaMoble.html\">Afegeix un nou moble a l'estoc</a><br>");
            out.println("<br>");
            out.println("<a href=\"ActualitzaStockServlet\">Actualitza l'estoc d'un moble</a><br>");
            out.println("<br>");
            out.println("<a href=\"Login.html\">Tancar sessió</a>");
        }
    }
}
