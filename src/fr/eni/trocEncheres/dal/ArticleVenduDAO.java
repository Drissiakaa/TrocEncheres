package fr.eni.trocEncheres.dal;

import java.sql.Date;

import fr.eni.trocEncheres.bll.ObjetManager;
import fr.eni.trocEncheres.bo.ArticleVendu;

public interface ArticleVenduDAO {
	public void insert(ArticleVendu articleVendu) throws BusinessException;

	public void select(int noArticle);

	public void delete(int noArticle);

	public ObjetManager lireNomArticle(String nomArticle);

	public ObjetManager lireNoArticle(int noArticle);

	public ObjetManager lireDescription(String description);

	public ObjetManager lireDateDebutEncheres(Date dateDebutEncheres);

	public ObjetManager lireDateFinEncheres(Date dateFinEncheres);

	public ObjetManager lireMiseAPrix(int miseAPrix);

	public ObjetManager lirePrixVente(int prixVente);

	public ObjetManager lireEtatVente(int etatVente);

}