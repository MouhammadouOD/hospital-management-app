package com.hosto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.hosto.beans.Medoc;

public class MedocDao extends DAOContext {
	
	public static void supprimerMedoc( String idMedoc)  throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "DELETE FROM T_Medicaments WHERE idMed ='"+idMedoc+"' ";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return;
  }
	
	public static Medoc ajouterMedoc( String nomMedoc,String FrequenceDePrise,String nombreParPrise,String dureePrise,String periodePrise)  throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_Medicaments (nomMed, FrequenceDePrise, nombreParPrise, dureePrise, periodePrise) VALUES (?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, nomMedoc );
				statement.setString( 2, FrequenceDePrise );
				statement.setString( 3, nombreParPrise );
				statement.setString( 4, dureePrise );
				statement.setString( 5, periodePrise );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return new Medoc(nomMedoc, FrequenceDePrise, nombreParPrise, dureePrise, periodePrise);
  }
	
	
	public static Vector<Medoc> rechercherMedoc(String nom) throws SQLException{

		Vector<Medoc> v=new Vector<Medoc>();
		
     try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
    	 String strSql = "SELECT * FROM T_Medicaments WHERE NomMed LIKE'%"+nom+"%' ";
    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
    		 try ( ResultSet resultSet = statement.executeQuery() ) {
					while ( resultSet.next() ) {
						Medoc medocTrouve = new Medoc();
						
						medocTrouve.setIdMed(resultSet.getInt( "IdMed" ));
						medocTrouve.setNomMed(resultSet.getString( "NomMed" ));
						medocTrouve.setFrequenceDePrise(resultSet.getString( "FrequenceDePrise" ));
						medocTrouve.setNombreParPrise(resultSet.getString( "NombreParPrise" ));
						medocTrouve.setDureePrise(resultSet.getString( "DureePrise" ));
						medocTrouve.setPeriodePrise(resultSet.getString( "PeriodePrise" ));
						
						v.addElement(medocTrouve);
						
					} 
					
				return v;
    	 }
    	 
     }
    }     
 }
	
	public static Medoc rechercherMedoc1(String nom) throws SQLException{

		Medoc v=new Medoc();
		
     try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
    	 String strSql = "SELECT * FROM T_Medicaments WHERE NomMed LIKE'%"+nom+"%' ";
    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
    		 try ( ResultSet resultSet = statement.executeQuery() ) {
					while ( resultSet.next() ) {
						Medoc medocTrouve = new Medoc();
						
						medocTrouve.setIdMed(resultSet.getInt( "IdMed" ));
						medocTrouve.setNomMed(resultSet.getString( "NomMed" ));
						medocTrouve.setFrequenceDePrise(resultSet.getString( "FrequenceDePrise" ));
						medocTrouve.setNombreParPrise(resultSet.getString( "NombreParPrise" ));
						medocTrouve.setDureePrise(resultSet.getString( "DureePrise" ));
						medocTrouve.setPeriodePrise(resultSet.getString( "PeriodePrise" ));
						
						v=medocTrouve;
						
					} 
					
				return v;
    	 }
    	 
     }
    }     
 }
	
	public static Vector<Medoc> allMedocs() throws SQLException{
		 Vector<Medoc> v1=new Vector<Medoc>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_Medicaments ORDER BY NomMed";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								Medoc medocTrouve = new Medoc();
								
								medocTrouve.setIdMed(resultSet.getInt( "IdMed" ));
								medocTrouve.setNomMed(resultSet.getString( "NomMed" ));
								medocTrouve.setFrequenceDePrise(resultSet.getString( "FrequenceDePrise" ));
								medocTrouve.setNombreParPrise(resultSet.getString( "NombreParPrise" ));
								medocTrouve.setDureePrise(resultSet.getString( "DureePrise" ));
								medocTrouve.setPeriodePrise(resultSet.getString( "PeriodePrise" ));
								
								v1.addElement(medocTrouve);
								
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
