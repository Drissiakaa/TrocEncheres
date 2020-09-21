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
 * Servlet implementation class PageConnexionUser Servlet traitant la requête
 * HTTP d'affichage du formulaire de connexion; elle traite la reception des
 * saisies utilisateur et valide ou non l'accès au site.
 */

@WebServlet("/PageConnexionUser")
public class PageConnexionUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		@SuppressWarnings("unused")
		String pseudo = null;
		UtilisateurManager um = new UtilisateurManager();
		try {
			Utilisateur utilisateur = um.LireUtilisateur(login);
			if (utilisateur != null) {
				try {
					if (utilisateur.getMotDePasse().equals(password)) {
						HttpSession session = request.getSession();
						session.setAttribute("utilisateur", utilisateur);
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageAccueilConnect.jsp");
						rd.forward(request, response);
					}
				} finally {

				}
				{

				}

			}

		} catch (BusinessException e) {
			PrintWriter out = response.getWriter();
			out.print("Identifiants inconnus!");
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/PageConnexion.jsp");
			rd.forward(request, response);
		}

	}

}
