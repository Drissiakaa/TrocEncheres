package fr.eni.trocEncheres.bo;

/**
 * application de cession d objets de seconde main sans échanges financiers. La
 * valeur des articles est déterminée par un système d enchères basé sur un
 * nombre de points
 * 
 * auteur : Drissia Kaabeche et Aurélie Tra campus ENI septembre 2020
 */
import java.io.Serializable;

// classe qui permet de catégoriser 
//un article

public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	// attribut de la classe Categorie

	private int noCategorie;
	private int libelle;

	// attribut d 'associaiotn avec la
	// la classe ArticleVendu

	private ArticleVendu categorieArticle;

	// CONSTRUCTEURS SANS ET AVEC PARAMETRES

	public Categorie() {
	};

	/**
	 * @param noCategorie
	 * @param libelle
	 * @param categorieArticle
	 */
	public Categorie(int noCategorie, int libelle, ArticleVendu categorieArticle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
		this.categorieArticle = categorieArticle;

	}

	// GETTERS ET SETTERS DE LA CLASSE

	/**
	 * @return the noCategorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}

	/**
	 * @param noCategorie
	 *            the noCategorie to set
	 */
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	/**
	 * @return the libelle
	 */
	public int getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(int libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the categorieArticle
	 */
	public ArticleVendu getCategorieArticle() {
		return categorieArticle;
	}

	/**
	 * @param categorieArticle
	 *            the categorieArticle to set
	 */
	public void setCategorieArticle(ArticleVendu categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

	// methode pour afficher les valeurs des attributs de la classe
	// par concaténation dans une chaine de caractère
	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", categorieArticle="
				+ categorieArticle + "]";
	}

}
