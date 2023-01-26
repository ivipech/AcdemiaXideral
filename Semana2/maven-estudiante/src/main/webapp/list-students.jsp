<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Seguimiento Estudiantes App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Universidad Java</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
			
			<input type="button" value="Añadir Estudiante" 
				   onclick="window.location.href='add-student-form.jsp'; return false;"
				   class="add-student-button"
			/>
			
			<table>
			
				<tr>
					<th>Nombre Propio</th>
					<th>Apellido</th>
					<th>Correo</th>
					<th>Accion</th>
				</tr>
				
				<c:forEach var="estudianteTemp" items="${ESTUDIANTES_LISTA}">
					
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="StudentControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="studentId" value="${estudianteTemp.id}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="StudentControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="studentId" value="${estudianteTemp.id}" />
					</c:url>
																		
					<tr>
						<td> ${estudianteTemp.nombre} </td>
						<td> ${estudianteTemp.apellido} </td>
						<td> ${estudianteTemp.correo} </td>
						<td> 
							<a href="${tempLink}">Editar</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('¿Está seguro que desea eliminar este estudiante?'))) return false">
							Eliminar</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








