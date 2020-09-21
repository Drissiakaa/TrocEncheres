<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modifier une vente</title>
</head>
<body>
<div>
<img alt="" src=""></div>


<form action="<%=request.getContextPath() %>/PageModifierVente" method="post">
<h3 style="text-align: center">Nouvelle vente</h3><br><br>
<label>Article:</label>&nbsp;&nbsp;
	<input type="text" id="article" name="article">
	<br><br>
	
	<label>Descritpion :</label>&nbsp;&nbsp;
	<textarea rows="" cols=""  id="decscription" name="description"></textarea>
	<br><br>
	
	<label>Catégorie :</label>&nbsp;&nbsp;
	<select>
		<option>Informatique</option>
		<option>Ameublement</option>
		<option>Vêtement</option>
		<option>Sport &amp; Loisirs</option>
	</select> 
	<br><br>
	
	<label>Photo de l'article:</label>&nbsp;&nbsp;
	<input type="file"
       id="photoArticle" name="photoArticle"
       accept="image/png, image/jpeg">
	<br><br>
	
	<label>Mise à prix :</label>&nbsp;&nbsp;
	<input type="number" id="prix" name="prix"
       min="0" max="5000">
	<br><br>
	
	<label>Début de l'enchère :</label>&nbsp;&nbsp;
	<input type="date" id="datedebut" name="datedebut">
	<br><br>
	<label>Fin de l'enchère :</label>&nbsp;&nbsp;
	<input type="date" id="datefin" name="datefin">
	<br><br>
	<fieldset name="Retrait">
	<label>Rue :</label>
	<input type="text" id="article" name="article" placeholder="">
	<label>Code postal :</label>
	<input type="text" id="article" name="article" placeholder="">
	<label>Ville :</label>
	<input type="text" id="article" name="article" placeholder="">
	</fieldset>
</form>

<input type="submit" id="enregistrer" name="Enregistrer">
<input type="button" id="annuler" name="Annuler">
<input type="button" id="annulerVente" name="Annuler la vente">

</body>
</html>