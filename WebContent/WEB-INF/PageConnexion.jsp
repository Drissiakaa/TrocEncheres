<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
    <!-- media querries -->
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  
    <!-- Bootstrap core CSS -->
   
 
    <link href="css/style.css" rel="stylesheet">

   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page de Connexion au compte Utilisateur</title>
</head>

<body>
<%@ include file="entete.html"  %>

 

<div class="form">

 <form action ="<%=request.getContextPath()%>/PageConnexionUser" method ="post">
 
  <div class="form-group row">
    <label for="login" class="col-sm-1 col-form-label"> Pseudo  </label>
    <div class="col-sm-3">
      <input type="text"  name ="login" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="password" class="col-sm-1 col-form-label"> Mot de passe  </label>
    <div class="col-sm-3">
      <input type="text" name ="password"class="form-control" id="inputPassword3">
    </div>
  </div>
  
  
  <div class="form-group row">
    <div class="col-sm-10">
      <div class="form-check">
        <input class="form-check-input" type="checkbox" id="gridCheck1">
        <label class="form-check-label" for="gridCheck1">
          Se souvenir de moi
        </label>
      </div>
    </div>
  </div>
  
  <div class="form-group row">
    <div class="col-sm-10">
     <button type="submit" class="btn btn-primary btn-lg" onclick="<%=request.getContextPath()%>/PageConnexionUser">Se connecter</button>
     <br><br><br>
      <button  class ="button" type="submit"  onclick="<%=request.getContextPath()%>/PageInscriptionUtilisateur" >Créer un compte</button>
    </div>
  </div>
   <p><a href=" <%=request.getContextPath()%>/ServletTraitementMotDePasseOublié">Mot de passe oublié</a></p>
  <br>
       <p class="retour"><a href=" <%=request.getContextPath()%>/PageAccueilModeDeconnect">Retour à l'accueil</a></p>
 
  
</form>

</div>
	<br>
   <%@ include file="piedDePage.html"  %>     
    </body>
</html>
 