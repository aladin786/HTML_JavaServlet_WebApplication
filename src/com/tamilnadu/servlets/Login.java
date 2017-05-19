package com.tamilnadu.servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tamilnadu.beans.LoginBean;
import com.tamilnadu.dao.LoginDao;

@SuppressWarnings("serial")
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Home</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		
		try
    	{
    		LoginBean user = new LoginBean();
    		user.setUsername(request.getParameter("username"));
    		user.setPassword(request.getParameter("password"));
    		user.setName(request.getParameter("name"));
    		user.setEmail(request.getParameter("email"));
    		
    		user = LoginDao.login(user);
    		
    		if (user.isValid())
    		{
    			HttpSession session = request.getSession(true);
    			session.setAttribute("currentSessionUser", user);
    			request.getRequestDispatcher("navlogin.html").include(request, response);
    			out.println("<div class='container'>");
    			request.getRequestDispatcher("homepage.html").include(request, response);
    		}
    		
    		else
    			out.println("<script type=\"text/javascript\">");
            	out.println("alert('Sorry, you have entered wrong Username and Password!');");
            	out.println("location='index.html';");
            	out.println("</script>");
    		}
    	
    	catch (Throwable theException)
    	{
    		System.out.println(theException);
    	}
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
 
}
