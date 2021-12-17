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
<div >

           <%   VacXin pb =(VacXin)request.getAttribute("pb");   %> 
                        <form action="update" method="post">
                            <label>ma vacxin</label> <input type="text" readonly name="id" value=<%= pb.getmvc() %>>  
                            <label>Ten vacxin</label> <input type="text"  name="name" value=<%= pb.getten() %>>                     
                        
                            <label>so mui</label> <input type="text"  name="mota" value=<%= pb.getmui() %> />
                             <label>Mo ta </label> <input type="text"  name="mota" value=<%= pb.getmota() %> />
                            <label>gia vacxin</label> <input type="text"  name="mota" value=<%= pb.getgia() %> />
                             <label>ten hang sx</label> <input type="text"  name="mota" value=<%= pb.gethang() %> />
                        
                           <button type="submit" class="btn btn-success">Save</button>
                        </form>
                  <a href="javascript:history.back()">Back</a>
            </div>
</body>
</html>