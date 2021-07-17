package com.hosto.DAO;

import javax.servlet.ServletContext;

public class DAOContext {
	
	public static String dbURL;
	public static String dbLogin;
	public static String dbPassword;
	
	
	public static void init( ServletContext context ) {
		try {
			
			Class.forName( context.getInitParameter( "JDBC_DRIVER" ) );
			dbURL = context.getInitParameter( "JDBC_URL" );
			dbLogin = context.getInitParameter( "JDBC_LOGIN" );
			dbPassword = context.getInitParameter( "JDBC_PASSWORD" );
			
		} catch( Exception exception ) {
			
			exception.printStackTrace();
			
		}
	}
}
