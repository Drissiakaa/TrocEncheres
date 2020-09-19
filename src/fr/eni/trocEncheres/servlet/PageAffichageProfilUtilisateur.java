package fr.eni.trocEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.trocEncheres.bll.UtilisateurManager;
import fr.eni.trocEncheres.bo.Utilisateur;

/**
 * Servlet implementation class PageAffichageProfilUtilisateur
 * delegue à une jsp l'affichage de la page du profil de l'utilisateur
 */
@WebServlet("/PageAffichageProfilUtilisateur")
public class PageAffichageProfilUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prenom = null;
		String nom = null;
		String pseudo = null;
		String ville = null;
		String rue = null;
		String email = null;
		String telephone =null;
		String motDePasse=null;
		String administrateur=null;
		int credit = 100;
		
		request.getParameter(prenom);
		request.getParameter(nom);
		request.getParameter(pseudo);
		request.getParameter(ville);
		request.getParameter(rue);
		request.getParameter(email);
		request.getParameter(telephone);		
		int codePostal = Integer.parseInt(request.getParameter("codePostal"));
		
		
		UtilisateurManager um = new UtilisateurManager();
		Utilisateur utilisateur=um.Insert(pseudo, prenom, email, telephone, rue, codePostal, ville, motDePasse,credit,administrateur);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageConnexion.jsp");
		rd.forward(request, response);
				
	}

}
