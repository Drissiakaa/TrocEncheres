package fr.eni.trocEncheres.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.trocEncheres.bll.ObjetManager;
import fr.eni.trocEncheres.bo.ArticleVendu;
import fr.eni.trocEncheres.bo.Categorie;
import fr.eni.trocEncheres.bo.Retrait;
import fr.eni.trocEncheres.bo.Utilisateur;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	private static final String INSERT = "INSERT INTO ARTICLES_VENDUS(no_article,nom-article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) VALUES(?,?);";
	private static final String SELECT ="SELECT * FROM ARTICLES_VENDUS WHERE categorie =?";
	@Override
	public void insert(ArticleVendu articleVendu) throws BusinessException {

		if (articleVendu == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_ARTICLE__ECHEC);
			throw businessException;
		}

		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pstmt = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

			pstmt.setString(1, articleVendu.getDescription());
			pstmt.setInt(2, articleVendu.getNoArticle());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();

			if (rs.next()) {

				// articleVendu.setIdentifiant(rs.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
						
			}
			
		}
	
	@Override
	public ArticleVendu Select(int noArticle, String nomArticle, String description, java.util.Date dateDebutEncheres,
			java.util.Date dateFinEncheres, int miseAPrix, int prixVente, int etatVente, Retrait lieuRetrait,
			Utilisateur vente, Categorie categorieArticle) {
		ArticleVendu articleVendu = null;
		if (articleVendu == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_ARTICLE_ECHEC);
			try {
				throw businessException;
			} catch (BusinessException e) {
				e.printStackTrace();
			}
		}

		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pstmt = cnx.prepareStatement(SELECT, PreparedStatement.RETURN_GENERATED_KEYS);

			pstmt.setString(3,articleVendu.getDescription());
			pstmt.setInt(2, articleVendu.getNoArticle());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();

			if (rs.next()) {

				// articleVendu.setIdentifiant(rs.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
						
			}
		return articleVendu;

	}

	
	
	

   
	
	
	

	

	@Override
	public void delete(int noArticle) {

	}

	@Override
	public ObjetManager lireNomArticle(String nomArticle) {
		return null;
	}

	@Override
	public ObjetManager lireNoArticle(int noArticle) {
		return null;
	}

	@Override
	public ObjetManager lireDescription(String description) {
		return null;
	}

	@Override
	public ObjetManager lireDateDebutEncheres(Date dateDebutEncheres) {
		return null;
	}

	@Override
	public ObjetManager lireDateFinEncheres(Date dateFinEncheres) {
		return null;
	}

	@Override
	public ObjetManager lireMiseAPrix(int miseAPrix) {
		return null;
	}

	@Override
	public ObjetManager lirePrixVente(int prixVente) {
		return null;
	}

	@Override
	public ObjetManager lireEtatVente(int etatVente) {
		return null;
	}


	





	

}
