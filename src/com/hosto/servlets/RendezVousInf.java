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

import com.hosto.DAO.RvDao;

import com.hosto.beans.RendezVous;

/**
 * Servlet implementation class RendezVousInf
 */
@WebServlet(urlPatterns ="/rendezVousInf", loadOnStartup=1)
public class RendezVousInf extends HttpServlet {
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
			Vector<RendezVous> v1 = RvDao.allRv();
			request.setAttribute("v1", v1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.getRequestDispatcher( "/rendezVousInf.jsp" ).forward( request, response );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomRv = request.getParameter("nomPatient");
		
		try {
			Vector<RendezVous> v1 = RvDao.rechercheRv(nomRv);
			request.setAttribute("v1", v1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		request.getRequestDispatcher( "/rendezVousInf.jsp" ).forward( request, response );
		
	}

}
