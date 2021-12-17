<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%

	session.setAttribute("User",request.getAttribute("User"));


if(session.getAttribute("User")!=null && (String)session.getAttribute("User")!="guest"){
%>    
    <a href="<%=request.getContextPath()%>/newVC"><span>them vac xin</span></a> <br>
    <a href="<%=request.getContextPath()%>/listNV"><span>cap nhat  vac xin</span></a> <br>
    <a href="<%=request.getContextPath()%>/TimNV"><span>tim kiem</span></a> <br>
    
    
<%} %>
</body>
</html>