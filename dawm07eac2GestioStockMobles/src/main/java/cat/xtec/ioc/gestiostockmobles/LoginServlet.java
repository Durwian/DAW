package cat.xtec.ioc.gestiostockmobles;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // TODO EX1 - Validació simple per a exemple (usuari: el teu nom, contrasenya: el teu cognom)
        // TODO EX1 - En cas de no entrar quedar-nos a login.html
        // TODO EX1 - L'usuari ha de mantenir-se durant tota la sessió
        
    }
}