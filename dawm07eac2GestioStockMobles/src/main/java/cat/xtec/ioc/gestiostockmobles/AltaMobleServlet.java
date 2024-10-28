package cat.xtec.ioc.gestiostockmobles;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AltaMobleServlet")
public class AltaMobleServlet extends HttpServlet {

    @EJB
    // TODO EX3 - Bean necessària

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO EX3 - Agafem els paràmetres i afegir el moble al bean d'estoc
        
        // Redirigim a la pàgina de consulta d'estoc després d'afegir el moble
        response.sendRedirect("ConsultaStockServlet");
    }
}
