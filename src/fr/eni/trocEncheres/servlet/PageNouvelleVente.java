package fr.eni.trocEncheres.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageNouvelleVente
 */
@WebServlet("/PageNouvelleVente")
public class PageNouvelleVente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PageNouvelleVente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/NouvelleVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int noArticle = Integer.parseInt(request.getParameter("noArticle"));
		String nomArticl = request.getParameter("nomArticl");
		String description = request.getParameter("description");

		SimpleDateFormat dateDebut = new SimpleDateFormat("dd-MM-yyy");
		String dateDebutStr = request.getParameter("dateDebut");
		try {
			Date dateDebutEncheres = dateDebut.parse(dateDebutStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SimpleDateFormat dateFin = new SimpleDateFormat("dd-MM-yyyy");
		String dateFinStr = request.getParameter("dateFin");
		try {
			Date dateFinEncheres = dateFin.parse(dateFinStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int miseAPrix = Integer.parseInt(request.getParameter("miseAPrix"));
		int prixVente = Integer.parseInt(request.getParameter("prixVente"));
		int etatVente = Integer.parseInt(request.getParameter("etatVente"));
	}

}
