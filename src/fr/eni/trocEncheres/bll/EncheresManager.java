package fr.eni.trocEncheres.bll;

import java.sql.Date;

import fr.eni.trocEncheres.bo.Encheres;
import fr.eni.trocEncheres.dal.EncheresDAO;

public class EncheresManager {
	
	
	// variable membre (pour accès à la DAL)	
private EncheresDAO encheresDAO;



//CONSTRUCTEUR
	public EncheresManager() {}
	
	
	
	//pour recuperer encheres
	public Encheres LireEnchere(Date dateEnchere,int montant_enchere) {
		return encheresDAO.LireEnchere(dateEnchere, montant_enchere);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
