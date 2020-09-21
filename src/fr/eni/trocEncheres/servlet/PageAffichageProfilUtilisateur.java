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
		
		String pseudo =	request.getParameter("pseudo");
		String nom =request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone =request.getParameter("telephone");	
		String rue =request.getParameter("rue");
		int codePostal = Integer.parseInt(request.getParameter("codePostal"));
		String ville = request.getParameter("ville");
		String motDePasse=request.getParameter("motDePasse");	
		int credit = 100;		
		String administrateur=null;
			
		UtilisateurManager um = new UtilisateurManager();
		Utilisateur utilisateur=um.Insert(pseudo,prenom, nom, email, telephone,rue, codePostal, ville, motDePasse,credit,administrateur);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageConnexion.jsp");
		rd.forward(request, response);
				
	}

}
