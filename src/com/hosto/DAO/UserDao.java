package com.hosto.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.hosto.beans.User;


public class UserDao extends DAOContext {
	
	public static void supprimerUser( String idUser)  throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "DELETE FROM T_Users WHERE idUser ='"+idUser+"' ";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return;
  }
	
		

	public static User isValidLogin( String pseudo, String mdp ) {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE Pseudo='" + pseudo + "' AND Mdp='" + mdp + "'";
			String strSql = "SELECT * FROM T_Users WHERE Pseudo='"+pseudo+"' AND Mdp='"+mdp+"' ";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				try ( ResultSet resultSet = statement.executeQuery() ) {
					if ( resultSet.next() ) {
						return new User(
								resultSet.getInt( "IdUser" ),
								resultSet.getString( "Pseudo" ),
								resultSet.getString( "Prenom" ),
								resultSet.getString( "Nom" ),
								resultSet.getString( "Mdp" ),
								resultSet.getString( "Fonction" )
						);
					} else {
						return null;
					}
				}
			}
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
		}
	}
	
	
	public static User ajouterUser( String pseudo, String prenom, String nom, String mdp, String fonction ) throws SQLException {
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			//String strSql = "SELECT * FROM T_Users WHERE pseudo='" + pseudo + "' AND password='" + mdp + "'";
			String strSql = "INSERT INTO T_Users (Pseudo, Nom, Prenom, Mdp, Fonction) VALUES (?,?,?,?,?)";
			try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
				
				statement.setString( 1, pseudo );
				statement.setString( 2, nom );
				statement.setString( 3, prenom );
				statement.setString( 4, mdp );
				statement.setString( 5, fonction );
				statement.executeUpdate();
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
	
		}
	}
		return new User(pseudo,  prenom,  nom, mdp, fonction );
  }
	
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	public Vector rechercher(String nom) throws SQLException{

	        Vector v=new Vector();
	     try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
	    	 String strSql = "SELECT * FROM T_USERS WHERE nom LIKE'%"+nom+"%' ";
	    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
	    		 try ( ResultSet resultSet = statement.executeQuery() ) {
						while ( resultSet.next() ) {
							User userTrouve = new User();
							
							userTrouve.setIdUser(resultSet.getInt( "IdUser" ));
							userTrouve.setNom(resultSet.getString( "Nom" ));
							userTrouve.setPrenom(resultSet.getString( "Prenom" ));
							userTrouve.setPseudo(resultSet.getString( "Pseudo" ));
							userTrouve.setMdp(resultSet.getString( "Mdp" ));
							userTrouve.setFonction(resultSet.getString( "Fonction" ));
							
							v.addElement(userTrouve);
							
						} 
						
					return v;
	    	 }
	    	 
	     }
	    }     
	 }
	 
	 public static Vector<User> allUsers() throws SQLException{
		 Vector<User> v1=new Vector<User>();

			try ( Connection connection = DriverManager.getConnection( DAOContext.dbURL, DAOContext.dbLogin, DAOContext.dbPassword ) ) {
		    	 String strSql = "SELECT * FROM T_USERS ";
		    	 try ( PreparedStatement statement  = connection.prepareStatement( strSql ) ) {
		    		 try ( ResultSet resultSet = statement.executeQuery() ) {
							while ( resultSet.next() ) {
								User userTrouve = new User();
								
								userTrouve.setIdUser(resultSet.getInt( "IdUser" ));
								userTrouve.setNom(resultSet.getString( "Nom" ));
								userTrouve.setPrenom(resultSet.getString( "Prenom" ));
								userTrouve.setPseudo(resultSet.getString( "Pseudo" ));
								userTrouve.setMdp(resultSet.getString( "Mdp" ));
								userTrouve.setFonction(resultSet.getString( "Fonction" ));
								
								v1.addElement(userTrouve);
								
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
