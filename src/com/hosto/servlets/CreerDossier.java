package com.hosto.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosto.DAO.DossierDao;
import com.hosto.beans.DossierPatient;

/**
 * Servlet implementation class CreerDossier
 */
@WebServlet(urlPatterns ="/creerDossier"  , loadOnStartup=1)
public class CreerDossier extends HttpServlet {
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
		request.getRequestDispatcher( "/creerDossier.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 
		HttpSession session = request.getSession() ;
		String idPatient = (String) session.getAttribute("idPatient");
		
		 	 String Patient = idPatient;
			 String Division = request.getParameter("division");
			 String DateEntree = request.getParameter("dateEntree");
			 String DateSortie = request.getParameter("dateSortie");
			 String DiagEntree = request.getParameter("diagEntree");
			 String DiagSortie = request.getParameter("diagSortie");
			 String Imc = request.getParameter("imc");
			 String Pc = request.getParameter("pc");
			 String Pb = request.getParameter("pb");
			 String ArgAnamnestiques = request.getParameter("argAnamnestiques");
			 String ArgCliniques = request.getParameter("argCliniques");
			 String Traitement = request.getParameter("traitement");
			 String Evolution = request.getParameter("evolution");
		
			 @SuppressWarnings("unused")
			DossierPatient	 dossier = new DossierPatient();
			 
			 try {
				 
				dossier = DossierDao.ajouterDossier(Patient, Division, DateEntree, DateSortie, DiagEntree,DiagSortie,Imc, Pb, Pc, ArgAnamnestiques,ArgCliniques,Traitement,Evolution);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				request.getRequestDispatcher( "/creerDossier.jsp" ).forward( request, response );

	}

}
