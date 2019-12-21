package theater_forms;

import theater_beans.roomManager;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public final class createRoomManagerForm {

    private static final String FIELD_ID = "id";
    private static final String FIELD_PASSWORD = "password";

    private String result;
    private Map<String, String> error = new HashMap<String, String>();

    public String getResult() {
        return result;
    }

    public Map<String, String> getError() {
        return error;
    }

    public roomManager create(HttpServletRequest request) {
        String id = getValueField(request, FIELD_ID);
        System.out.println(id);
        String password = getValueField(request, FIELD_PASSWORD);
        System.out.println(password);

        roomManager roomManager = new roomManager();

        try {
            validateString(id);
        } catch (Exception e) {
            setError(FIELD_ID, e.getMessage());
        }
        roomManager.setId(id);

        try {
            validateString(password);
        } catch (Exception e) {
            setError(FIELD_PASSWORD, e.getMessage());
        }
        roomManager.setPassword(password);

        if (error.isEmpty()) {
            result = "Succès de la création du pestacle.";
        } else {
            result = "Échec de la création du pestacle.";
        }

        return roomManager;
    }

    private void validateString(String value) throws Exception {
        if (value == null)
            throw new Exception("Le champ ne ne peut pas être vide.");
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setError(String field, String message) {
        error.put(field, message);
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValueField(HttpServletRequest request, Object fieldValue) {

        String valeur = request.getParameter((String) fieldValue);
        if (valeur == null || valeur.trim().length() == 0) {
            return null;
        } else {
            return valeur.trim();
        }
    }
}

