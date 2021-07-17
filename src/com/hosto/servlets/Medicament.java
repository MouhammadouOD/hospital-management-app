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
import com.hosto.beans.Medoc;

/**
 * Servlet implementation class Medicament
 */
@WebServlet(name = "medicament", urlPatterns = { "/medicament" })
public class Medicament extends HttpServlet {
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
		try {
			Vector<Medoc> v1 = MedocDao.allMedocs();
			request.setAttribute("v1", v1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		request.getRequestDispatcher( "/medicament.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomMedoc = request.getParameter("nomMedoc");
		try {
			Vector<Medoc> v1 = MedocDao.rechercherMedoc(nomMedoc);
			request.setAttribute("v1", v1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		request.getRequestDispatcher( "/medicament.jsp" ).forward( request, response );
	}

}
