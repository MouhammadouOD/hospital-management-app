package com.hosto.servlets;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ValiderConsI
 */
@WebServlet(urlPatterns ="/validationConsultationI" , loadOnStartup=1)
public class ValiderConsI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession( true );
		if ( session.getAttribute( "connectedUser" ) == null ) {
			response.sendRedirect( "connexion" );
			return;
		}
		
		
		String idPatient = (String) session.getAttribute("idPatient");
		request.setAttribute("idPatient", idPatient);
		
		try {
			Vector<String> lesMedocs =null;
			String mot = " ";
			lesMedocs.addElement(mot);
			session.setAttribute("lesMedocs",lesMedocs) ;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		request.getRequestDispatcher( "/validationConsultationI.jsp" ).forward( request, response );

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
