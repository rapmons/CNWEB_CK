<%@ page language="java" import="java.util.ArrayList" %>
<%@ page language="java" import="Model.BEAN.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table border='1' width = '100%'>
 <caption> Du lieu </caption>
    <tr>
    <td> ma vac xin</td>     
    <td> Ten vac xin</td>
    <td> so mui</td>
      <td> mota</td>
      <td> gia vacxin</td>
      <td> ten hang sx</td>
    </tr>
 	<% ArrayList<VacXin> nvArray = (ArrayList<VacXin>)request.getAttribute("nvArray");
 		for(int i = 0 ; i< nvArray.size();i++){
 	%>
 	
    
 		 <tr>
 			<td> <%= nvArray.get(i).getmvc() %></td>
 			
 			<td> <%= nvArray.get(i).getten() %></td>
 			<td> <%= nvArray.get(i).getmui() %></td>
 			<td> <%= nvArray.get(i).getmota() %></td>
 			<td> <%= nvArray.get(i).getgia() %></td>
 			<td> <%= nvArray.get(i).gethang() %></td>
 			</tr>
 		
 		
 	<%} %>
 </table> 
 <a href="javascript:history.back()">Back</a>
</body>
</html>