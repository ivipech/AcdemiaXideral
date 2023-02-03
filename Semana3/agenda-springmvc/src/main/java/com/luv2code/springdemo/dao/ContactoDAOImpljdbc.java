package com.luv2code.springdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Contacto;

@Repository
public class ContactoDAOImpljdbc implements ContactoDAO {
	
	@Autowired
	DataSource datasource;

	@Override
	public List<Contacto> getContactos() {
		List<Contacto> contactos = new ArrayList<>();

		String sql = "select * from contacto order by nombre";
		
		try (Connection myConn = datasource.getConnection();
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql)) {
		
			while (myRs.next()) {
				
				int id = myRs.getInt("id");
				String nombre = myRs.getString("nombre");
				String alias = myRs.getString("alias");
				String telefono = myRs.getString("numero");

				// create new student object
				Contacto tempContacto = new Contacto(id, nombre, alias, telefono);
				
				contactos.add(tempContacto);				
			}
			
			return contactos;		
		}catch (Exception e) {
			e.printStackTrace();
			return contactos;
		}
	}

	@Override
	public void guardarContacto(Contacto theContacto) {
		if(theContacto.getId() != 0) {
			
				try (
					Connection myConn = datasource.getConnection();
					PreparedStatement myStmt = myConn.prepareStatement("update contacto set nombre=?, alias=?, numero=? where id=?")
				) {
					myStmt.setString(1, theContacto.getNombre());
					myStmt.setString(2, theContacto.getAlias());
					myStmt.setString(3, theContacto.getTelefono());
					myStmt.setInt(4, theContacto.getId());
					myStmt.execute();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}else {
			
				try (Connection myConn = datasource.getConnection();
					 PreparedStatement myStmt = myConn.prepareStatement("insert into contacto (nombre, alias, numero) values (?, ?, ?)")) {

					myStmt.setString(1, theContacto.getNombre());
					myStmt.setString(2, theContacto.getAlias());
					myStmt.setString(3, theContacto.getTelefono());
					
					myStmt.execute();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			
		}	
	}

	@Override
	public Contacto getContacto(int theId) {
		Contacto theContacto = null;
		
		try (Connection myConn = datasource.getConnection();
				 PreparedStatement myStmt = myConn.prepareStatement("select * from contacto where id=?")) {

				myStmt.setInt(1, theId);
				ResultSet myRs = myStmt.executeQuery();

				if (myRs.next()) {
					String nombre = myRs.getString("nombre");
					String alias = myRs.getString("alias");
					String telefono = myRs.getString("numero");

					theContacto = new Contacto(theId, nombre, alias, telefono);
				} else {
					throw new Exception("Could not find student id: " + theId);
				}

				return theContacto;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return theContacto;


	}

	@Override
	public void deleteContacto(int theId) {
		try (Connection myConn = datasource.getConnection();
				 PreparedStatement myStmt = myConn.prepareStatement("delete from contacto where id=?")) {

				// set params
				myStmt.setInt(1, theId);

				// execute sql statement
				myStmt.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}

}











