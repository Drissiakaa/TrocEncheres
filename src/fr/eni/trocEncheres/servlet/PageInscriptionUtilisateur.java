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
	
		
		//this.getServletContext().getRequestDispatcher("/WEB-INF/PageCreerCompte.jsp").forward(request, response);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageCreerCompte.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");	
		String pseudo = request.getParameter("pseudo");
				String email = request.getParameter("email");
				String telephone =request.getParameter("telephone");
		String rue = request.getParameter("rue");
		String ville = request.getParameter("ville");
		int codePostal = Integer.parseInt(request.getParameter("codePostal"));		
		String motDePasse=request.getParameter("motDePasse");
		
		
		
		
		try {
			
			UtilisateurManager um = new UtilisateurManager();
			um.Insert(nom,prenom, pseudo, email, telephone, rue,ville, codePostal,  motDePasse);
			
		} catch (Exception e) {
			 e.printStackTrace(new java.io.PrintStream("error"));
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageConnexion.jsp");
		rd.forward(request, response);
	
	
}}
