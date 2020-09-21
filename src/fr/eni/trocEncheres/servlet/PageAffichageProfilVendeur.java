package fr.eni.trocEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.trocEncheres.bll.UtilisateurManager;
import fr.eni.trocEncheres.bo.Utilisateur;
import fr.eni.trocEncheres.dal.BusinessException;

/**
 * Servlet implementation class PageAffichageProfilVendeur
 */
@WebServlet("/PageAffichageProfilVendeur")
public class PageAffichageProfilVendeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String pseudo;
	private String nom;
	private String email;
	private String telephone;
	private String rue;
	private int codePostale;
	private String ville;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unlikely-arg-type")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Utilisateur vendeur =new Utilisateur();
		pseudo= vendeur.getPseudo();
		pseudo =request.getParameter("pseudo");
		
				try {
		 				 
				  UtilisateurManager um = new UtilisateurManager();
			      Utilisateur utilisateur = new Utilisateur();
			    	utilisateur= um.SelectProfilUtilisateur(pseudo, nom, email, telephone, rue, codePostale, ville);
			    	if(vendeur.getPseudo().equals(utilisateur)){
			    		request.setAttribute("vendeur", vendeur);
			    		
			    		
			    	} 
			    			
				
			}catch (BusinessException e) {
				 	e.printStackTrace();			
		   } 
			
			
		 	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/AffichageProfilVendeur.jsp");
						rd.forward(request, response);
					
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	}

}
