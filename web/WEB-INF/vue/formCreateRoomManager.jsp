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

        <label for="id">Identifiant <span class="requis">*</span></label>
        <input type="text" id="id" name="name" value="<c:out value="${roomManager.name}"/>" size="20" maxlength="60" />
        <span class="error">${roomManagerForm.error['id']}</span>
        <br />

        <label for="password">Mot de passe <span class="requis">*</span></label>
        <input type="password" id="password" name="password" value="<c:out value="${roomManager.category}"/>" size="20" maxlength="60" />
        <span class="error">${roomManagerForm.error['category']}</span>
        <br />

        <input type="submit" value="Créer" class="sansLabel" />
        <br />

        <p class="${empty roomManagerForm.error ? 'succes' : 'error'}">${roomManagerForm.result}</p>

    </fieldset>
</form>
</body>
</html>