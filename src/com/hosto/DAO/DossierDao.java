package com.hosto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.hosto.beans.DossierPatient;

public class DossierDao extends DAOContext {
	
	
	public static DossierPatient ajouterDossier( String Patient, String Division, String DateEntree, String DateSortie, String DiagEntree, String DiagSortie, String Imc 
			, String Pb,String Pc,String ArgAnamnestiques,String ArgCliniques,String Traitement,String Evolution  ) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_Dossiers (Patient, Division, DateEntree, DateSortie, DiagEntree,DiagSortie,Imc, Pb, Pc, ArgAnamnestiques,ArgCliniques,Traitement,Evolution) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, Patient );
				statement.setString( 2, Division );
				statement.setString( 3, DateEntree );
				statement.setString( 4, DateSortie );
				statement.setString( 5, DiagEntree );
				statement.setString( 6, DiagSortie );
				statement.setString( 7, Imc );
				statement.setString( 8, Pb );
				statement.setString( 9, Pc );
				statement.setString( 10, ArgAnamnestiques );
				statement.setString( 11, ArgCliniques );
				statement.setString( 12, Traitement );
				statement.setString( 13, Evolution );
				
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return new DossierPatient(Patient, Division, DateEntree, DateSortie, DiagEntree,DiagSortie,Imc, Pb, Pc, ArgAnamnestiques,ArgCliniques,Traitement,Evolution);
  }
	
	
	
	public static Vector<DossierPatient> allDossiers() throws SQLException{
		 Vector<DossierPatient> v1=new Vector<DossierPatient>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_Dossiers ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								DossierPatient dossierTrouve = new DossierPatient();
								
								dossierTrouve.setIdDossier(resultSet.getInt( "IdDossier" ));
								dossierTrouve.setPatient(resultSet.getString( "Patient" ));
								dossierTrouve.setDivision(resultSet.getString( "Division" ));
								dossierTrouve.setDateEntree(resultSet.getString( "DateEntree" ));
								dossierTrouve.setDateSortie(resultSet.getString( "DateSortie" ));
								dossierTrouve.setDiagEntree(resultSet.getString( "DiagEntree" ));
								dossierTrouve.setDiagSortie(resultSet.getString( "DiagSortie" ));
								dossierTrouve.setImc(resultSet.getString( "Imc" ));
								dossierTrouve.setPc(resultSet.getString( "Pc" ));
								dossierTrouve.setPb(resultSet.getString( "Pb" ));
								dossierTrouve.setArgAnamnestiques(resultSet.getString( "ArgAnamnestiques" ));
								dossierTrouve.setArgCliniques(resultSet.getString( "ArgCliniques" ));
								dossierTrouve.setTraitement(resultSet.getString( "Traitement" ));
								dossierTrouve.setEvolution(resultSet.getString( "Evolution" ));

								
								v1.addElement(dossierTrouve);
								
							} 
							
		    		 	}
		    	     }
	   	 	}
			return v1;
	 }
	
	 public Vector<DossierPatient> aUnDossier(String IdPatient) throws SQLException{

		 Vector<DossierPatient> v1=new Vector<DossierPatient>();
		 
	     try ( Connection connection = DriverManager.getConnection(DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Dossiers WHERE Patients ='"+IdPatient+"'";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							DossierPatient dossierTrouve = new DossierPatient();
							
							dossierTrouve.setIdDossier(resultSet.getInt( "IdDossier" ));
							dossierTrouve.setPatient(resultSet.getString( "Patient" ));
							dossierTrouve.setDivision(resultSet.getString( "Division" ));
							dossierTrouve.setDateEntree(resultSet.getString( "DateEntree" ));
							dossierTrouve.setDateSortie(resultSet.getString( "DateSortie" ));
							dossierTrouve.setDiagEntree(resultSet.getString( "DiagEntree" ));
							dossierTrouve.setDiagSortie(resultSet.getString( "DiagSortie" ));
							dossierTrouve.setImc(resultSet.getString( "Imc" ));
							dossierTrouve.setPc(resultSet.getString( "Pc" ));
							dossierTrouve.setPb(resultSet.getString( "Pb" ));
							dossierTrouve.setArgAnamnestiques(resultSet.getString( "ArgAnamnestiques" ));
							dossierTrouve.setArgCliniques(resultSet.getString( "ArgCliniques" ));
							dossierTrouve.setTraitement(resultSet.getString( "Traitement" ));
							dossierTrouve.setEvolution(resultSet.getString( "Evolution" ));

							
							v1.addElement(dossierTrouve);
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }
	 
	 public static Vector<DossierPatient> dossierParIdPatient(String id) throws SQLException{

		 Vector<DossierPatient> v1=new Vector<DossierPatient>();
		 
	     try ( Connection connection = DriverManager.getConnection(DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_Dossiers  WHERE Patient='"+id+"'";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							DossierPatient dossierTrouve = new DossierPatient();
							
							dossierTrouve.setIdDossier(resultSet.getInt( "IdDossier" ));
							dossierTrouve.setPatient(resultSet.getString( "Patient" ));
							dossierTrouve.setDivision(resultSet.getString( "Division" ));
							dossierTrouve.setDateEntree(resultSet.getString( "DateEntree" ));
							dossierTrouve.setDateSortie(resultSet.getString( "DateSortie" ));
							dossierTrouve.setDiagEntree(resultSet.getString( "DiagEntree" ));
							dossierTrouve.setDiagSortie(resultSet.getString( "DiagSortie" ));
							dossierTrouve.setImc(resultSet.getString( "Imc" ));
							dossierTrouve.setPc(resultSet.getString( "Pc" ));
							dossierTrouve.setPb(resultSet.getString( "Pb" ));
							dossierTrouve.setArgAnamnestiques(resultSet.getString( "ArgAnamnestiques" ));
							dossierTrouve.setArgCliniques(resultSet.getString( "ArgCliniques" ));
							dossierTrouve.setTraitement(resultSet.getString( "Traitement" ));
							dossierTrouve.setEvolution(resultSet.getString( "Evolution" ));

							
							v1.addElement(dossierTrouve);
							
						} 
						
					return v1;
	    	 }
	    	 
	     }
	    }     
	 }

	public static Vector<DossierPatient> aUnDossier() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Vector<DossierPatient> dossierParIdPatient() {
		// TODO Auto-generated method stub
		return null;
	}

}
