<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String Msg =(String)request.getAttribute("Msg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/createAccount.css">
<link href= "https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel= "stylesheet" integrity= "sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">"
<title>Create Account</title>
</head>
<body>

	<div class="mx-auto" style="width: 300px;">
		<br><br><br><br><h1 class="mb-3" style="text-align: center">create account</h1>
	<form action="/yogadiary/CreateAccountServlet" method="post">
		<div class="mb-3">
			<label for="userName" class="form-label">Username</label>
			<input type="text" class="form-control" id="userName" name="userName">
		</div>
		<div class="mb-3">
			<label for="pass" class="form-label">password</label>
			<input type="password" class="form-control" id="pass" name="pass"placeholder="enter within 10 characters">
		</div>
			<button type="submit" class="btn new-btn new-btn:hover">New Account</button>
	</form>
			<%if(Msg != null){ %>
			<h3><%=Msg %></h3>
			<%} %>
	</div>
</body>
</html>