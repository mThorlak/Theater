package theater_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class restrictiveAccess extends HttpServlet {
    public static final String PUBLIC_ACCESS     = "/accessRoomManagerNO.jsp";
    public static final String RESTRICTIVE_ACCESS  = "/WEB-INF/vue/accessRoomManagerOK.jsp";
    public static final String USER_SESSION = "userSession";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();

        /*
         * Si l'objet utilisateur n'existe pas dans la session en cours, alors
         * l'utilisateur n'est pas connecté.
         */
        if ( session.getAttribute( USER_SESSION ) == null ) {
            /* Redirection vers la page publique */
            response.sendRedirect( request.getContextPath() + PUBLIC_ACCESS );
        } else {
            /* Affichage de la page restreinte */
            this.getServletContext().getRequestDispatcher( RESTRICTIVE_ACCESS ).forward( request, response );
        }
    }
}