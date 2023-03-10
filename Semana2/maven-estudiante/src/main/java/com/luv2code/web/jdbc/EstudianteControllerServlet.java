package com.luv2code.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class EstudianteControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EstudianteDbUtil studentDbUtil;
	
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			studentDbUtil = new EstudianteDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			
			// if the command is missing, then default to listing students
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			// route to the appropriate method
			switch (theCommand) {
			
			case "LIST":
				listaEstudiantes(request, response);
				break;
				
			case "ADD":
				agregarEstudiante(request, response);
				break;
				
			case "LOAD":
				cargarEstudiante(request, response);
				break;
				
			case "UPDATE":
				actualizarEstudiante(request, response);
				break;
			
			case "DELETE":
				borrarEstudiante(request, response);
				break;
				
			default:
				listaEstudiantes(request, response);
			}
				
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	private void borrarEstudiante(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student id from form data
		String elEstudiante = request.getParameter("studentId");
		
		// delete student from database
		studentDbUtil.borrarEstudiante(elEstudiante);
		
		// send them back to "list students" page
		listaEstudiantes(request, response);
	}

	private void actualizarEstudiante(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read student info from form data
		int id = Integer.parseInt(request.getParameter("studentId"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		
		// create a new student object
		Estudiante elEstudiante = new Estudiante(id, nombre, apellido, correo);
		
		// perform update on database
		studentDbUtil.actualizarEstudiante(elEstudiante);
		
		// send them back to the "list students" page
		listaEstudiantes(request, response);
		
	}

	private void cargarEstudiante(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// read student id from form data
		String estudianteId = request.getParameter("studentId");
		
		// get student from database (db util)
		Estudiante elEstudiante = studentDbUtil.getEstudiante(estudianteId);
		
		// place student in the request attribute
		request.setAttribute("EL_ESTUDIANTE", elEstudiante);
		
		// send to jsp page: update-student-form.jsp
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/update-student-form.jsp");
		dispatcher.forward(request, response);		
	}

	private void agregarEstudiante(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student info from form data
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");		
		
		// create a new student object
		Estudiante theStudent = new Estudiante(nombre, apellido, correo);
		
		// add the student to the database
		studentDbUtil.agregarEstudiante(theStudent);
				
		// send back to main page (the student list)
		listaEstudiantes(request, response);
	}

	private void listaEstudiantes(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get students from db util
		List<Estudiante> estudiantes = studentDbUtil.getStudents();
		
		// add students to the request
		request.setAttribute("ESTUDIANTES_LISTA", estudiantes);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);
	}

}













