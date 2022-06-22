<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import ="model.Account,model.Diary,model.Login,java.util.List" %>
    <%
    Account loginAc = (Account)session.getAttribute("loginAc");
    
    String Msg =(String)request.getAttribute("Msg");
    String eMsg =(String)request.getAttribute("eMsg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="css/loginOK.css">

<link href= "https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel= "stylesheet" integrity= "sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">"
<title>YOGADIARY</title>
</head>
<body>
	<script>
			alert("Hi、<%=loginAc.getUserName()%> !");
		</script>

 <div class="loginOK">
<br><br><br><h1><%=Msg %></h1>
	<br><br><br><a class="btn-circle-3d-dent" href="/yogadiary/ListServlet">Go Diary</a>
	</div>


</body>
</html>