package com.tamilnadu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/UploadFileServlet")
public class UploadFileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Upload File</title>");
		out.println("<link rel='stylesheet' href='resources/bootstrap.min.css'/>");
		out.println("<link rel='stylesheet' href='style.css'/>");
		out.println("</head>");
		out.println("<body>");
		request.getRequestDispatcher("navlogin.html").include(request, response);
		out.println("<div class='container'>");
		
		
		out.print("<h3>Select File to Upload :</h3>");
		
		request.getRequestDispatcher("Upload.html").include(request, response);
		
		request.getRequestDispatcher("footer.html").include(request, response);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	// Method to handle POST method request.
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      doGet(request, response);
	   }
}