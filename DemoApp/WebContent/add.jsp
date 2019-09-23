<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "pink">
	<%	
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;
		out.println("Output from add.jsp: " + k);
	%>
	<%
		try{
			int m = 9/0;	
		}catch(Exception e){
			out.println("Exception from catch block: " +e.getMessage()) ;
		}
	%>
	
	<%
		int n = 18/0; 
	%>
	
</body>
</html>