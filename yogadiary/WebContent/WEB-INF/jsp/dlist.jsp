<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="model.Account,model.Diary,model.Login,java.util.List" %>
   
    <%
	    List<Diary>diaryList1=(List<Diary>)request.getAttribute("diaryList1");
	    List<Diary>diaryList2=(List<Diary>)request.getAttribute("diaryList2");
	    List<Diary>diaryList3=(List<Diary>)request.getAttribute("diaryList3");
	    List<Diary>diaryList4=(List<Diary>)request.getAttribute("diaryList4");
	    List<Diary>diaryList5=(List<Diary>)request.getAttribute("diaryList5");
	    List<Diary>diaryList6=(List<Diary>)request.getAttribute("diaryList6");
	    List<Diary>diaryList7=(List<Diary>)request.getAttribute("diaryList7");
	    List<Diary>diaryList8=(List<Diary>)request.getAttribute("diaryList8");
	    List<Diary>diaryList9=(List<Diary>)request.getAttribute("diaryList9");
	    List<Diary>diaryList10=(List<Diary>)request.getAttribute("diaryList10");
	    List<Diary>diaryList11=(List<Diary>)request.getAttribute("diaryList11");
	    List<Diary>diaryList12=(List<Diary>)request.getAttribute("diaryList12");
   
    	 Account loginAc = (Account)session.getAttribute("loginAc");
    %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css">
		<link rel="stylesheet" href="css/dlist.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
		<title>YogaDiary</title>
	</head>
	<body>
		
      	 <div class = "mx-auto text-center" style="width:90%;">
			<img src="om.png"align="center"width="100" height="100">

			<h2 class = "text-center mb-3">YogaDiary</h2>

			<div class="list-group">
				<div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
								<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
							
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>
						
								<%for(Diary d1 : diaryList1){ %>
							<tr>
									<td><%=d1.getDate() %></td>
									<td><%=d1.getWeather() %></td>
									<td><%=d1.getCovid19() %></td>
									<td><%=d1.getBBT() %></td>
									<td><%=d1.getTime() %></td>
									<td><%=d1.getSeries() %></td>
									<td><%=d1.getTeacher() %></td>
									<td><%=d1.getCondition() %></td>
									<td><%=d1.getBreath() %></td>
									<td><%=d1.getVanda() %></td>
									<td><%=d1.getDristi() %></td>
									<td><%=d1.getAte() %></td>
									<td><%=d1.getEvent() %></td>
									
								<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d1.getId() %>"></td>
								</form>
								<form action="/yogadiary/DropServlet" method="post" id="destroy">
									<td><input type="submit" name="id" value="<%=d1.getId() %>" ></td>
								</form>
								<th scope = "col"></th>
							</tr>  
								<%} %>
						</tbody>
					</table>
		      </div> 
     		 <div class="list-group-item">
				<table class = "table table-striped">
					<thead>
						<tr>
							<th scope = "col">date</th>
							<th scope = "col">weather</th>
							<th scope = "col">covid19</th>
							<th scope = "col">BBT</th>
							<th scope = "col">time</th>
							<th scope = "col">class/series</th>
							<th scope = "col">teacher</th>
							<th scope = "col">condition</th>
							<th scope = "col">breath</th>
							<th scope = "col">vanda</th>
							<th scope = "col">dristi</th>
							<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
							<th id="update_display" scope= "col">update</th>
							<th id="delete_display" scope = "col">delete️</th>
							<th scope = "col"></th>
						</tr>
					</thead>
					<tbody>	
							<%for(Diary d2 : diaryList2){ %>
						<tr>
							<td><%=d2.getDate() %></td>
							<td><%=d2.getWeather() %></td>
							<td><%=d2.getCovid19() %></td>
							<td><%=d2.getBBT() %></td>
							<td><%=d2.getTime() %></td>
							<td><%=d2.getSeries() %></td>
							<td><%=d2.getTeacher() %></td>
							<td><%=d2.getCondition() %></td>
							<td><%=d2.getBreath() %></td>
							<td><%=d2.getVanda() %></td>
							<td><%=d2.getDristi() %></td>
						<td><%=d2.getAte() %></td>
									<td><%=d2.getEvent() %></td>
						<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d2.getId() %>"></td>
								</form>
						<form action="/yogadiary/DropServlet" method="post" id="destroy">
							<td><input type="submit" name="id" value="<%=d2.getId() %>" ></td>
						</form>
						</tr>
							<%} %>
					</tbody>
				</table>
			 </div>  
			<div class="list-group-item">
				<table class = "table table-striped">
					<thead>
						<tr>
							<th scope = "col">date</th>
							<th scope = "col">weather</th>
							<th scope = "col">covid19</th>
							<th scope = "col">BBT</th>
							<th scope = "col">time</th>
							<th scope = "col">class/series</th>
							<th scope = "col">teacher</th>
							<th scope = "col">condition</th>
							<th scope = "col">breath</th>
							<th scope = "col">vanda</th>
							<th scope = "col">dristi</th>
							<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
							<th id="update_display" scope= "col">update</th>
							<th id="delete_display" scope = "col">delete️</th>
							<th scope = "col"></th>
						</tr>
					</thead>
					<tbody>
							<%for(Diary d3 : diaryList3){ %>
						<tr>	
							<td><%=d3.getDate() %>
							<td><%=d3.getWeather() %></td>
							<td><%=d3.getCovid19() %></td>
							<td><%=d3.getBBT() %></td>
							<td><%=d3.getTime() %></td>
							<td><%=d3.getSeries() %></td>
							<td><%=d3.getTeacher() %></td>
							<td><%=d3.getCondition() %></td>
							<td><%=d3.getBreath() %></td>
							<td><%=d3.getVanda() %></td>
							<td><%=d3.getDristi() %></td>
							<td><%=d3.getAte() %></td>
									<td><%=d3.getEvent() %></td>
						<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d3.getId() %>"></td>
								</form>
						<form action="/yogadiary/DropServlet" method="post" id="destroy">
							<td><input type="submit" name="id" value="<%=d3.getId() %>" ></td>
						</form>
						</tr>
							<%} %>
					</tbody>
				</table>
			 </div> 
      		<div class="list-group-item">
				<table class = "table table-striped">
					<thead>
						<tr>
							<th scope = "col">date</th>
							<th scope = "col">weather</th>
							<th scope = "col">covid19</th>
							<th scope = "col">BBT</th>
							<th scope = "col">time</th>
							<th scope = "col">class/series</th>
							<th scope = "col">teacher</th>
							<th scope = "col">condition</th>
							<th scope = "col">breath</th>
							<th scope = "col">vanda</th>
							<th scope = "col">dristi</th>
							<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
							<th id="update_display" scope= "col">update</th>
							<th id="delete_display" scope = "col">delete️</th>
							<th scope = "col"></th>
						</tr>
					</thead>
					<tbody>
		
							<%for(Diary d4 : diaryList4){ %>
						<tr>
							<td><%=d4.getDate() %></td>
							<td><%=d4.getWeather() %></td>
							<td><%=d4.getCovid19() %></td>
							<td><%=d4.getBBT() %></td>
							<td><%=d4.getTime() %></td>
							<td><%=d4.getSeries() %></td>
							<td><%=d4.getTeacher() %></td>
							<td><%=d4.getCondition() %></td>
							<td><%=d4.getBreath() %></td>
							<td><%=d4.getVanda() %></td>
							<td><%=d4.getDristi() %></td>
						<td><%=d4.getAte() %></td>
									<td><%=d4.getEvent() %></td>
						<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d4.getId() %>"></td>
								</form>
						<form action="/yogadiary/DropServlet" method="post" id="destroy">
							<td><input type="submit" name="id" value="<%=d4.getId() %>" ></td>
						</form>
						</tr>
							<%} %>
					</tbody>
				</table>
			 </div> 
      		<div class="list-group-item">
				<table class = "table table-striped">
					<thead>
						<tr>
							<th scope = "col">date</th>
							<th scope = "col">weather</th>
							<th scope = "col">covid19</th>
							<th scope = "col">BBT</th>
							<th scope = "col">time</th>
							<th scope = "col">class/series</th>
							<th scope = "col">teacher</th>
							<th scope = "col">condition</th>
							<th scope = "col">breath</th>
							<th scope = "col">vanda</th>
							<th scope = "col">dristi</th>
							<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
							<th id="update_display" scope= "col">update</th>
							<th id="delete_display" scope = "col">delete️</th>
							<th scope = "col"></th>
						</tr>
					</thead>
					<tbody>
							<%for(Diary d5 : diaryList5){ %>
						<tr>
							<td><%=d5.getDate() %></td>
							<td><%=d5.getWeather() %></td>
							<td><%=d5.getCovid19() %></td>
							<td><%=d5.getBBT() %></td>
							<td><%=d5.getTime() %></td>
							<td><%=d5.getSeries() %></td>
							<td><%=d5.getTeacher() %></td>
							<td><%=d5.getCondition() %></td>
							<td><%=d5.getBreath() %></td>
							<td><%=d5.getVanda() %></td>
							<td><%=d5.getDristi() %></td>
							<td><%=d5.getAte() %></td>
									<td><%=d5.getEvent() %></td>
						<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d5.getId() %>"></td>
								</form>
						<form action="/yogadiary/DropServlet" method="post" id="destroy">
							<td><input type="submit" name="id" value="<%=d5.getId() %>" ></td>
						</form>
						</tr>
							<%} %>
						</tbody>
					</table>
				 </div> 
     			 <div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
								<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>
								<%for(Diary d6 : diaryList6){ %>
							<tr>
								<td><%=d6.getDate() %></td>
								<td><%=d6.getWeather() %></td>
								<td><%=d6.getCovid19() %></td>
								<td><%=d6.getBBT() %></td>
								<td><%=d6.getTime() %></td>
								<td><%=d6.getSeries() %></td>
								<td><%=d6.getTeacher() %></td>
								<td><%=d6.getCondition() %></td>
								<td><%=d6.getBreath() %></td>
								<td><%=d6.getVanda() %></td>
								<td><%=d6.getDristi() %></td>
								<td><%=d6.getAte() %></td>
									<td><%=d6.getEvent() %></td>
							<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d6.getId() %>"></td>
								</form>
							<form action="/yogadiary/DropServlet" method="post" id="destroy">
								<td><input type="submit"name="id" value="<%=d6.getId() %>" ></td>
							</form>
							</tr>
								<%} %>
						</tbody>
					</table>
				  </div> 
      			<div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
								<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>			
								<%for(Diary d7 : diaryList7){ %>
							<tr>
								<td><%=d7.getDate() %></td>
								<td><%=d7.getWeather() %></td>
								<td><%=d7.getCovid19() %></td>
								<td><%=d7.getBBT() %></td>
								<td><%=d7.getTime() %></td>
								<td><%=d7.getSeries() %></td>
								<td><%=d7.getTeacher() %></td>
								<td><%=d7.getCondition() %></td>
								<td><%=d7.getBreath() %></td>
								<td><%=d7.getVanda() %></td>
								<td><%=d7.getDristi() %></td>
								<td><%=d7.getAte() %> </td>
									<td><%=d7.getEvent() %></td>
							<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d7.getId() %>"></td>
								</form>
							<form action="/yogadiary/DropServlet" method="post" id="destroy">
								<td><input type="submit" name="id" value="<%=d7.getId() %>" ></td>
							</form>
							</tr>
								<%} %>
						</tbody>
					</table>
				 </div> 
     			 <div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
								<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>
								<%for(Diary d8 : diaryList8){ %>
							<tr>
								<td><%=d8.getDate() %></td>
								<td><%=d8.getWeather() %></td>
								<td><%=d8.getCovid19() %></td>
								<td><%=d8.getBBT() %></td>
								<td><%=d8.getTime() %></td>
								<td><%=d8.getSeries() %></td>
								<td><%=d8.getTeacher() %></td>
								<td><%=d8.getCondition() %></td>
								<td><%=d8.getBreath() %></td>
								<td><%=d8.getVanda() %></td>
								<td><%=d8.getDristi() %></td>
								<td><%=d8.getAte() %></td>
									<td><%=d8.getEvent() %></td>
							<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d8.getId() %>"></td>
								</form>
							<form action="/yogadiary/DropServlet" method="post" id="destroy">
								<td><input type="submit" name="id" value="<%=d8.getId() %>" ></td>
							</form>
							</tr>
								<%} %>
						</tbody>
					</table>
				</div> 
     			 <div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
								<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>
								<%for(Diary d9 : diaryList9){ %>
							<tr>
								<td><%=d9.getDate() %></td>
								<td><%=d9.getWeather() %></td>
								<td><%=d9.getCovid19() %></td>
								<td><%=d9.getBBT() %></td>
								<td><%=d9.getTime() %></td>
								<td><%=d9.getSeries() %></td>
								<td><%=d9.getTeacher() %></td>
								<td><%=d9.getCondition() %></td>
								<td><%=d9.getBreath() %></td>
								<td><%=d9.getVanda() %></td>
								<td><%=d9.getDristi() %></td>
							<td><%=d9.getAte() %></td>
									<td><%=d9.getEvent() %></td>
							<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d9.getId() %>"></td>
								</form>
							<form action="/yogadiary/DropServlet" method="post" id="destroy">
								<td><input type="submit" name="id" value="<%=d9.getId() %>" ></td>
							</form>
							</tr>
								<%} %>
						</tbody>
					</table>
				 </div> 
    			  <div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
							<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>
								<%for(Diary d10 : diaryList10){ %>
							<tr>
								<td><%=d10.getDate() %></td>
								<td><%=d10.getWeather() %></td>
								<td><%=d10.getCovid19() %></td>
								<td><%=d10.getBBT() %></td>
								<td><%=d10.getTime() %></td>
								<td><%=d10.getSeries() %></td>
								<td><%=d10.getTeacher() %></td>
								<td><%=d10.getCondition() %></td>
								<td><%=d10.getBreath() %></td>
								<td><%=d10.getVanda() %></td>
								<td><%=d10.getDristi() %></td>
								<td><%=d10.getAte() %></td>
									<td><%=d10.getEvent() %></td>
							<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d10.getId() %>"></td>
								</form>
							<form action="/yogadiary/DropServlet" method="post" id="destroy">
								<td><input type="submit" name="id" value="<%=d10.getId() %>" ></td>
							</form>
							</tr>
								<%} %>
						</tbody>
					</table>
				</div> 
      			<div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
								<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>		
								<%for(Diary d11 : diaryList11){ %>
							<tr>
								<td><%=d11.getDate() %></td>
								<td><%=d11.getWeather() %></td>
								<td><%=d11.getCovid19() %></td>
								<td><%=d11.getBBT() %></td>
								<td><%=d11.getTime() %></td>
								<td><%=d11.getSeries() %></td>
								<td><%=d11.getTeacher() %></td>
								<td><%=d11.getCondition() %></td>
								<td><%=d11.getBreath() %></td>
								<td><%=d11.getVanda() %></td>
								<td><%=d11.getDristi() %></td>
								<td><%=d11.getAte()%></td>
									<td><%=d11.getEvent() %></td>
							<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d11.getId() %>"></td>
								</form>
							<form action="/yogadiary/DropServlet" method="post" id="destroy">
								<td><input type="submit"name="id" value="<%=d11.getId() %>" ></td>
							</form>
							</tr>
								<%} %>
						</tbody>
					</table>
				</div> 
   			   <div class="list-group-item">
					<table class = "table table-striped">
						<thead>
							<tr>
								<th scope = "col">date</th>
								<th scope = "col">weather</th>
								<th scope = "col">covid19</th>
								<th scope = "col">BBT</th>
								<th scope = "col">time</th>
								<th scope = "col">class/series</th>
								<th scope = "col">teacher</th>
								<th scope = "col">condition</th>
								<th scope = "col">breath</th>
								<th scope = "col">vanda</th>
								<th scope = "col">dristi</th>
								<th scope = "col">What I ate</th>
								<th scope = "col">event</th>
								<th id="update_display" scope= "col">update</th>
								<th id="delete_display" scope = "col">delete️</th>
								<th scope = "col"></th>
							</tr>
						</thead>
						<tbody>
								<%for(Diary d12 : diaryList12){ %>
							<tr>
								<td><%=d12.getDate() %></td>
								<td><%=d12.getWeather() %></td>
								<td><%=d12.getCovid19() %></td>
								<td><%=d12.getBBT() %></td>
								<td><%=d12.getTime() %></td>
								<td><%=d12.getSeries() %></td>
								<td><%=d12.getTeacher() %></td>
								<td><%=d12.getCondition() %></td>
								<td><%=d12.getBreath() %></td>
								<td><%=d12.getVanda() %></td>
								<td><%=d12.getDristi() %></td>
							<td><%=d12.getAte()%></td>
									<td><%=d12.getEvent() %></td>
							<form action="/yogadiary/ShowServlet" method="post">
									<td><input type="submit" name="id" value="<%=d12.getId() %>"></td>
								</form>
								<form action="/yogadiary/DropServlet" method="post" id="destroy">
								<td><input type="submit" name="id" value="<%=d12.getId() %>" ></td>
							</form>
							</tr>
								<%} %>
						</tbody>
					</table>
 
 		<!-- <script>
			window.onload = function(){
				var array = ["update","delete"];
				    for(var j=0;j<array.length;j++){
				        var id = array[j] + "_display";
				        var obj = array[j] + "_check";
				        var CELL = document.getElementById(id);
				        var TABLE = CELL.parentNode.parentNode.parentNode;
				        for(var i=0;TABLE.rows[i];i++) {
				            TABLE.rows[i].cells[CELL.cellIndex].style.display = (document.getElementById(obj).checked) ? '' : 'none';
				        }
				    }
				}
				function checkbox_cell( obj,id ){
				    var CELL = document.getElementById(id);
				    var TABLE = CELL.parentNode.parentNode.parentNode;
				    for(var i=0;TABLE.rows[i];i++) {
				        TABLE.rows[i].cells[CELL.cellIndex].style.display = (obj.checked) ? '' : 'none';
				    }
				}
		</script>      -->
 
		<script src="js/jquery-3.6.0.min.js"></script>
		<script type="text/javascript" src="js/paginathing.min.js"></script>
		<script type="text/javascript">
			  jQuery(document).ready(function($){
				  
			    $('.list-group').paginathing({
			      	perPage: 1,
			     	firstLast:false,
			     	prevText:'prev',
			     	nextText:'next',
			    	activeClass:'active',
			    });
			  });
		</script>
				</div>
			</div>
		<!-- <input type="checkbox" id="update_check" onclick="checkbox_cell(this,'update_display')" >edit
		<input type="checkbox" id="delete_check" onclick="checkbox_cell(this,'delete_display')" >delete -->

		<a class="btn new-btn new-btn:hover" href="/yogadiary/NewServlet"/>New Day</a>
		<a href="/yogadiary/TeacherRegisterServlet" class="btn regist-btn regist-btn:hover">Registration teacher</a>
		<a href="/yogadiary/LogoutServlet" class="btn logout-btn logout-btn:hover">Logout</a>
		</div>
	</body>
</html>