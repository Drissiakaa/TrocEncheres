package fr.eni.trocEncheres.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DestructionSession
 */
@WebServlet("/DestructionSession")
public class DestructionSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	  @Override
	  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   HttpSession session = request.getSession(false);

	   // destruction de la session de l'utilisateur.
	     if (session != null)
	        session.invalidate();

	   // retour page accuel mode non connecté
	     this.getServletContext().getRequestDispatcher("/WEB-INF/PageAccueilDeconnect.jsp").forward(request, response);
		}
	  }
	 