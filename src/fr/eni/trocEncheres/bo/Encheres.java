package fr.eni.trocEncheres.bo;

/**
 * application de cession d objets de seconde main sans échanges financiers. La
 * valeur des articles est déterminée par un système d enchères basé sur un
 * nombre de points
 * 
 * auteur : Drissia Kaabeche campus ENI septembre 2020
 */
import java.io.Serializable;
import java.util.Date;

// classe decrivant une enchères

public class Encheres implements Serializable {

	private static final long serialVersionUID = 1L;

	// attributs de la classe

	private Date dateEnchere;
	private int montant_enchere;

	// attribut d 'association bi-directionnelle
	// avec les classes Utilisateur et ArticleVendu

	private Utilisateur enchere;
	private ArticleVendu articlevendu;

	// CONSTRUCTEURS SANS ET AVEC PARAMETRES

	public Encheres() {
	};

	/**
	 * @param dateEnchere
	 * @param montant_enchere
	 * @param enchere
	 * @param articlevendu
	 */
	public Encheres(Date dateEnchere, int montant_enchere, Utilisateur enchere, ArticleVendu articlevendu) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
		this.enchere = enchere;
		this.articlevendu = articlevendu;
	}

	// GETTERS ET SETTERS DES ATTRIBUTS DE LA CLASSE
	/**
	 * @return the dateEnchere
	 */
	public Date getDateEnchere() {
		return dateEnchere;
	}

	/**
	 * @param dateEnchere
	 *            the dateEnchere to set
	 */
	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	/**
	 * @return the montant_enchere
	 */
	public int getMontant_enchere() {
		return montant_enchere;
	}

	/**
	 * @param montant_enchere
	 *            the montant_enchere to set
	 */
	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	/**
	 * @return the enchere
	 */
	public Utilisateur getEnchere() {
		return enchere;
	}

	/**
	 * @param enchere
	 *            the enchere to set
	 */
	public void setEnchere(Utilisateur enchere) {
		this.enchere = enchere;
	}

	/**
	 * @return the articlevendu
	 */
	public ArticleVendu getArticlevendu() {
		return articlevendu;
	}

	/**
	 * @param articlevendu
	 *            the articlevendu to set
	 */
	public void setArticlevendu(ArticleVendu articlevendu) {
		this.articlevendu = articlevendu;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// methode pour afficher les valeurs des attributs de la classe
	// par concaténation dans une chaine de caractère
	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montant_enchere=" + montant_enchere + ", enchere=" + enchere
				+ ", articlevendu=" + articlevendu + "]";
	}

}
