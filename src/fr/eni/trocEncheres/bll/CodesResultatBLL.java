package fr.eni.trocEncheres.bll;

/**
 * Les codes disponibles sont entre 20000 et 29999
 */
public abstract class CodesResultatBLL {

	/**
	 * Echec quand le pseudo est faux
	 */
	public static final int REGLE_CONNEXION_PSEUDO_ERREUR = 20000;
	/**
	 * Echec quand le mot de passe est faux
	 */
	public static final int REGLE_CONNEXION_MOTDEPASSE_ERREUR = 20001;
	/**
	 * Echec quand perte session
	 */

	public static final int REGLE_SESSION_ERREUR = 20003;
	/*
	 * Echec erreur inconnu
	 */

	public static final int REGLE_ERREUR_INCONNU = 20004;

}
