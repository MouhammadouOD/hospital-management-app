package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.DossierDao;
import com.hosto.DAO.PatientDao;
import com.hosto.beans.DossierPatient;
import com.hosto.beans.Patient;

/**
 * Servlet implementation class DossierPatientInf
 */
@WebServlet( urlPatterns ="/dossierPatientMed", loadOnStartup=1)
public class DossierPatientMed extends HttpServlet {
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
		try {
			Vector<Patient> v1 = PatientDao.allPatients();
			request.setAttribute("v1", v1);
			Vector<DossierPatient> v2 = DossierDao.dossierParIdPatient();
			request.setAttribute("v2", v2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		request.getRequestDispatcher( "/dossierPatientMed.jsp" ).forward( request, response );

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String prenomPatient = request.getParameter("prenomPatient");
		try {
			Vector<Patient> v1 = PatientDao.rechercherPatientNom(prenomPatient);
			request.setAttribute("v1", v1);
			Vector<DossierPatient> v2 = DossierDao.aUnDossier();
			request.setAttribute("v2", v2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher( "/dossierPatientMed.jsp" ).forward( request, response );
	}

}
