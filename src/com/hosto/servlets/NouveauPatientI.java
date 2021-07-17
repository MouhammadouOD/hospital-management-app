package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.PatientDao;
import com.hosto.beans.Patient;

/**
 * Servlet implementation class NouveauPatient
 */
@WebServlet(urlPatterns ="/nouveauPatientI",loadOnStartup=1)
public class NouveauPatientI extends HttpServlet {
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
	
		request.getRequestDispatcher( "/nouveauPatientInf.jsp" ).forward( request, response );

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomPatient = request.getParameter("nomPatient");
		String prenomPatient = request.getParameter("prenomPatient");
		String sexePatient = request.getParameter("sexePatients");
		String dateNaissPatient = request.getParameter("dateNaissPatient");
		String adressePatient = request.getParameter("adressePatient");
		String nomAccompagnant = request.getParameter("nomAccompagnant");
		String numAccompagnant = request.getParameter("numAccompagnant");
		
		try {
			@SuppressWarnings("unused")
			Patient patient = PatientDao.ajouterPatient(nomPatient, prenomPatient, sexePatient, dateNaissPatient, adressePatient, nomAccompagnant, numAccompagnant);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher( "/nouveauPatientInf.jsp" ).forward( request, response );
	}

}
