<%@ page import="java.util.*, com.luv2code.web.jdbc.*" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<%
	// get the students from the request object (sent by servlet)
	List<Estudiante> theStudents = 
					(List<Estudiante>) request.getAttribute("STUDENT_LIST");
%>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Universidad Java</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<table>
			
				<tr>
					<th>Nombre Propio</th>
					<th>Apellido</th>
					<th>Correo</th>
				</tr>
				
				<% for (Estudiante tempStudent : theStudents) { %>
				
					<tr>
						<td> <%= tempStudent.getNombre() %> </td>
						<td> <%= tempStudent.getApellido() %> </td>
						<td> <%= tempStudent.getCorreo() %> </td>
					</tr>
				
				<% } %>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








