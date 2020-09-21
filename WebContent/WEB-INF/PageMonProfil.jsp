<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Profil Utilisateur</title>
</head>
<body>
<%@ include file="entete2.html"  %>

<!-- affichage profil du utilisateur avec possibilité de modifier profil -->
<div class="form">

 <form  method ="get">
 
  <div class="form-group row">
    <label  class="col-sm-1 col-form-label">Pseudo : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputEmail3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-1 col-form-label"> Nom : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputPassword3">
    </div>
  </div>
  
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-1 col-form-label"> Prénom : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputPassword3">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-1 col-form-label"> Email : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputPassword3">
    </div>
  </div>
  
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-1 col-form-label"> Téléphone : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputPassword3">
    </div>
  </div>
  
   <div class="form-group row">
    <label for="inputPassword3" class="col-sm-1 col-form-label"> rue : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputPassword3">
  
    </div>
  </div>
  </form>
  
  
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-1 col-form-label"> Code Postale : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputPassword3">
    </div>
  </div>
  
  
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-1 col-form-label"> Ville : </label>
    <div class="col-sm-3">
      <input type="text" class="form-control" id="inputPassword3">
    </div>
  </div>
  
  

 
  <input type="submit" value="modfier" onclick="<%=request.getContextPath()%>/ModifierProfil">
  



<p class="retour"><a href=" <%=request.getContextPath()%>/PageAcceuilModeDeconnect">Retour à l'accueil</a></p>

</div>


 <%@ include file="piedDePage.html"  %>
</body>
</html>
