package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.pojo.MessagePojo;

public class MessageDao implements InsertDao,ReadDao, DeleteDao {

	private Connection connection;
	private PreparedStatement prepareStatement;
	private int row;
	private String result;
	private String sql;
	private ResultSet rs;
	@SuppressWarnings("finally")
	@Override
	public String insert(ArrayList<Object> al) {
		// TODO Auto-generated method stub
		try {
			connection = ConnectionFactory.getConnection();
			
			
//			String name = (String) al.get(0);
//			String email = (String) al.get(1);
//			String message = (String) al.get(2);
			
			sql = "insert into message(name, email, message, datetime) values(?,?,?,?)";
			 prepareStatement =  connection.prepareStatement(sql);
			prepareStatement.setString(1, (String)al.get(0));
			prepareStatement.setString(2, (String)al.get(1));
			prepareStatement.setString(3, (String)al.get(2));
			prepareStatement.setString(4, LocalDateTime.now().toString());
			
			row = prepareStatement.executeUpdate();
			if(row == 1) {
				result = "saved";
			}
			
			
		}
		catch(Exception e){
			result = "failed";
			e.printStackTrace();
		}
		finally {
			return result;
		}

	}
	
	@SuppressWarnings("finally")
	@Override
	public ArrayList<Object> read() {
		
			ArrayList<Object> arrayList = new ArrayList<>();
		
		try {
			connection = ConnectionFactory.getConnection();
			sql = "select * from message";
			prepareStatement = connection.prepareStatement(sql);
			rs = prepareStatement.executeQuery();
			while (rs.next()) {
				MessagePojo m = new MessagePojo(rs.getInt("sno"), rs.getString("name"), rs.getString("email"), rs.getString("message"), 
						rs.getString("datetime"));
				arrayList.add(m);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			return arrayList;
		}
		
	}
	
	public int contactCount() {
		int noOfMessage=0;
		try {
			connection = ConnectionFactory.getConnection();
			sql = "select count(*) as count from message";
			prepareStatement = connection.prepareStatement(sql);
			rs = prepareStatement.executeQuery();
			rs.next();
			noOfMessage = rs.getInt("count");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			return noOfMessage;
		}
		
	}

	@Override
	public String delete(int sno) {
		// TODO Auto-generated method stub
		try {
			connection = ConnectionFactory.getConnection();
			sql = "delete from message where sno=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, sno);
			row = prepareStatement.executeUpdate();
			
			if(row==1) {
				result = "deleted";
			}
		} catch (Exception e) {
			result = "faied";
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			return result;
		}
		
		
	}

}
