<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<html>
<head>
<title>Status</title>
<style>
div
#frm *{display:inline}
#wrap { width: 600px; height: 390px; padding: 0; overflow: hidden; }
#panel2{
    display:none;
}
</style>
<script language="javascript" type="text/javascript">
    function dynamicdropdown(listindex)
    {
        switch (listindex)
        {
        case "17" :
            document.getElementById("status").options[0]=new Option("-Month-","");
            document.getElementById("status").options[1]=new Option("January","1");
            document.getElementById("status").options[2]=new Option("February","2");
            document.getElementById("status").options[3]=new Option("March","3");
            document.getElementById("status").options[4]=new Option("April","4");
            document.getElementById("status").options[5]=new Option("May","5");
            document.getElementById("status").options[6]=new Option("June","6");
            document.getElementById("status").options[7]=new Option("July","7");
            document.getElementById("status").options[8]=new Option("August","8");
            document.getElementById("status").options[9]=new Option("September","9");
            document.getElementById("status").options[10]=new Option("October","10");
            document.getElementById("status").options[11]=new Option("November","11");
            document.getElementById("status").options[12]=new Option("December","12");
            break;
        }
        return true;
    }
</script>
<script>
function showPanel(a,b)
    {
    document.getElementById(a).style.display="inline-block";
    document.getElementById(b).style.display="none";
    }
</script>
</head>
<body>
<div style="float: left; margin-left: 0px;" class="category_div"
		id="category_div">
		<strong>Year :</strong>
		 <select id="source" name="source"
			onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
			<option value="">-Year-</option>
			<option value="17">2017</option>
			<option value="16">2016</option>
			<option value="15">2015</option>
			<option value="14">2014</option>
			<option value="13">2013</option>
		</select>
	</div>
	<div style="float: left; margin-left: 10px;" class="sub_category_div" id="sub_category_div">
		<strong>Month :</strong>&nbsp;
		<script type="text/javascript" language="JavaScript">
        document.write('<select name="status" id="status"><option value="">-Month-</option></select>')
        </script>
    </div>
        
    <span style="display: inline-block; width: 10px;"></span>
    <a href="ReportStatus.jsp" target="Show">
	<input class="btn btn-primary" type="submit" value="Show" onclick="showPanel('panel2','panel1')" />
	<br clear="all" /><br clear="all" />
	<iframe id="panel2" name="Show" width="100%" height="500px" ></iframe></a>
	<br clear="all" /><br clear="all" /><br clear="all" /><br clear="all" />
	<br clear="all" /><br clear="all" /><br clear="all" /><br clear="all" />

</body>
</html>