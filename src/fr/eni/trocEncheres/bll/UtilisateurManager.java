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
     
	
	//pour afficher le profil d'un utilisateur/vendeur
  public Utilisateur SelectProfilUtilisateur(String pseudo,String nom,String email,String telephone,String rue,int codePostale,String ville) throws BusinessException{
	  return utilisateurDAO.SelectProfilUtilisateur(pseudo,nom,email,telephone,rue,codePostale,ville); 	  
  
  }


public void deleteUtilisateur(Utilisateur utilisateur) throws BusinessException {
}

public  Utilisateur Insert(String nom,String prenom, String pseudo,  String email, String telephone, String rue,
		String ville,	int codePostal,  String motDePasse ) throws BusinessException { 
	return utilisateurDAO.Insert(nom, prenom, pseudo, email, telephone, rue, ville, codePostal,motDePasse );



}

}











