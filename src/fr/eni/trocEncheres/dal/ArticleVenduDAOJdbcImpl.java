package fr.eni.trocEncheres.dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.trocEncheres.bll.ObjetManager;
import fr.eni.trocEncheres.bo.ArticleVendu;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO {

	private static final String INSERT = "INSERT INTO ARTICLES_VENDUS(no_article,nom-article,description,date_debut_encheres,date_fin_encheres,prix_initial,prix_vente,no_utilisateur,no_categorie) VALUES(?,?);";

	@Override
	public void insert(ArticleVendu articleVendu) throws BusinessException {

		if (articleVendu == null) {
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
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
			BusinessException businessException = new BusinessException();

			if (e.getMessage().contains("CK_AVIS_note")) {

				businessException.ajouterErreur(CodesResultatDAL.INSERT_AVIS_NOTE_ECHEC);
			} else {

				businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
			}
			throw businessException;
		}
	}

	@Override
	public void select(int noArticle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int noArticle) {
		// TODO Auto-generated method stub

	}

	@Override
	public ObjetManager lireNomArticle(String nomArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetManager lireNoArticle(int noArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetManager lireDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetManager lireDateDebutEncheres(Date dateDebutEncheres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetManager lireDateFinEncheres(Date dateFinEncheres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetManager lireMiseAPrix(int miseAPrix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetManager lirePrixVente(int prixVente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetManager lireEtatVente(int etatVente) {
		// TODO Auto-generated method stub
		return null;
	}

}
