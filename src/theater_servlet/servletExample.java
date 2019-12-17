package theater_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "vueServlet")
public class servletExample extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // Example transmitting data and parameters
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // To see result : http://localhost:8080/Theater_war_exploded/servletExample?auteur=Michel
        //String paramAuteur = request.getParameter( "auteur" );
        String message = "Transmission de variables : OK !";
        request.setAttribute("test", message);
        this.getServletContext().getRequestDispatcher( "/WEB-INF/vue/vueExample1.jsp" ).forward(request,response );
    }
}
