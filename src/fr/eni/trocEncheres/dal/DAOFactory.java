package fr.eni.trocEncheres.dal;

//permet de creer à l'appel du  constructeur de la classe ConnexionManager
//des objet de type ConnexionDAOJdbcImpl
//qui seront initialisé dans des variable de 
//type ConnexionDAO
public abstract class DAOFactory {

	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDAOJdbcImpl();
	}

}
