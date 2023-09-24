package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.MessageDao;
import com.mysql.cj.Session;
import com.validation.Validation;


public class Message extends HttpServlet {

	private String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String check = request.getParameter("check");
		HttpSession session = request.getSession();
		if (check==null) {
			
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		
		
		result = new Validation().validateMessage(name,email,message);
		
		if(result.equals("Valid")) {
			
			ArrayList<Object> arraylist = new ArrayList<>();
			arraylist.add(name);
			arraylist.add(email);
			arraylist.add(message);
			
			result = new MessageDao().insert(arraylist);
			
			if(result.equals("saved")) {
				session.setAttribute("msg", "Data Send Sucessfully");
				response.sendRedirect("index.jsp");
			}
			else {
				session.setAttribute("msg", "Something Went Wrong");
				response.sendRedirect("index.jsp");
			}
		}
		else {
			//index.jsp
			session.setAttribute("msg", result);
			response.sendRedirect("index.jsp");
		}
		}
		else if(check.equals("delete")) {
			String sn = request.getParameter("sno");
			result = new MessageDao().delete(Integer.parseInt(sn));
			if(result.equals("deleted")) {
				session.setAttribute("msg", "Message Deleted Succesfully");
				response.sendRedirect("read-message.jsp");
			}
			else {
				session.setAttribute("msg", "Something Went Wrong");
				response.sendRedirect("read-message.jsp");
			}
		}
	}

}
