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
 * Servlet implementation class PageInscription
 */
@WebServlet("/PageInscriptionUtilisateur")
public class PageInscriptionUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/PageInscription.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String pseudo = request.getParameter("nom");
		String ville = request.getParameter("ville");
		String rue = request.getParameter("rue");
		String email = request.getParameter("email");
		String telephone =request.getParameter("telephone");
		String motDePasse=request.getParameter("motDePasse");
		int codePostal = Integer.parseInt(request.getParameter("codePostal"));		
		
		try {
			
			UtilisateurManager um = new UtilisateurManager();
			Utilisateur utilisateur=um.Insert(pseudo, prenom, email, telephone, rue, codePostal, ville, motDePasse);
			
		} catch (Exception e) {
			 e.printStackTrace(new java.io.PrintStream("error"));
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageConnexion.jsp");
		rd.forward(request, response);
	}
}
