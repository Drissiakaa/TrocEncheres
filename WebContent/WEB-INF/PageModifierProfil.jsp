<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PageCréerCompte</title>
</head>
<body>

<%@ include file="entete.html"  %>
<h2 style="text-align: center">Mon Profil</h2><br><br>
<div class ="form">
<form action="<%=request.getContextPath() %>/PageMonProfil" method="post">

<label>Pseudo :</label>&nbsp;&nbsp;
	<input type="text" id="pseudo" name="pseudo">
	<br>
	<br>
	
	<label>Prénom :</label>&nbsp;&nbsp;
	<input type="text" id="prenom" name="prenom">
	<br><br>
	
	<label>Téléphone :</label>&nbsp;&nbsp;
	<input type="tel" id="telephone" name="telephone">
	<br><br>
	
	<label>Code postal :</label>&nbsp;&nbsp;
	<input type="number" id="codepostal" name="codepostal">
	<br><br>
	
	<label>Mot de passe actuel :</label>&nbsp;&nbsp;
	<input type="password" id="mdpactuel" name="mdpactuel">
	<br><br>
	
	<label>Nom :</label>&nbsp;&nbsp;
	<input type="text" id="nom" name="nom">
	<br><br>
	<label>Email :</label>&nbsp;&nbsp;
	<input type="email" id="email" name="email">
	<br><br>
	<label>Rue :</label>&nbsp;&nbsp;
	<input type="text" id="rue" name="rue">
	<br><br>
	<label>Ville :</label>&nbsp;&nbsp;
	<input type="text" id="ville" name="ville">
	<br><br>
	<label>Nouveau mot de passe :</label>&nbsp;&nbsp;
	<input type="password" id="nouveauMdp" name="nouveauMdp">
	<br><br>
	<label>Confirmation :</label>&nbsp;&nbsp;
	<input type="password" id="confirmNouveauMdp" name="confirmNouveauMdp">
	<br><br>
	<label>Crédit : </label>&nbsp;&nbsp;
	<br><br>
	<input type="submit" value="Enregistrer"  onclick="<%=request.getContextPath() %>/PageMonProfil">
	<input type="button" value="Supprimer mon compte" onclick="<%=request.getContextPath() %>/SupprimerUtilisateur">
</form>
</div>
 <%@ include file="piedDePage.html"  %>
</body>
</html>