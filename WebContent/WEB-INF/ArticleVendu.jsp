<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page Créer une nouvelle vente</title>
</head>
<body>
<%@ include file="entete2.html"  %>

<h2 style="text-align: center">Nouvelle Vente</h2><br><br>

<div class="form">
<form action="<%=request.getContextPath() %>/PageArticleVendu" method="post">



<label>Article:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>&nbsp;&nbsp;
	<input type="text" id="article" name="article">
	<br><br>
	
	<label>Descritpion :</label>&nbsp;&nbsp;
	<textarea rows="" cols="" type="text" id="decscription" name="description"></textarea>
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
       min="0" max="5000"> points
	<br><br>
	
	<label>Début de l'enchère :</label>&nbsp;&nbsp;
	<input type="date" id="datedebut" name="datedebut">
	<br><br>
	<label>Fin de l'enchère :</label>&nbsp;&nbsp;
	<input type="date" id="datefin" name="datefin">
	<br><br>
	<fieldset name="Retrait">
	<h5> Lieu du retrait</h5>
	<label>Rue :</label>
	<input type="text" id="article" name="article" placeholder=""><br>
	<label>Code postal :</label>
	<input type="text" id="article" name="article" placeholder=""> <br>
	<label>Ville :</label>
	<input type="text" id="article" name="article" placeholder="">
	<br>
	</fieldset>
	<br>
	<button type="button" class="btn btn-dark">Enregistrer </button>
    <button type="button" class="btn btn-dark">Annuler </button>
    <button type="button" class="btn btn-dark">Annuler la vente</button>
</form>
<br>

<p class ="retour"><a href=" <%=request.getContextPath()%>/PageAcceuilModeConnect">Retour à l'accueil</a></p>
</div>



 <%@ include file="piedDePage.html"  %>
</body>
</html>