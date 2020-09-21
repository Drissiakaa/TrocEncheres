<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page creer compte</title>
</head>
<body>
<%@ include file="entete.html"  %>
<h2 style="text-align: center">Mon Profil </h2>
<br>
<div class="form">
   <form action="<%=request.getContextPath() %>/PageInscriptionUtilisateur" method="post">

		    <label>Nom :&nbsp;&nbsp;&nbsp;&nbsp; </label><input type="text" id="nom" name="nom"> <br>
		  
		   <label>Prénom  :&nbsp;&nbsp;&nbsp;&nbsp; </label> <input type="text" id="prenom" name="prenom"><br>
		
			<label>Pseudo :&nbsp;&nbsp;&nbsp;&nbsp;</label> <input type="text" id="pseudo" name="pseudo"><br>
			
			
		  	
		   	<label>Email :&nbsp;&nbsp;&nbsp;&nbsp; </label><input type="email" id="email" name="email"><br>
			
			 <label>Téléphone :&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" id="telephone" name="telephone"><br>
		    
			<label>Rue :&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" id="rue" name="rue"><br>
			
			<label>Ville        :&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="text" id="ville" name="ville"><br>
			
			<label>Code postal  :&nbsp;&nbsp;&nbsp;&nbsp;</label><input  id="codePostal" name="codePostal"><br>
		    <label>Mot de passe :&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="password" id="motdepasse" name="motdepasse">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>Confirmation mot de passe :&nbsp;&nbsp;&nbsp;&nbsp;</label><input type="password" id="confirmationMdp" name="confirmationMdp"><br>  <!-- &nbsp;&nbsp; -->  
	        <br>
	       <input type="submit" value="Créer">
	       <input type="button" value="Annuler" onclick="/WEB-INF/pageAccueilDeconnect.jsp">
          
	       <br>
	      <br>
     </form>
</div>
 <%@ include file="piedDePage.html"  %>
</body>
</html>