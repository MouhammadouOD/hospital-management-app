package com.hosto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.hosto.beans.Patient;

public class PatientDao extends DAOContext {
	
	public static Patient ajouterPatient( String Nom, String Prenom, String Sexe, String DateNaissance, String Adresse, String NomAcc,
			String TelAcc ) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_Patients ( Nom, Prenom, Sexe, DateNaissance, Adresse, NomAcc, TelAcc) VALUES (?,?,?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, Nom );
				statement.setString( 2, Prenom );
				statement.setString( 3, Sexe );
				statement.setString( 4, DateNaissance );
				statement.setString( 5, Adresse );
				statement.setString( 6, NomAcc );
				statement.setString( 7, TelAcc );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return new Patient(Nom, Prenom, Sexe, DateNaissance, Adresse, NomAcc, TelAcc );
  }
	
	 public static Patient rechercherPatientId(String id) throws SQLException{

		 Patient v1=new Patient();
		 
	     try ( Connection connection = DriverManager.getConnection(DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Patients WHERE IdPatient='"+id+"' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							
							Patient patientTrouve = new Patient();
							
							patientTrouve.setIdPatient(resultSet.getInt( "IdPatient" ));
							patientTrouve.setNom(resultSet.getString( "Nom" ));
							patientTrouve.setPrenom(resultSet.getString( "Prenom" ));
							patientTrouve.setSexe(resultSet.getString( "Sexe" ));
							patientTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
							patientTrouve.setAdresse(resultSet.getString( "Adresse" ));
							patientTrouve.setNomAcc(resultSet.getString( "NomAcc" ));
							patientTrouve.setTelAcc(resultSet.getString( "TelAcc" ));
							
							v1 = patientTrouve;
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }
	 
	
	 public static Vector<Patient> allPatients() throws SQLException{
		 Vector<Patient> v1=new Vector<Patient>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_PATIENTS ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								Patient patientTrouve = new Patient();
								
								patientTrouve.setIdPatient(resultSet.getInt( "IdPatient" ));
								patientTrouve.setNom(resultSet.getString( "Nom" ));
								patientTrouve.setPrenom(resultSet.getString( "Prenom" ));
								patientTrouve.setSexe(resultSet.getString( "Sexe" ));
								patientTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
								patientTrouve.setAdresse(resultSet.getString( "Adresse" ));
								patientTrouve.setNomAcc(resultSet.getString( "NomAcc" ));
								patientTrouve.setTelAcc(resultSet.getString( "TelAcc" ));
								
								v1.addElement(patientTrouve);
								
							} 
							
		    		 	}
		    	     }
	   	 	}
			return v1;
	 }
	 
	
	 
	 public static Vector<Patient> rechercherPatientNom(String prenom) throws SQLException{

		 Vector<Patient> v1=new Vector<Patient>();
		 
	     try ( Connection connection = DriverManager.getConnection(DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Patients WHERE prenom LIKE'%"+prenom+"%' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							
							Patient patientTrouve = new Patient();
							
							patientTrouve.setIdPatient(resultSet.getInt( "IdPatient" ));
							patientTrouve.setNom(resultSet.getString( "Nom" ));
							patientTrouve.setPrenom(resultSet.getString( "Prenom" ));
							patientTrouve.setSexe(resultSet.getString( "Sexe" ));
							patientTrouve.setDateNaissance(resultSet.getString( "DateNaissance" ));
							patientTrouve.setAdresse(resultSet.getString( "Adresse" ));
							patientTrouve.setNomAcc(resultSet.getString( "NomAcc" ));
							patientTrouve.setTelAcc(resultSet.getString( "TelAcc" ));
							
							v1.addElement(patientTrouve);
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }
	 
	 public Patient rechercherPatient(String nom , String prenom, String dateNaissance) throws SQLException{
		 Patient patientTrouve = new Patient();
		 
	     try ( Connection connection = DriverManager.getConnection(DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Patient WHERE nom='"+nom+"' AND prenom='"+prenom+"' AND DateNaissance='"+dateNaissance+"' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							
							Patient patientTrouve1 = new Patient();
							
							patientTrouve1.setIdPatient(resultSet.getInt( "IdPatient" ));
							patientTrouve1.setNom(resultSet.getString( "Nom" ));
							patientTrouve1.setPrenom(resultSet.getString( "Prenom" ));
							patientTrouve1.setSexe(resultSet.getString( "Sexe" ));
							patientTrouve1.setDateNaissance(resultSet.getString( "DateNaissance" ));
							patientTrouve1.setAdresse(resultSet.getString( "Adresse" ));
							patientTrouve1.setNomAcc(resultSet.getString( "NomAcc" ));
							patientTrouve1.setTelAcc(resultSet.getString( "TelAcc" ));
							
							
							patientTrouve= patientTrouve1;
						} 
						
	    	 }
	    	 
	     }
	    }
	     
		return patientTrouve;     
	 }
}
