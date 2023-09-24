package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AuthDao;
import com.validation.Validation;

public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String result;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String check = request.getParameter("check");
		HttpSession session =  request.getSession();
		AuthDao auth = new AuthDao();
		if(check == null) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		result = new Validation().validateLoginData(username, password);
		if(result.equals("Valid")) {
			result = auth.read(username, password);
			if(result.equals("exist")) {
				session.setAttribute("login", "exist");
				response.sendRedirect("admin.jsp");
				
			}
			else {
				session.setAttribute("msg", "Invalid Username or Password");
				response.sendRedirect("login.jsp");
			}
		}
		else {
			session.setAttribute("msg", result);
			response.sendRedirect("login.jsp");
		}
		}//end check
		else if(check.equals("Logout")) {
			session.removeAttribute("login");
			session.setAttribute("msg", "Logout Sucessfully");
			response.sendRedirect("login.jsp");
		}
		
		else if(check.equals("change")) {
			// Update credential
			String opass = request.getParameter("opass");
			String npass = request.getParameter("npass");
			String cpass = request.getParameter("cpass");
			
			
			if(npass.equals(cpass)) {

				ArrayList<Object> al = new ArrayList<Object>();
				al.add(opass);
				al.add(npass);
				result = auth.update(al);
				
				if(result.equals("updated")) {
					session.setAttribute("msg", "Password Updated Sucessfully");
					response.sendRedirect("login.jsp");
				}
				else if(result.equals("incorrect")) {
					session.setAttribute("msg", "Invalid Old Password");
					response.sendRedirect("login.jsp");
				}
				else {
					session.setAttribute("msg", "Something went wrong");
					response.sendRedirect("login.jsp");
				}
				
			}
			else {
				session.setAttribute("msg", "New Password Does not matched");
				response.sendRedirect("login.jsp");
			}
		}
	}

}
