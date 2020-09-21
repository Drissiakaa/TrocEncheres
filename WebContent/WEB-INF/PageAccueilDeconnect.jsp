<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html >
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
   
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    
    <link rel="stylesheet" href="CSS/style.css" />
    <title>Ecran accueil deconnecté</title>
  </head>
  <body>
  <%@ include file="entete.html"  %>
   

		
		
		<div id="presentationAsso"><p>L'association <strong>" les Objets sont nos amis"</strong> a pour ambition de faciliter la cession  du plus grand nombre d'objets entre participants éco-responsables .Donnez une seconde vie aux objets et  encouragez vos voisins et amis à le faire !  Pour cela , il suffit de s'inscrire  et déposer  des annonces gratuites de troc aux enchères. Ici , il n'y a pas d'échanges financiers  mais  un système de points  ! Plus vous avez de points plus vous pouvez   acquérir d'objets !  Petit bonus : <strong>Gagnez 100 points</strong> juste en vous inscrivant !</p></div>
		
		
			
			<h2 style="text-align: center">Liste des enchères</h2>

<br>
<br>



<!-- formulaire -->
<div class="form">
<form name="filtres" action="<%=request.getContextPath()%>ServletReceptionRecherchePageAccueil" method="post">
<!-- filtres et liste déroulante catégorie -->
<div>
	<label>Filtres :</label><br>
	<input type="text" id="filtres" name="filtres" placeholder=" Le nom de l'article contient...     ">
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
	<br>
	<br>
</div>
</form>
</div>

<!-- enchères en cours 1 -->

    <div class="resultatRecherche">

        <div class="card" style="width: 18rem;">
            <img src="images/tasseAcafeDev.jpg" class="card-img-top" alt="pc gamer">
            <div class="card-body">
                <h5 class="card-title">Tasse pour développeur informatique </h5>
                <p class="card-text">Gardez vos développeurs en mode focus on task.Grâce à elle plus besoin de pause café!.</p>
                <p>
                    Prix :  500 000 points <br>
                    Fin de l'enchère :
                    <br><br>
                    Vendeur : 
                </p>
                <a href=" <%=request.getContextPath()%>/PageAffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
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
              <a href=" <%=request.getContextPath()%>/PageAffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
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
               <a href=" <%=request.getContextPath()%>/PageAffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
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
                <a href=" <%=request.getContextPath()%>/PageAffichageProfilVendeur" class="btn btn-primary">Profil du vendeur</a>
            </div>
        </div>
    </div>
    
   <%@ include file="piedDePage.html"  %>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>