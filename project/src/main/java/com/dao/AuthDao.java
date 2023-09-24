package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AuthDao implements UpdateDao {

	private Connection connection;
	private PreparedStatement prepareStatement;
	private int row;
	private String result;
	private String sql;
	private ResultSet rs;
	
	@SuppressWarnings("finally")
	public String read(String username, String password) {
		try {
			connection = ConnectionFactory.getConnection();
			sql = "select * from login where username =? and password=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, username);
			prepareStatement.setString(2, password);
			rs = prepareStatement.executeQuery();
			if (rs.next()) {
				result = "exist";
			}
			else {
				result = "notexist";
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			result = "notexist";
			e.printStackTrace();
		}
		finally {
			return result;			
		}

	}

	@SuppressWarnings("finally")
	@Override
	public String update(ArrayList<Object> al) {
		try {
			String oldPass = (String)al.get(0);
			String newPass = (String)al.get(1);
			
			//check old pass is right
			String checkOldPassword = checkOldPassword(oldPass);
			if(checkOldPassword.equals("correct")) {
				sql = "update login set password=? where sn =1";
				connection = ConnectionFactory.getConnection();
				prepareStatement = connection.prepareStatement(sql);
				prepareStatement.setString(1, newPass);
				
				row = prepareStatement.executeUpdate();
				if(row == 1) {
					result = "updated";
				}
			}
			else {
				result = "incorrect";
			}
			
			
		} catch (Exception e) {
			result = "failed";
			e.printStackTrace();
		}
		finally {
			return result;
		}
	}
	
	@SuppressWarnings("finally")
	public String checkOldPassword(String oldPass) {
		try {
			sql = "select * from login where password = ?";
			connection = ConnectionFactory.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, oldPass);
			rs = prepareStatement.executeQuery();
			if(rs.next() == true) {
				result = "correct";
			}
			else {
				result = "incorrect";
			}
			
		} catch (Exception e) {
			result = "incorrect";
			e.printStackTrace();
		}
		
		finally {
			return result;
		}
	}

}
