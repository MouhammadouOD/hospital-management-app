package com.hosto.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.beans.User;
import com.hosto.DAO.DAOContext;
import com.hosto.DAO.UserDao;

/**
 * Servlet implementation class Connexion
 */
@WebServlet(urlPatterns="/connexion", loadOnStartup=1)
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = -1204635336479052777L;
	
	@Override
	public void init() throws ServletException {
		DAOContext.init( this.getServletContext() );
	}
      
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute( "pseudo", "" );
		request.setAttribute( "mdp", "" );
		request.setAttribute( "errorMessage", "" );
		request.getRequestDispatcher( "/connexion.jsp" ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo = request.getParameter( "txtPseudo" );
		String mdp = request.getParameter( "txtMdp" );
		
		request.setAttribute( "pseudo", pseudo );
		request.setAttribute( "mdp", mdp );
		
		User connectedUser = UserDao.isValidLogin( pseudo, mdp );
		if ( connectedUser != null ) {
			
			HttpSession session = request.getSession( true );
			session.setAttribute( "connectedUser", connectedUser );
			
			String fonction = connectedUser.getFonction();
			session.setAttribute( "fonction", fonction );
			String pageRedirige = "/hosto/accueil"+fonction;
			
			request.setAttribute( "pageRedirige", pageRedirige);
			
			//request.getRequestDispatcher( pageRedirige ).forward( request, response );
			response.sendRedirect(pageRedirige);
		
		} else {
		
			request.setAttribute( "errorMessage", "Bad identity" );			
			request.getRequestDispatcher( "/connexion.jsp" ).forward( request, response );
			
		}
		
	}

}