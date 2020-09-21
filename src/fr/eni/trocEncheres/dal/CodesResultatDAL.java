package fr.eni.trocEncheres.dal;

/**
 * Les codes disponibles sont entre 10000 et 19999
 */
public abstract class CodesResultatDAL {

	/**
	 * Echec général quand tentative d'ajouter un objet null
	 */
	public static final int INSERT_OBJET_NULL = 10000;

	/**
	 * Echec général quand erreur non gérée à l'insertion
	 */
	public static final int INSERT_OBJET_ECHEC = 10001;

	/**
	 * Echec de l'insertion d'un article 
	 */
	public static final int INSERT_ARTICLE__ECHEC = 10002;
	/**
	 * Echec de lecture  d'un article 
	 */

	public static final int SELECT_ARTICLE_ECHEC = 10003;
	
	
}
