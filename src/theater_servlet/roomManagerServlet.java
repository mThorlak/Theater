package theater_servlet;

import theater_beans.roomManager;
import theater_forms.createRoomManagerForm;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class roomManagerServlet extends HttpServlet {
    public static final String ATT_USER         = "roomManager";
    public static final String ATT_FORM         = "createRoomManagerForm";
    public static final String VUE              = "/WEB-INF/vue/formCreateRoomManager.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Traitement des données du formulaire */

        createRoomManagerForm roomManagerForm = new createRoomManagerForm();

        /* Appel au traitement et à la validation de la requête, et récupération du bean en résultant */
        roomManager roomManager = roomManagerForm.create( request );

        /* Stockage du formulaire et du bean dans l'objet request */
        request.setAttribute( ATT_FORM, roomManagerForm );
        request.setAttribute( ATT_USER, roomManager );

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}