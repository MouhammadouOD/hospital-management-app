package com.hosto.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet( urlPatterns ="/accueilInfirmier" , loadOnStartup=1)
public class AccueilInf extends HttpServlet {
	private static final long serialVersionUID = -1204635336479052777L;
       
   
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession( true );
		if ( session.getAttribute( "connectedUser" ) == null | session.getAttribute( "fonction" ) == null ) {
			response.sendRedirect( "connexion" );
			return;
		}
		 request.getRequestDispatcher( "/accueilInfirmier.jsp" ).forward( request, response );
	 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
