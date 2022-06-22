<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <%@ page import ="model.Account,model.Teacher,model.Login,java.util.List" %>
    <%
    List<Teacher>teacherList =(List<Teacher>)request.getAttribute("teacherList");
    Account loginAc=(Account)session.getAttribute("loginAc");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<link rel="stylesheet" href="css/teacher.css">
<title>Registration your teacher</title>
</head>
<body>

			<br><br><br><h1 class = "mb-3" style="text-align:center">today's teacher is..</h1>
		<div class="mx-auto" style="width:300px">

	<form action="/yogadiary/TeacherRegisterServlet" method="post">
		<div class="mx-auto" style="width:300px">
		
			<div class="mb-3">
				<label for="teacher1" class="form-label"></label>				
				<input type="text" class="form-control"  name="teacher1">
			</div>
			<div class="mb-3">
				<label for="teacher2" class="form-label"></label>
				<input type="text" class="form-control"  name="teacher2" >
			</div>
			<div class="mb-3">
				<label for="teacher3" class="form-label"></label>
				<input type="text" class="form-control"  name="teacher3" >
			</div>
			<div class="mb-3">
				<label for="teacher4" class="form-label"></label>
				<input type="text" class="form-control"  name="teacher4" >
			</div>
			<div class="mb-3">
				<label for="teacher5" class="form-label"></label>
				<input type="text" class="form-control"  name="teacher5" >
			</div>
			
			<div class="mb-3">
				<label for="myName" class="form-label"></label>
				<input type="hidden" name="myName"class="form-control" value="<%=loginAc.getUserName() %>">	
			</div>
				<button type="submit" name="id" class="btn new-btn new-btn:hover">SUBMIT</button>
	</form>
		<br><a class="btn btn--yellow btn--cubic" href="/yogadiary/ListServlet"/>DIARY</a>
		</div>
</body>
</html>