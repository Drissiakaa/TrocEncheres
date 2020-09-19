<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Ecran accueil connecté</title>
</head>
<body>
<%@ include file="entete2.html"  %>
	
	  <h2>Liste des enchères</h2>
			
	
			
<!-- formulaire -->
<div class ="form">
<form name="filtres" action="" method="get">

<!-- filtres et liste déroulante catégorie -->
<div>
	<label>Filtres :</label><br><br>
	<input type="text" id="filtres" name="filtres" placeholder="Le nom de l'article contient">
	<br><br>
	<label>Catégorie : </label>
	<select>
		<option>Toutes</option>
		<option>Informatique</option>
		<option>Ameublement</option>
		<option>Vêtement</option>
		<option>Sport &amp; Loisirs</option>
	</select> 
	<input type="submit" name="boutonrechercher" value="rechercher" title="Rechercher">
</div>


<br>

<br>
<!-- achats / mes ventes -->
<div>
 <input type="radio" id="achat" name="achat" value="achat">
  <label for="achat"><strong>Mes Achats</strong></label><br>
  <input type="checkbox" id="enchères ouvertes" name="enchères ouvertes">
  <label for="enchères ouvertes">enchères ouvertes</label><br>
  <input type="checkbox" id="enchères ouvertes" name="enchères ouvertes">
  <label for="enchères ouvertes">mes enchères en cours</label><br>
  <input type="checkbox" id="enchères ouvertes" name="enchères ouvertes">
  <label for="enchères ouvertes">mes enchères remportées</label>
  <br>
<input type="radio" id="mes ventes" name="mes ventes" value="mes ventes">
  <label for="achat"><strong>Mes ventes</strong></label><br>
  <input type="checkbox" id="enchères ouvertes" name="enchères ouvertes">
  <label for="enchères ouvertes">mes ventes en cours</label><br>
  <input type="checkbox" id="enchères ouvertes" name="enchères ouvertes">
  <label for="enchères ouvertes">ventes non débutées</label><br>
  <input type="checkbox" id="enchères ouvertes" name="enchères ouvertes">
  <label for="enchères ouvertes">ventes terminées</label><br>


 </div>
      
  

    <div class="From">

      
            
            <!-- enchères en cours 1 -->
    <div class="resultatRecherche">

        <div class="card" style="width: 18rem;">
            <img src="images/tasseAcafeDev.jpg" class="card-img-top" alt="pc gamer">
            <div class="card-body">
                <h5 class="card-title">Tasse pour développeur informatique </h5>
                <p class="card-text">Gardez vos développeurs en mode focus .Grâce à elle plus besoin de pause café!.</p>
                <p>
                    Prix :  500 000 points br>
                    Fin de l'enchère :
                    <br><br>
                    Vendeur : 
                </p>
                <a href=" <%=request.getContextPath()%>/AffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
            </div>
        </div>
 

        <div class="card" style="width: 18rem;">
            <img src="images/crinDeLicorne.jpg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Crin de licorne </h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <p>
                    Prix : points<br>
                    Fin de l'enchère :
                    <br><br>
                    Vendeur : 
                </p>
              <a href=" <%=request.getContextPath()%>/AffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
            </div>
        </div>
        <div class="card" style="width: 18rem;">
            <img src="images/matelasUnePersonne.jpg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">matelas pour une personne</h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <p>
                    Prix : points<br>
                    Fin de l'enchère :
                    <br><br>
                    Vendeur : 
                </p>
               <a href=" <%=request.getContextPath()%>/AffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
            </div>
        </div>
 

        <div class="card" style="width: 18rem;">
            <img src="images/sandale-brosse-lave-pied.jpg" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">Sandale brosse lave pieds</h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <p>
                    Prix : points<br>
                    Fin de l'enchère :
                    <br><br>
                <p>        Vendeur : </p>
                <a href=" <%=request.getContextPath()%>/AffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
            </div>
        </div>
    </div>
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        </form>
    </div>
    </div>
    <br>







    


 <%@ include file="piedDePage.html"  %>

  <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>


</body>
</html>