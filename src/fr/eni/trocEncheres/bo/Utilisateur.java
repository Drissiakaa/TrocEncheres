package fr.eni.trocEncheres.bo;

/**
 * Application de cession d objets de seconde main sans échanges financiers. La
 * valeur des articles est déterminée par un système d enchères basé sur un
 * nombre de points acquis en "vendant" des objets
 * 
 * Auteurs : Drissia Kaabeche  et Aurélie Traquet campus ENI septembre 2020
 */
import java.io.Serializable;

// classe décrivant un utilisateur de la plateforme
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;

	// atttributs de classe
	private int noUtilisateur;
	private String pseudo;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private int codePostale;
	private String ville;
	private String motDePasse;
	private int credit =100;
	private String administrateur;

	// attributs d 'association bi-directionnelle
	// avec les classes enchere et ArticleVendu
	private Encheres enchere;
	private ArticleVendu vente;
	private String nom;
	

	

	

	// constructeurs sans et avec paramètres
	
	public Utilisateur() {

		}

	
	/**
	 * @param noUtilisateur
	 * @param pseudo
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param codePostale
	 * @param ville
	 * @param motDePasse
	 * @param credit
	 */

	public Utilisateur(int noUtilisateur, String pseudo,String nom, String prenom, String email, String telephone, String rue,
			int codePostale, String ville, String motDePasse, int credit) {
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom=nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostale = codePostale;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
	}
   
	
	
	// getters et setters
	
	public String getNom() {
		return nom;
	}

	public Utilisateur(String pseudo, String password) {

	}

	public Utilisateur(String pseudo2, String prenom2, String email2, String telephone2, String rue2,
			String codePostale2, String ville2, String motDePasse2, int credit2, String administrateur2) {
	}

	/**
	 * @return the noUtilisateur
	 */
	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	/**
	 * @param noUtilisateur
	 *            the noUtilisateur to set
	 */
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo
	 *            the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String string) {
		
	}
	/**
	 * @return the name
	 */
	public void getNom(String string) {
		
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

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
	 * @return the codePostale
	 */
	public int getCodePostale() {
		return codePostale;
	}

	/**
	 * @param codePostale
	 *            the codePostale to set
	 */
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
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
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse
	 *            the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * @param credit
	 *            the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}

	/**
	 * @return the administrateur
	 */
	public String getAdministrateur() {
		return administrateur;
	}

	/**
	 * @param administrateur
	 *            the administrateur to set
	 */
	public void setAdministrateur(String administrateur) {
		this.administrateur = administrateur;
	}

	/**
	 * @return the enchere
	 */
	public Encheres getEnchere() {
		return enchere;
	}

	/**
	 * @param enchere
	 *            the enchere to set
	 */
	public void setEnchere(Encheres enchere) {
		this.enchere = enchere;
	}

	/**
	 * @return the vente
	 */
	public ArticleVendu getVente() {
		return vente;
	}

	/**
	 * @param vente
	 *            the vente to set
	 */
	public void setVente(ArticleVendu vente) {
		this.vente = vente;
	}

	// methode pour afficher les valeurs des attributs de la classe (état de la classe)
	// par concaténation dans une chaine de caractère
	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", credit=" + credit
				+ ", enchere=" + enchere + ", vente=" + vente + "]";
	}

	

}
