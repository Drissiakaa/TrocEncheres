package fr.eni.trocEncheres.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class SupprimerUtilisateur
 */
@WebServlet("/SupprimerUtilisateur")
public class SupprimerUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see Supprimer une session puis un  compte utilisateur 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur =new Utilisateur();
		HttpSession session = request.getSession();
				  if (session != null)
		        session.invalidate();
					
		 {
				
				try {
					UtilisateurManager um= new UtilisateurManager();
					um.deleteUtilisateur(utilisateur);
				} catch (BusinessException e) {
					PrintWriter out = response.getWriter();
					out.print(" echec Suppresion");
					e.printStackTrace();
				}
		}
			  
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageAccueilConnect.jsp");
			rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
