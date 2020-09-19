<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profil vendeur</title>
</head>
<body>
<%@ include file="entete2.html"  %>

<h3 class="retour">Profil du vendeur</h3>
<br>
<br>

<div class="form">
<div>
Pseudo :
</div>
<div>
Nom : 
</div>
<div>
Prénom: 
</div>
<div>
Email : 
</div>
<div>
Téléphone : 
</div>
<div>
Rue : 
</div>
<div>
Code Postal : 
</div>
<div>
Ville : 
</div>
</div>
<p class="retour"><a href=" <%=request.getContextPath()%>/PageAcceuilModeConnect">Retour à l'accueil</a></p>
 <%@ include file="piedDePage.html"  %>
</body>
</html>