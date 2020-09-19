package fr.eni.trocEncheres.dal;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/*
 *  Cette classe abstraite  permet 
 *  d'obtenir une connexion
 *  
 */

abstract class ConnectionProvider {
	private static DataSource dataSource;

	
	static { 
		Context context;
		try {
			context = new InitialContext();
			// la methode lookup me permet de chercher la ressource passé en param contenu
			// dans le context.xml
			ConnectionProvider.dataSource = (DataSource) context.lookup("java:comp/env/jdbc/pool_cnx");
		} catch (NamingException e) {
			e.printStackTrace();
			throw new RuntimeException("Impossible d'accéder à la base de données");
		}
	}

		// getConnection me permet de'obtenir un objet de type connexion
	// a partir de cette DataSource
	public static Connection getConnection() throws SQLException {
		return ConnectionProvider.dataSource.getConnection();
	}
}
