<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <%@ page import ="model.Account,model.Diary,model.Teacher,model.Login,java.util.List" %>
    <% 
    Teacher teachers=(Teacher)request.getAttribute("teachers");
    Account loginAc=(Account)session.getAttribute("loginAc");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<link rel="stylesheet" href="css/new.css">
<title>New day</title>
	<script>
		alert("Good morning、<%=loginAc.getUserName()%> !");
	</script>
</head>
<body>
	<div class="mx-auto" style="width:300px">
		<h1 class = "mb-3" style="text-align:center">New Day</h1>
	<form action="/yogadiary/NewServlet" method="post">

		<div class="mb-3">
			<label for="myName" class="form-label"></label>
			<input type="hidden" name="myName"class="form-control" value="<%=loginAc.getUserName() %>">			
		</div>
		<div class="mb-3">
			<label for="date" class="form-label">date</label>
			<input type="date" class="form-control" id="date" name="date">
		</div>
		<div class="mb-3">
			<label for="weather" class="form-label">weather</label>
			<select name="weather" class="form-control">
				<option value="☀">sunny️</option>
				<option value="🌂">rainy</option>
				<option value="☁">cloudy️</option>
				<option value="❄">snow️</option>
				<option value="🌀">stolm</option>
			</select>
		</div>
		<div class="mb-3">
			<label for="covid19" class="form-label">COVID-19</label>
			<select name="covid19" class="form-control">
					<%for(int i=0;i<=50000;i+=100){ 
					out.print("<option value=\""+i+"\">"+i+"</option>");
					}%>
			</select>		
		</div>
		<div class="mb-3">
			<label for="BBT" class="form-label">BBT</label>
			<select name="BBT" class="form-control">		
				<option value="35.0">35.0</option>
				<option value="35.1">35.1</option>
				<option value="35.2">35.2</option>
				<option value="35.3">35.3</option>
				<option value="35.4">35.4</option>
				<option value="35.5">35.5</option>
				<option value="35.6">35.6</option>
				<option value="35.7">35.7</option>
				<option value="35.8">35.8</option>
				<option value="35.9">35.9</option>
				<option value="36.0">36.0</option>
				<option value="36.1">36.1</option>
				<option value="36.2">36.2</option>
				<option value="36.3">36.3</option>
				<option value="36.4">36.4</option>
				<option value="36.5">36.5</option>
				<option value="36.6">36.6</option>
				<option value="36.7">36.7</option>
				<option value="36.8">36.8</option>
				<option value="36.9">36.9</option>
				<option value="37.0">37.0</option>
				<option value="37.5">37.5</option>
				<option value="38.0">38.0</option>
			</select> 
		</div>
		<br>
		<div class="mb-3">
			<label for="time" class="form-label">start time
			<input type="time"  name="time"></label>	
		</div>
	</div>
	<br>
	<div style="text-align:center;style="width:300px">
			<input type="radio"  name="series" value="rest">rest
			<input type="radio"  name="series" value="mindfullness">mind
			<input type="radio"  name="series" value="relux">relux
			<input type="radio"  name="series" value="hatha">hatha
			<input type="radio"  name="series" value="pilates">pilates
			<input type="radio"  name="series" value="power">power
			<input type="radio"  name="series" value="hot">hot
			<input type="radio"  name="series" value="yin">yin
			<input type="radio"  name="series" value="matanity">matanity
			<input type="radio"  name="series"  value="sunsultation"checkd>sun
			<input type="radio"  name="series" value="half">half
			<input type="radio"  name="series"  value="full">full
			<input type="radio"  name="series" value="second">second
			<input type="radio"  name="series"  value="red">red
	</div>
	<br>
	<div class="mx-auto" style="width:300px">
		<div class="mb-3">
			<label for="teacher" class="form-label">teacher</label>
			<select name="teacher" class="form-control">
				<option value="self">self</option>
				<option value="<%=teachers.getTeacher1()%>"><%=teachers.getTeacher1()%></option>
				<option value="<%=teachers.getTeacher2()%>"><%=teachers.getTeacher2()%></option>
				<option value="<%=teachers.getTeacher3()%>"><%=teachers.getTeacher3()%></option>
				<option value="<%=teachers.getTeacher4()%>"><%=teachers.getTeacher4()%></option>
				<option value="<%=teachers.getTeacher5()%>"><%=teachers.getTeacher5()%></option>
			</select></div>
		<div class="mb-3">
			<label for="condition" class="form-label">condition</label>
			<input type="text" class="form-control" name="condition">
		</div>
		<div class="mb-3">
			<input type="checkbox" name="breath" value="★"> breath
			<input type="checkbox" name="vanda" value="★"> vanda
			<input type="checkbox" name="dristi" value="★︎"> dristi
		</div>
		<div class="mb-3">
			<label for="ate" class="form-label">What I ate</label>
			<input type="text" class="form-control"  name="ate">
		</div>
		<div class="mb-3">
			<label for="event" class="form-label">event</label>
			<input type="text" class="form-control"  name="event">
		</div>
	</div>
	<div style="text-align:center;">
		<button type="submit" class="btn new-btn new-btn:hover" >GO </button>
	</form>
		<br><br><a class="btn btn--yellow btn--cubic" href="/yogadiary/ListServlet"/>DIARY</a>
	</div>
	
</body>
</html>
