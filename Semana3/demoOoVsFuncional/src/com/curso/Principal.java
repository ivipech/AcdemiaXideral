package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
	
	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {

		List<Employee> listEmpleados = Arrays.asList(arrayOfEmps);
		
		System.out.println(listEmpleados);
		
		//Filtrar: Salario menor a 400
				//Aumentar salario en 200
		for(Employee employee : listEmpleados) {
			if(employee.getSalary() < 400.0) {
				employee.setSalary(employee.getSalary() + 200);
			}
		}
		
		System.out.println(listEmpleados);
		
		//Filtrar: Longitud del nombre sea mayor a 6
		
		List<Employee> empleadosMayor6 = new ArrayList<>();
		
		for (Employee employee : listEmpleados) {
			if(employee.getNombre().length() > 6) {
				empleadosMayor6.add(employee);
			}
		}
		
		System.out.println(empleadosMayor6);
		
		//Ordenar por nombre
		 Collections.sort(listEmpleados, new ComparadorNombres());
		 System.out.println(listEmpleados);
		
		//Lista de nombres
		
		
		
	}

}

class ComparadorNombres implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}

