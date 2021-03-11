package com.demo.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

	
	private static Connection connection;
	private PostgresConnection() {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
			
		if(connection == null) {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "Kinsler#10"; //password for Postgres 
				
			connection = DriverManager.getConnection(url, username, password);
			return connection;
		}else {
			return connection;
		}
		
	}
}

// Creational Design Pattern - "SingleTon" Java Class
// 1) Keep a static variable 
// 2) Disable constructor access by making it as private
// 3) Keep a static method which return the instance of static variable/object check it if the instance is already created and return it accordingly.