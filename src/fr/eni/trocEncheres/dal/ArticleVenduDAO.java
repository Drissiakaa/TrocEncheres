package fr.eni.trocEncheres.dal;

import fr.eni.trocEncheres.BusinessException;
import fr.eni.trocEncheres.bo.ArticleVendu;

public interface ArticleVenduDAO {
	public void insert(ArticleVendu articleVendu) throws BusinessException;
}
