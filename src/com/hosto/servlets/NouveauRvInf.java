package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.RvDao;
import com.hosto.beans.RendezVous;

/**
 * Servlet implementation class NouveauRv
 */

@WebServlet(urlPatterns ="/nouveauRvInf",loadOnStartup=1)

public class NouveauRvInf extends HttpServlet {
	private static final long serialVersionUID = -1204635336479052777L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession( true );
		if ( session.getAttribute( "connectedUser" ) == null ) {
			response.sendRedirect( "connexion" );
			return;
		}
		request.getRequestDispatcher( "/nouveauRvInf.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomPatient 		= request.getParameter("nomPatient");
		String prenomPatient 	= request.getParameter("prenomPatient");
		String dateRv 			= request.getParameter("dateRv");
		String heureRv 			= request.getParameter("heureRv");
		
		
		try {
			@SuppressWarnings("unused")
			RendezVous newRv = RvDao.ajouterRv(nomPatient, prenomPatient, dateRv, heureRv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher( "/nouveauRvInf.jsp" ).forward( request, response );
	}

}
