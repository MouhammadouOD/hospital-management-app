package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.UserDao;
import com.hosto.beans.User;

/**
 * Servlet implementation class NouvelUser
 */
@WebServlet(urlPatterns ="/nouvelUser" ,loadOnStartup=1)
public class NouvelUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NouvelUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession( true );
		if ( session.getAttribute( "connectedUser" ) == null ) {
			response.sendRedirect( "connexion" );
			return;
		}
		
		request.getRequestDispatcher( "/nouvelUser.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom 		= request.getParameter("nom");
		String prenom 	= request.getParameter("prenom");
		String pseudo 	= request.getParameter("pseudo");
		String mdp 		= request.getParameter("mdp");
		String fonction = request.getParameter("fonction");
		
		try {
			@SuppressWarnings("unused")
			User newUser = UserDao.ajouterUser(pseudo, prenom, nom, mdp,fonction);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher( "/nouvelUser.jsp" ).forward( request, response );
		
	}

}
