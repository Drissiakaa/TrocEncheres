package fr.eni.trocEncheres.dal;

import java.util.Date;

import fr.eni.trocEncheres.bo.Encheres;

public interface EncheresDAO {
	
	public Encheres LireEnchere(Date dateEnchere,int montant_enchere);

}





//altGr+e = €