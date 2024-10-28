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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO EX4 - Agafar el stock de la sessió
        List<Moble> stock = 

        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1>Actualitza l'estoc d'un moble</h1>");

            // TODO EX4 - Crear el formulari amb el desplegable dels noms dels mobles
            

            out.println("<a href='ConsultaStockServlet'>Torna a la pàgina de consulta d'estoc</a>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                // TODO EX4 - Agafem els valors i actualitzem la quantitat del moble seleccionat
        

        // Després d'actualitzar, redirigim a la consulta d'estoc
        response.sendRedirect("ConsultaStockServlet");
    }
}
