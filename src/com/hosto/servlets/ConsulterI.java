package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.ConsulterIDao;
import com.hosto.beans.ConsultationI;

/**
 * Servlet implementation class ConsulterI
 */
@WebServlet(urlPatterns ="/consulterI", loadOnStartup=1)
public class ConsulterI extends HttpServlet {
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
		String idPatient 			= request.getParameter("idPatient");
		
		session.setAttribute("idPatient", idPatient) ;
		request.getRequestDispatcher( "/consulterI.jsp" ).forward( request, response );	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String poids		=request.getParameter("poids");
		String temperature	=request.getParameter("temperature");
		String taille		=request.getParameter("taille");
		String heure		=request.getParameter("poids");
		HttpSession session = request.getSession() ;
		String patient		= (String) session.getAttribute("idPatient");
		

		try {
			@SuppressWarnings("unused")
			ConsultationI v2 = new ConsultationI();
			v2 =ConsulterIDao.ajouterConsultationI(patient,  poids,  temperature,  heure,  taille);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	session.setAttribute("idPatientconsulter", patient) ;
	request.getRequestDispatcher( "/validerConsultationI.jsp" ).forward( request, response );


	}

}
