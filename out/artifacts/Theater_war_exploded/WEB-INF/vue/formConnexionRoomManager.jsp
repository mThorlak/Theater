<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Connexion</title>
    <link type="text/css" rel="stylesheet" href="" />
</head>
<body>
<form method="post" action="connectRoomManager">
    <fieldset>
        <legend>Connexion Room Manager</legend>
        <p>Vous pouvez vous connecter via ce formulaire.</p>

        <label for="id">Identifiant <span class="requis">*</span></label>
        <input type="text" id="id" name="id" value="<c:out value="${roomManager.id}"/>" size="20" maxlength="60" />
        <span class="error">${formConnexionRoomManager.error['id']}</span>
        <br />

        <label for="password">Mot de passe <span class="requis">*</span></label>
        <input type="password" id="password" name="password" value="" size="20" maxlength="20" />
        <span class="error">${formConnexionRoomManager.error['password']}</span>
        <br />

        <input type="submit" value="Connexion" class="sansLabel" />
        <br />

        <p class="${empty formConnexionRoomManager.error ? 'succes' : 'error'}">${formConnexionRoomManager.error}</p>
    </fieldset>
</form>
</body>
</html>