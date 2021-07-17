package com.hosto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.hosto.beans.ConsultationI;

public class ConsulterIDao extends DAOContext{

	public static ConsultationI ajouterConsultationI( String patient, String poids, String temperature, String heureDeCons, String taille) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_ConsultationsI (  patient,  poids,  temperature,  heureDeCons,  taille) VALUES (?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				
				statement.setString( 1, patient );
				statement.setString( 2, poids );
				statement.setString( 3, temperature );
				statement.setString( 4, heureDeCons );
				statement.setString( 5, taille );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return new ConsultationI( patient,  poids,  temperature,  heureDeCons,  taille);
  }
	
	 public static Vector<ConsultationI> allConsultationsI(String idPatient) throws SQLException{
		 Vector<ConsultationI> v1=new Vector<ConsultationI>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_ConsultationsI WHERE Patient='"+idPatient+"' ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								ConsultationI consTrouve = new ConsultationI();
								
								consTrouve.setIdConsultationI(resultSet.getString( "IdConsultationI" ));
								consTrouve.setPatient(resultSet.getString( "Patient" ));
								consTrouve.setPoids(resultSet.getString( "Poids" ));
								consTrouve.setTemperature(resultSet.getString( "Temperature" ));
								consTrouve.setHeureDeCons(resultSet.getString( "HeureDeCons" ));
								consTrouve.setTaille(resultSet.getString( "Taille" ));
		
								
								v1.addElement(consTrouve);
								
							} 
							
		    	 }
		    	 
		     }
		    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	 }
			return v1;
	}
	 

}
