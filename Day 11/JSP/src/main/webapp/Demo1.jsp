<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Demo1.jsp" >
<center>
Name :
<input type="text" name="sname"/>
<input type="submit" name="show"/>
</center>
</form>
<%
if (request.getParameter("sname")!=null){
	String sname = request.getParameter("sname");
	out.println("Student Name"  +sname );
	
}
%>

</body>
</html>