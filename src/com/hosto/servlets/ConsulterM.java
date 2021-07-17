package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.ConsulterMDao;
import com.hosto.beans.ConsultationM;

/**
 * Servlet implementation class ConsulterM
 */
@WebServlet(urlPatterns ="/consulterM", loadOnStartup=1)
public class ConsulterM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

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
		request.getRequestDispatcher( "/consulterM.jsp" ).forward( request, response );

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String perimetreCranien		=request.getParameter("perimetreCranien");
		String perimetreBracial 	=request.getParameter("perimetreBracial");
		String perimetreThoracique	=request.getParameter("perimetreThoracique");
		String segmentInférieur 	=request.getParameter("segmentInférieur");
		String segmentSuperieur 	=request.getParameter("segmentSuperieur");
		String frequenceCardiaque 	=request.getParameter("frequenceCardiaque");
		String frequenceThoracique 	=request.getParameter("frequenceThoracique");
		HttpSession session = request.getSession() ;
		String idPatient 			= (String) session.getAttribute("idPatient");
		
		
		
		
			try {
				@SuppressWarnings("unused")
				ConsultationM v2 = new ConsultationM();
				v2 =ConsulterMDao.ajouterConsultationM(perimetreCranien, perimetreBracial, perimetreThoracique, segmentInférieur, segmentSuperieur,frequenceCardiaque,frequenceThoracique,idPatient);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		session.setAttribute("idPatientconsulter", idPatient) ;
		request.getRequestDispatcher( "validationConsultationM.jsp" ).forward( request, response );

	}

}
