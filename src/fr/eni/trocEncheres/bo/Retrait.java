package fr.eni.trocEncheres.bo;

/**
 * application de cession d objets de seconde main sans échanges financiers. La
 * valeur des articles est déterminée par un système d enchères basé sur un
 * nombre de points
 * 
 * auteur : Drissia Kaabeche campus ENI septembre 2020
 */
import java.io.Serializable;

// classe décrivant le  retrait
// d'un article vendu

public class Retrait implements Serializable {
	private static final long serialVersionUID = 1L;

	// attributs de la classe Retrait
	private String rue;
	private int code_postal;
	private String ville;

	// attribut d'association avec
	// la classe ArticleVendu
	private ArticleVendu lieuretrait;

	// CONSTRUCTEUR SANS ET AVEC PARAMETRES

	public Retrait() {
	};

	/**
	 * @param rue
	 * @param code_postal
	 * @param ville
	 * @param lieuretrait
	 */
	public Retrait(String rue, int code_postal, String ville, ArticleVendu lieuretrait) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.lieuretrait = lieuretrait;
	}

	// GETTERS ET SETTERS

	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param rue
	 *            the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return the code_postal
	 */
	public int getCode_postal() {
		return code_postal;
	}

	/**
	 * @param code_postal
	 *            the code_postal to set
	 */
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville
	 *            the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the lieuretrait
	 */
	public ArticleVendu getLieuretrait() {
		return lieuretrait;
	}

	/**
	 * @param lieuretrait
	 *            the lieuretrait to set
	 */
	public void setLieuretrait(ArticleVendu lieuretrait) {
		this.lieuretrait = lieuretrait;
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
		return "Retrait [rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville + ", lieuretrait="
				+ lieuretrait + "]";
	}

}
