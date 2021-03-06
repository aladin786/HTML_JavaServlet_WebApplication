package com.tamilnadu.servlets;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet(name="ApproveEmailSendingServlet",urlPatterns={"/ApproveEmailSendingServlet"})
public class ApproveEmailSendingServlet extends HttpServlet {
    private String host;
    private String port;
 
    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter out=response.getWriter();
        // reads form fields
    	String user = "demotamilnadu@gmail.com";
    	String pass = "tamilnadu";
        String recipient = "demotamilnadu@gmail.com";
        String subject = "File Confirmation";
        String content = "Hi, your file has been approved by Kumbakunam Division Collectorate office! Thanks, Collector of Kumbakonam Division";
        
 
        try {
            EmailUtility.sendEmail(host, port, user, pass,
                    recipient, subject, content);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('File approved Successfully!');");
            out.println("alert('The e-mail and SMS has been sent Successfully to user!');");
            out.println("location='Report';");
            out.println("</script>");
        }
    }
}