package fr.eni.trocEncheres.dal;

import fr.eni.trocEncheres.bo.Utilisateur;

public interface UtilisateurDAO {

	public Utilisateur select(String pseudo, String motDePasse) throws BusinessException;

	public void select(String pseudo, String prenom, String email, String telephone, String rue, String codePostale,
			String ville, String motDePasse, int credit, String administrateur) throws BusinessException;

	

	public void deleteUtilisateur(int idUtilisateur) throws BusinessException;
   public void deleteUtilisateur( Utilisateur utilisateur) throws BusinessException;
	
	public Utilisateur LireUtilisateur(String pseudo) throws BusinessException;

	public Utilisateur SelectProfilUtilisateur(String pseudo, String nom, String email, String telephone, String rue,
			int codePostale, String ville) throws BusinessException;

	public  Utilisateur Insert(String nom, String prenom, String pseudo, String email, String telephone, String rue,
			String ville, int codePostal, String motDePasse) throws BusinessException ;
	}

	

