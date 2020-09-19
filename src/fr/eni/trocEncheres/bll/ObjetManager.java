package fr.eni.trocEncheres.bll;

import java.sql.Date;

import fr.eni.trocEncheres.dal.ArticleVenduDAO;

public class ObjetManager {

	private ArticleVenduDAO articleVenduDAO;

	public ObjetManager() {
		// TODO Auto-generated constructor stub
	}

	public ObjetManager lireNoArticle(int noArticle) {
		return articleVenduDAO.lireNoArticle(noArticle);
	}

	public ObjetManager lireNomArticle(String nomArticle) {
		return articleVenduDAO.lireNomArticle(nomArticle);
	}

	public ObjetManager lireDescription(String description) {
		return articleVenduDAO.lireDescription(description);
	}

	public ObjetManager lireDateDebutEncheres(Date dateDebutEncheres) {
		return articleVenduDAO.lireDateDebutEncheres(dateDebutEncheres);
	}

	public ObjetManager lireDateFinEncheres(Date dateFinEncheres) {
		return articleVenduDAO.lireDateFinEncheres(dateFinEncheres);
	}

	public ObjetManager lireMiseAPrix(int miseAPrix) {
		return articleVenduDAO.lireMiseAPrix(miseAPrix);
	}

	public ObjetManager lirePrixVente(int prixVente) {
		return articleVenduDAO.lirePrixVente(prixVente);
	}

	public ObjetManager lireEtatVente(int etatVente) {
		return articleVenduDAO.lireEtatVente(etatVente);
	}
}
