package com.hosto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.hosto.beans.ConsultationM;

public class ConsulterMDao extends DAOContext {
	
	

	public static ConsultationM ajouterConsultationM(String perimCranien, String perimBracial, String perimThoracique,
			String segmentInf, String segmentSup, String freqCardiaque, String freqThoracique, String idPatient) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_ConsultationsM (PerimCranien ,PerimBracial, PerimThoracique, SegmentInf, SegmentSup, FreqCardiaque, FreqThoracique, Patient) VALUES (?,?,?,?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, perimCranien );
				statement.setString( 2, perimBracial );
				statement.setString( 3, perimThoracique );
				statement.setString( 4, segmentInf );
				statement.setString( 5, segmentSup );
				statement.setString( 6, freqCardiaque );
				statement.setString( 7, freqThoracique );
				statement.setString( 8, idPatient );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return new ConsultationM(perimCranien ,perimBracial, perimThoracique, segmentInf, segmentSup, freqCardiaque, freqThoracique, idPatient);
  }
	
	 public static Vector<ConsultationM> allConsultationsM(String idPatient) throws SQLException{
		 Vector<ConsultationM> v1=new Vector<ConsultationM>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_ConsultationsM WHERE Patient='"+idPatient+"' ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								ConsultationM consTrouve = new ConsultationM();
								
								consTrouve.setPerimCranien(resultSet.getString( "PerimCranien" ));
								consTrouve.setPerimBracial(resultSet.getString( "PerimBracial" ));
								consTrouve.setPerimThoracique(resultSet.getString( "PerimThoracique" ));
								consTrouve.setSegmentInf(resultSet.getString( "SegmentInf" ));
								consTrouve.setSegmentSup(resultSet.getString( "SegmentSup" ));
								consTrouve.setFreqCardiaque(resultSet.getString( "FreqCardiaque" ));
								consTrouve.setFreqThoracique(resultSet.getString( "FreqThoracique" ));
								consTrouve.setPatient(resultSet.getString( "Patient" ));
								
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
