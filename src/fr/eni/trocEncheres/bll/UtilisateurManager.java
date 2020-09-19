package fr.eni.trocEncheres.bll;

import fr.eni.trocEncheres.bo.Utilisateur;
import fr.eni.trocEncheres.dal.BusinessException;
import fr.eni.trocEncheres.dal.DAOFactory;
import fr.eni.trocEncheres.dal.UtilisateurDAO;

/*
 * Classe permettant d'ajouter un utilisateur ; permettre d' obtenir une
 * connexion au site ; permettre de recuperer mot de passe et pseudo
 * (identifiant de connexion)
 * 
 */

public class UtilisateurManager {

	// variable membre (pour accès à la DAL)
	private UtilisateurDAO utilisateurDAO;
	
	
	

	// CONSTRUCTEUR
	public UtilisateurManager() {
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO();

	}

	// pour recupérer le mot de passe en base de données
	public Utilisateur LireUtilisateur(String pseudo) throws BusinessException {
		return utilisateurDAO.LireUtilisateur(pseudo);

	}

	public Utilisateur Insert(String pseudo, String prenom, String email, String telephone, String rue, int codePostal,
			String ville, String motDePasse, int credit, String administrateur) {
		// TODO Auto-generated method stub
		return null;
	}

	public Utilisateur Insert(String pseudo, String prenom, String email, String telephone, String rue, int codePostal,
			String ville, String motDePasse) {
		// TODO Auto-generated method stub
		return null;
	}

	// public void Insert(pseudo, prenom, email, telephone, rue, codePostal, ville,
	// motDePasse,credit, administrateur ) throws BusinessException {};
}