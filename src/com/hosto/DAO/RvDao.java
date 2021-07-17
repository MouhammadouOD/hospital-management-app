package com.hosto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.hosto.beans.RendezVous;


public class RvDao extends DAOContext{
	
	public static RendezVous ajouterRv( String NomPatient,String PrenomPatient ,String	DateRv, String	heure ) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_RendezVous (NomPatient,PrenomPatient, DateRv, heure) VALUES (?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, NomPatient );
				statement.setString( 2, PrenomPatient );
				statement.setString( 3, DateRv );
				statement.setString( 4, heure );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return new RendezVous(NomPatient,PrenomPatient ,DateRv, heure);
  }
	
	
	public static Vector<RendezVous> allRv() throws SQLException{
		 Vector<RendezVous> v1=new Vector<RendezVous>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_RendezVous ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								RendezVous rvTrouve = new RendezVous();
								
								rvTrouve.setNomPatient(resultSet.getString( "NomPatient" ));
								rvTrouve.setPrenomPatient(resultSet.getString( "PrenomPatient" ));
								rvTrouve.setIdRv(resultSet.getInt( "IdRv" ));
								rvTrouve.setDateRv(resultSet.getString( "DateRv" ));
								rvTrouve.setHeure(resultSet.getString( "heure" ));
								rvTrouve.setPatient(resultSet.getInt( "Patient" ));
								
								
								v1.addElement(rvTrouve);
								
							} 
							
		    	 }
		    	 
		     }
		    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	 }
			return v1;
	}


	public static Vector<RendezVous> rechercheRv(String nom) throws SQLException{

		Vector<RendezVous> v=new Vector<RendezVous>();
		
     try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
    	 String strSql = "SELECT * FROM T_RendezVous WHERE NomPatient LIKE'%"+nom+"%' ";
    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
    		 try ( ResultSet resultSet = statement.executeQuery() ) {
					while ( resultSet.next() ) {
						RendezVous medocTrouve = new RendezVous();
						
						medocTrouve.setIdRv(resultSet.getInt( "IdRv" ));
						medocTrouve.setNomPatient(resultSet.getString( "NomPatient" ));
						medocTrouve.setPrenomPatient(resultSet.getString( "PrenomPatient" ));
						medocTrouve.setDateRv(resultSet.getString( "DateRv" ));
						medocTrouve.setHeure(resultSet.getString( "heure" ));
						
						
						v.addElement(medocTrouve);
						
					} 
					
				return v;
    	 }
    	 
     }
    }     
 }

}
