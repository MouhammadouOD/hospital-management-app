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

import com.hosto.DAO.MedocDao;
import com.hosto.DAO.PatientDao;
import com.hosto.beans.Medoc;
import com.hosto.beans.Patient;

/**
 * Servlet implementation class CreerOrdonnanceI
 */
@WebServlet(urlPatterns ="/creerOrdonnanceI",  loadOnStartup=1)
public class CreerOrdonnanceI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession( true );
		/**if ( session.getAttribute( "connectedUser" ) == null ) {
			response.sendRedirect( "connexion" );
			return;
		}*/
		String idpatient = request.getParameter("idPatient");
		session.getAttribute("lesMedocs") ;
		

		try {
			Vector<Medoc> v1 = MedocDao.allMedocs();
			request.setAttribute("v1", v1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		finally {
		 }
		Patient patient = null;

		try {
			patient = PatientDao.rechercherPatientId(idpatient);
			request.setAttribute("patient", patient);
			request.getRequestDispatcher( "/creerOrdonnanceI.jsp" ).forward( request, response );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/**Vector<String> lesMedocs =(Vector<String>) session.getAttribute("lesMedocs") ;
		
		Vector<Medoc> v2 = null; 
		Medoc med = new Medoc();
		v2.addElement(med);
		try {
			for(String s : lesMedocs){
				
				try {
					med = MedocDao.rechercherMedoc1(s);
					v2.addElement(med);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		 finally {
		 }
		 }
		
			
		
		request.setAttribute("v2", v2);**/
		
		
		
		 }
		









	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String medocChoisi = request.getParameter("medocChoisi");
		
		
		HttpSession session = request.getSession() ;

		
		
		@SuppressWarnings("unchecked")
		Vector<String> lesMedocs =(Vector<String>) session.getAttribute("lesMedocs") ;
		lesMedocs.addElement(medocChoisi);
		session.setAttribute("lesMedocs",lesMedocs) ;
		
		
		
		String idpatient = request.getParameter("idPatient");
		Patient patient = null;
		try {
			patient = PatientDao.rechercherPatientId(idpatient);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("patient", patient);
		request.getRequestDispatcher( "/creerOrdonnanceI.jsp" ).forward( request, response );
		
	}

}
