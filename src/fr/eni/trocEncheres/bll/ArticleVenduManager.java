package fr.eni.trocEncheres.bll;

import java.util.Date;

import fr.eni.trocEncheres.bo.ArticleVendu;
import fr.eni.trocEncheres.bo.Categorie;
import fr.eni.trocEncheres.bo.Retrait;
import fr.eni.trocEncheres.bo.Utilisateur;
import fr.eni.trocEncheres.dal.ArticleVenduDAO;

public class ArticleVenduManager {

	

	
	
		
		// variable membre (pour accès à la DAL)	
	private ArticleVenduDAO ArticleVenduDAO;



	//CONSTRUCTEUR
		public ArticleVenduManager() {}
		
		
		
		//pour recuperer  les valeurs des attributs d'un Article en vente pour affichage selection recherche
		public ArticleVendu Select(int noArticle,String nomArticle,String description,Date dateDebutEncheres,
		Date dateFinEncheres,int miseAPrix,int prixVente,int etatVente,Retrait lieuRetrait,Utilisateur vente,Categorie categorieArticle) {
			return ArticleVenduDAO .Select(noArticle,nomArticle,description,dateDebutEncheres,dateFinEncheres,miseAPrix,
					 prixVente,	etatVente,lieuRetrait,vente,categorieArticle);
		}
		
		
		
			
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
