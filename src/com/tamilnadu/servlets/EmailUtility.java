package com.tamilnadu.servlets;
 
import java.util.Date;
import java.util.Properties;
 
import javax.mail.*;
import javax.mail.internet.*;

public class EmailUtility {
    public static void sendEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {
 
        // sets SMTP server properties
    	Properties props = new Properties();
    	props.put("mail.smtp.host", "smtp.gmail.com");
    	props.put("mail.smtp.auth", "true");
    	props.put("mail.smtp.port", "465");
    	props.put("mail.smtp.socketFactory.port", "465");
    	props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    	props.put("mail.smtp.socketFactory.fallback", "false");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(props, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setText(message);
 
        // sends the e-mail
        Transport.send(msg);
 
    }
}