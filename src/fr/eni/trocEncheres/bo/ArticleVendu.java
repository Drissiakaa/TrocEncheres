package fr.eni.trocEncheres.bo;


import java.io.Serializable;
import java.util.Date;

//classe decrivant un article mis en vente

public class ArticleVendu implements Serializable {
	private static final long serialVersionUID = 1L;

	// attributs de la classe ArticleVendu

	private int noArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEncheres;
	private Date dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private int etatVente;

	// attribut d 'association multi-
	// directionnelle avec les classes Retrait,enchere,Categorie,Utilisateur

	private Retrait lieuRetrait;
	private Utilisateur vente;
	private Categorie categorieArticle;

	// CONSTRUCTEUR SANS ET AVEC PARAMETRES

	public ArticleVendu() {
	};

	/**
	 * @param noArticle
	 * @param nomArticle
	 * @param description
	 * @param dateDebutEncheres
	 * @param dateFinEncheres
	 * @param miseAPrix
	 * @param prixVente
	 * @param etatVente
	 * @param lieuRetrait
	 * @param vente
	 * @param categorieArticle
	 * @param lieuretrait2
	 */
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, int miseAPrix, int prixVente, int etatVente, Retrait lieuRetrait, Utilisateur vente,
			Categorie categorieArticle, Retrait lieuretrait2) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
		this.vente = vente;
		this.categorieArticle = categorieArticle;

	}

	// GETTERS ET SETTERS DES ATTRIBUTS DE LA CLASSE

	/**
	 * @return the noArticle
	 */
	public int getNoArticle() {
		return noArticle;
	}

	/**
	 * @param noArticle
	 *            the noArticle to set
	 */
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	/**
	 * @return the nomArticle
	 */
	public String getNomArticle() {
		return nomArticle;
	}

	/**
	 * @param nomArticle
	 *            the nomArticle to set
	 */
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the dateDebutEncheres
	 */
	public Date getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	/**
	 * @param dateDebutEncheres
	 *            the dateDebutEncheres to set
	 */
	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}

	/**
	 * @return the dateFinEncheres
	 */
	public Date getDateFinEncheres() {
		return dateFinEncheres;
	}

	/**
	 * @param dateFinEncheres
	 *            the dateFinEncheres to set
	 */
	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	/**
	 * @return the miseAPrix
	 */
	public int getMiseAPrix() {
		return miseAPrix;
	}

	/**
	 * @param miseAPrix
	 *            the miseAPrix to set
	 */
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}

	/**
	 * @return the prixVente
	 */
	public int getPrixVente() {
		return prixVente;
	}

	/**
	 * @param prixVente
	 *            the prixVente to set
	 */
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	/**
	 * @return the etatVente
	 */
	public int getEtatVente() {
		return etatVente;
	}

	/**
	 * @param etatVente
	 *            the etatVente to set
	 */
	public void setEtatVente(int etatVente) {
		this.etatVente = etatVente;
	}

	/**
	 * @return the lieuRetrait
	 */
	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}

	/**
	 * @param lieuRetrait
	 *            the lieuRetrait to set
	 */
	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}

	/**
	 * @return the vente
	 */
	public Utilisateur getVente() {
		return vente;
	}

	/**
	 * @param vente
	 *            the vente to set
	 */
	public void setVente(Utilisateur vente) {
		this.vente = vente;
	}

	/**
	 * @return the categorieArticle
	 */
	public Categorie getCategorieArticle() {
		return categorieArticle;
	}

	/**
	 * @param categorieArticle
	 *            the categorieArticle to set
	 */
	public void setCategorieArticle(Categorie categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

	// methode pour afficher les valeurs des attributs de la classe
	// par concaténation dans une chaine de caractère

	/**
	 * public String toString() { return "ArticleVendu [noArticle=" + noArticle + ",
	 * nomArticle=" + nomArticle + ", description=" + description + ",
	 * dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" +
	 * dateFinEncheres + ", miseAPrix=" + miseAPrix + ", prixVente=" + prixVente +
	 * ", etatVente=" + etatVente + ", lieuRetrait=" + lieuRetrait + ", vente=" +
	 * vente + ", categorieArticle=" + categorieArticle + "]"; }
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("noArticle [noArticle=");
		sb.append(noArticle);
		sb.append(", nomArticle=");
		sb.append(nomArticle);
		sb.append(", description=");
		sb.append(description);
		sb.append(", dateDebutEncheres=");
		sb.append(dateDebutEncheres);
		sb.append(", dateFinEncheres=");
		sb.append(dateFinEncheres);
		sb.append(", miseAPrix=");
		sb.append(miseAPrix);
		sb.append(", prixVente=");
		sb.append(prixVente);
		sb.append(", etatVente=");
		sb.append(etatVente);
		sb.append(", lieuRetrait=");
		sb.append(lieuRetrait);
		sb.append(", vente=");
		sb.append(vente);
		sb.append(", prixVente=");
		sb.append(prixVente);
		sb.append(", etatVente=");
		sb.append(etatVente);
		sb.append(", categorieArticle=");
		sb.append(categorieArticle);
		sb.append("]");
		return sb.toString();
	}

}
