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
 * Servlet implementation class AfficheDossier
 */
@WebServlet(urlPatterns = "/afficherDossierI", loadOnStartup=1)
public class AfficherDossierI extends HttpServlet {
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
		String idpatient = request.getParameter("idPatient");
		
			Vector<DossierPatient> v1 = null;
			try {
				v1 = DossierDao.dossierParIdPatient(idpatient);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Patient patient = null;
			try {
				patient = PatientDao.rechercherPatientId(idpatient);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("patient", patient);
			request.setAttribute("v1", v1);
			request.getRequestDispatcher( "/afficherDossierI.jsp" ).forward( request, response );
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
