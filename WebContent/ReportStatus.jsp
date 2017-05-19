<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>Status</title>

<%
try {
/* Create string of connection url within specified format with machine
name, port number and database name. Here machine name id localhost and 
database name is student. */
String connectionURL = "jdbc:mysql://localhost:3307/loginpage";
// declare a connection by using Connection interface
Connection connection = null;
/* declare object of Statement interface that is used for executing sql 
statements. */
Statement statement = null;
// declare a resultset that uses as a table for output data from tha table.
ResultSet rs = null;
// Load JBBC driver "com.mysql.jdbc.Driver"
Class.forName("com.mysql.jdbc.Driver").newInstance();
/* Create a connection by using getConnection() method that takes parameters 
of string type connection url, user name and password to connect to database.*/
connection = DriverManager.getConnection(connectionURL, "root", "test");
/* createStatement() is used for create statement object that is used for 
sending sql statements to the specified database. */
statement = connection.createStatement();
// sql query to retrieve values from the secified table.
String QueryString = "SELECT * from reportstatus";
rs = statement.executeQuery(QueryString);
%>
<table align="center" cellpadding="10" cellspacing="5" style="padding: 5px 5px 5px 5px;" border="1" style="background-color:  #FFFF00;">
<%
while (rs.next()) {
%>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getDate(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getDate(7)%></td>
<td><%=rs.getString(8)%></td>
</tr>
<% } %>
<%
// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
<%
out.println("<script>alert('Unable to connect to database.')</script>");
}
%>
</table>
<br>

</body>
</html>