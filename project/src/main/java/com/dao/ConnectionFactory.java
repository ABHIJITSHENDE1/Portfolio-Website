package com.dao;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;


public class ConnectionFactory {
	private static Connection connection;
	@SuppressWarnings("finally")
	public static Connection getConnection()
	{
		try {
			
			MysqlDataSource mysql  =new MysqlDataSource();
			mysql.setUrl("jdbc:mysql://localhost:3306/codehuntjavaproject");
			mysql.setUser("root");
			mysql.setPassword("");
			connection = mysql.getConnection();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			return connection;
		}
	}

}
