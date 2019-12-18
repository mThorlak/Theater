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
<form method="post" action="createPestacle">
    <fieldset>
        <legend>Création d'un pestacle</legend>
        <p>Vous pouvez créer un pestacle via ce formulaire.</p>

        <label for="name">Nom du pestacle <span class="requis">*</span></label>
        <input type="text" id="name" name="name" value="<c:out value="${pestacle.name}"/>" size="20" maxlength="60" />
        <span class="error">${formPestacle.error['name']}</span>
        <br />

        <label for="category">Catégorie <span class="requis">*</span></label>
        <input type="text" id="category" name="category" value="<c:out value="${pestacle.category}"/>" size="20" maxlength="60" />
        <span class="error">${formPestacle.error['category']}</span>
        <br />

        <label for="date">Date <span class="requis">*</span></label>
        <input type="Date" id="date" name="date" value="" size="20" maxlength="60" />
        <span class="error">${formPestacle.error['date']}</span>
        <br />

        <label for="place">Nombre de place</label>
        <input type="text" id="place" name="place" value="<c:out value="${pestacle.place}"/>" size="20" maxlength="20" />
        <span class="error">${formPestacle.error['place']}</span>
        <br />

        <input type="submit" value="Créer" class="sansLabel" />
        <br />

        <p class="${empty formPestacle.error ? 'succes' : 'error'}">${formPestacle.result}</p>

    </fieldset>
</form>
</body>
</html>