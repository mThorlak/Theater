<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Creation</title>
    <link type="text/css" rel="stylesheet" href="" />
</head>
<body>
<form method="post" action="createRoomManager">
    <fieldset>
        <legend>Création gestionnaire de salle</legend>
        <p>Vous pouvez créer un gestionnaire de salle via ce formulaire.</p>

        <label for="id">Identifiant <span class="requis"></span></label>
        <input type="text" id="id" name="id" value="<c:out value="${roomManager.id}"/>" size="20" maxlength="60" />
        <span class="error">${createRoomManagerForm.error['id']}</span>
        <br />

        <label for="password">Mot de passe <span class="requis"></span></label>
        <input type="password" id="password" name="password" value="<c:out value="${roomManager.password}"/>" size="20" maxlength="60" />
        <span class="error">${createRoomManagerForm.error['password']}</span>
        <br />

        <input type="submit" value="Créer" class="sansLabel" />
        <br />

        <p class="${empty createRoomManagerForm.error ? 'succes' : 'error'}">${createRoomManagerForm.result}</p>

    </fieldset>
</form>
</body>
</html>