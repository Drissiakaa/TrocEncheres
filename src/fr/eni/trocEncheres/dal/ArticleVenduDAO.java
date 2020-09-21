package fr.eni.trocEncheres.dal;

import java.sql.Date;

import fr.eni.trocEncheres.bll.ObjetManager;
import fr.eni.trocEncheres.bo.ArticleVendu;
import fr.eni.trocEncheres.bo.Categorie;
import fr.eni.trocEncheres.bo.Retrait;
import fr.eni.trocEncheres.bo.Utilisateur;

public interface ArticleVenduDAO {
	
	
	//pour recuperer  les valeurs des attributs d'un Article en vente pour affichage selection recherche
		

		public ArticleVendu Select(int noArticle, String nomArticle, String description, java.util.Date dateDebutEncheres,
				java.util.Date dateFinEncheres, int miseAPrix, int prixVente, int etatVente, Retrait lieuRetrait,
				Utilisateur vente, Categorie categorieArticle);
		

		// enregistrer un nouvel article mis en vente
	public void insert(ArticleVendu articleVendu) throws BusinessException;
	
	
	// lire les articles par leur attributs pour traitement affichage dans jsp
	public ObjetManager lireNomArticle(String nomArticle);

	public ObjetManager lireNoArticle(int noArticle);

	public ObjetManager lireDescription(String description);

	public ObjetManager lireDateDebutEncheres(Date dateDebutEncheres);

	public ObjetManager lireDateFinEncheres(Date dateFinEncheres);

	public ObjetManager lireMiseAPrix(int miseAPrix);

	public ObjetManager lirePrixVente(int prixVente);

	public ObjetManager lireEtatVente(int etatVente);
	
	// supprimer un  article mis en vente par son id
	public void delete(int noArticle);


	


	
	
	
}