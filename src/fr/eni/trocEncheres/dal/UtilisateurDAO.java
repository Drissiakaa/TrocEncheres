package fr.eni.trocEncheres.dal;

import fr.eni.trocEncheres.BusinessException;
import fr.eni.trocEncheres.bo.Utilisateur;

public interface UtilisateurDAO {

	public Utilisateur select(String pseudo, String motDePasse) throws BusinessException;
	public void select(String pseudo,String prenom,String email,String telephone,String rue,String codePostale,String ville,String motDePasse,int credit,String administrateur) throws BusinessException;
	public void Insert (Utilisateur utilisateur);
	public void deleteUtilisateur(int idUtilisateur) throws BusinessException;
	public void Insert(String pseudo, String prenom, String email, String telephone, String rue, String codePostale,String ville, String motDePasse, int credit, String administrateur) throws BusinessException;
	public Utilisateur LireUtilisateur(String pseudo) throws BusinessException ;
		
	
	

	

}
