package fr.eni.trocEncheres.dal;

import java.sql.Connection;

//cette classe définit les différentes  instructions SQL 

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.trocEncheres.bo.Utilisateur;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	// cette constante représente l'instruction SQL de selection du pseudo et mot de
	// passe de l'utilisateur pour les méthodes LireMdp() et LirePseudo().
	private static final String SELECT_ALL = "SELECT noUtilisateur,mot_de_passe,nom,prenom,pseudo,rue,ville,codePostale,credit,administrateur FROM utilisateurs "
			+ "where pseudo=? ";

	private static final String INSERT_UTILISATEUR = "INSERT pseudo,prenom,email,telephone,rue,codePostale,ville,motDePasse,credit,administrateur INTO utilisateurs ";
	private static final String DELETE_UTILISATEUR = "DELETE utilisateur FROM utilisateurs  WHERE noUtilisateur =?";
	private String noUtilisateur;

	
	
	
	public Utilisateur LireUtilisateur(String pseudo) throws BusinessException {

		Utilisateur utilisateur = null;

		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
			pstmt.setString(1, pseudo);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())

			{
				utilisateur = new Utilisateur();
				// modifier les param comme il faut
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNoUtilisateur(rs.getInt("noUtilisateur"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setRue(rs.getString("rue"));
				utilisateur.setCredit(rs.getInt("credit"));
				utilisateur.setAdministrateur(rs.getString("administrateur"));
				utilisateur.setCodePostale(rs.getInt("codePostale"));
			
					
				
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			BusinessException businessException1 = new BusinessException();
			businessException1.ajouterErreur(CodesResultatDAL.SELECT_ARTICLE_ECHEC);
			throw businessException1;
		}

		return utilisateur;
	}

	
	
	
	@Override
	public  Utilisateur Insert(String pseudo,String prenom,String nom,   String email, String telephone, String rue,
			String ville, int codePostal, String motDePasse) throws BusinessException {
		
		  Utilisateur utilisateur = null;

		
		
		
		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pstmt = cnx.prepareStatement(INSERT_UTILISATEUR);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				rs.close();
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			BusinessException businessException1 = new BusinessException();
			businessException1.ajouterErreur(CodesResultatDAL.INSERT_ARTICLE__ECHEC);
			throw businessException1;
		}
					
		
		return utilisateur;
		
	}
	
	
	@Override
	public void select(String pseudo, String prenom, String email, String telephone, String rue, String codePostale,
			String ville, String motDePasse, int credit, String administrateur) throws BusinessException {

	}

	

	

	@Override
	public void deleteUtilisateur(int idUtilisateur) throws BusinessException {

	}

	@Override
	public Utilisateur select(String pseudo, String motDePasse) throws BusinessException {

		return null;
	}

	@Override
	public Utilisateur SelectProfilUtilisateur(String pseudo, String nom, String email, String telephone, String rue,
			int codePostale, String ville) throws BusinessException {
	       Utilisateur utilisateur = null;

	try (Connection cnx = ConnectionProvider.getConnection()) {

		PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
		pstmt.setString(1, pseudo);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())

		{
			utilisateur = new Utilisateur();
		
			utilisateur.setPseudo(rs.getString("pseudo"));
			utilisateur.setNom(rs.getString("nom"));
			utilisateur.setPrenom(rs.getString("prenom"));
			utilisateur.setEmail(rs.getString("email"));
			utilisateur.setVille(rs.getString("ville"));
			utilisateur.setRue(rs.getString("rue"));			
			utilisateur.setTelephone(rs.getString("telephone"));
			utilisateur.setCodePostale(rs.getInt("codePostale"));
			
		}
		rs.close();
		pstmt.close();

	} catch (SQLException e) {
		e.printStackTrace();
		BusinessException businessException1 = new BusinessException();
		businessException1.ajouterErreur(CodesResultatDAL.SELECT_ARTICLE_ECHEC);
		try {
			throw businessException1;
		} catch (BusinessException e1) {
			
			e1.printStackTrace();
		}
	}

	return utilisateur;
}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) throws BusinessException {
		
		try (Connection cnx = ConnectionProvider.getConnection()) {

			PreparedStatement pstmt = cnx.prepareStatement(DELETE_UTILISATEUR);
			pstmt.setString(1, noUtilisateur);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())

			{
				utilisateur = new Utilisateur();
			
				utilisateur.setPseudo(rs.getString("pseudo"));
				utilisateur.setNom(rs.getString("nom"));
				utilisateur.setPrenom(rs.getString("prenom"));
				utilisateur.setEmail(rs.getString("email"));
				utilisateur.setVille(rs.getString("ville"));
				utilisateur.setRue(rs.getString("rue"));			
				utilisateur.setTelephone(rs.getString("telephone"));
				utilisateur.setCodePostale(rs.getInt("codePostale"));
				
			}
			rs.close();
			pstmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
			BusinessException businessException1 = new BusinessException();
			businessException1.ajouterErreur(CodesResultatDAL.SELECT_ARTICLE_ECHEC);
			try {
				throw businessException1;
			} catch (BusinessException e1) {
				
				e1.printStackTrace();
			}
		}

		
		
		
		
		
	}

	

}
