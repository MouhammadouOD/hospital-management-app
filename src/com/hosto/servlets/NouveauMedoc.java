package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.MedocDao;
import com.hosto.beans.Medoc;

/**
 * Servlet implementation class NouveauMedoc
 */
@WebServlet(urlPatterns = { "/nouveauMedoc" }, loadOnStartup=1)
public class NouveauMedoc extends HttpServlet {
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
		request.getRequestDispatcher( "/nouveauMedoc.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomMedoc 			= request.getParameter("nomMedoc");
		String nombreDefois 		= request.getParameter("nombreDefois");
		String FrequenceDePrise 	= request.getParameter("FrequenceDePrise");
		String nombreParPrise 		= request.getParameter("nombreParPrise");
		String nombre2 				= request.getParameter("nombre2");
		String dureePrise 			= request.getParameter("dureePrise");
		String[] periodePrise 		= (String[])request.getParameterValues("periodePrise");
		
		String periodePrise1 = " " ;
		
		if(periodePrise != null) {
			for(int i = 0;i<periodePrise.length;i++) {
				periodePrise1 = periodePrise1+" "+periodePrise[i];
			}
		}
		
		
		FrequenceDePrise = nombreDefois+" "+FrequenceDePrise;
		dureePrise       = nombre2+" "+dureePrise;
		
		 
		
		
		try {
			@SuppressWarnings("unused")
			Medoc newMedoc = MedocDao.ajouterMedoc(nomMedoc, FrequenceDePrise, nombreParPrise, dureePrise, periodePrise1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher( "/nouveauMedoc.jsp" ).forward( request, response );
		
	}
	

}
