package theater_forms;

import theater_beans.roomManager;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


public final class connexionRoomManager {
    private static final String FIELD_ID  = "id";
    private static final String FIELD_PASSWORD   = "password";

    private String result;
    private Map<String, String> error = new HashMap<String, String>();

    public String getResult() {
        return result;
    }

    public Map<String, String> getError() {
        return error;
    }

    public roomManager userConnect(HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
        String id = getValueField( request, FIELD_ID );
        String password = getValueField( request, FIELD_PASSWORD );

        roomManager roomManager = new roomManager();

        /* Validation du champ email. */
        try {
            validateID( id );
        } catch ( Exception e ) {
            setError( FIELD_ID, e.getMessage() );
        }
        roomManager.setId( id );

        /* Validation du champ mot de passe. */
        try {
            validatePassword( password );
        } catch ( Exception e ) {
            setError( FIELD_PASSWORD, e.getMessage() );
        }
        roomManager.setPassword( password );

        /* Initialisation du résultat global de la validation. */
        if ( error.isEmpty() ) {
            result = "Succès de la connexion.";
        } else {
            result = "Échec de la connexion.";
        }

        return roomManager;
    }

    /**
     * Valide l'adresse id saisie.
     */
    private void validateID( String id ) throws Exception {
        if ( id != null ) {
            throw new Exception( "L'ID ne peut pas être vide" );
        }
    }

    /**
     * Valide le mot de passe saisi.
     */
    private void validatePassword( String password ) throws Exception {
        if ( password != null ) {
            if ( password.length() < 3 ) {
                throw new Exception( "Le mot de passe doit contenir au moins 3 caractères." );
            }
        } else {
            throw new Exception( "Merci de saisir votre mot de passe." );
        }
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setError( String field, String message ) {
        error.put( field, message );
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValueField( HttpServletRequest request, String fieldName ) {
        String value = request.getParameter( fieldName );
        if ( value == null || value.trim().length() == 0 ) {
            return null;
        } else {
            return value;
        }
    }
}