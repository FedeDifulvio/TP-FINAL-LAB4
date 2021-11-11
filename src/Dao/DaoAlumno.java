package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Alumno;
import Dominio.Localidad;
import Dominio.Pais;
import Dominio.Provincia;
import IDao.IAlumno;

public class DaoAlumno implements IAlumno{

	
	public ArrayList<Alumno> listarAlumnos() {
		ResultSet resultSet; 
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		Conexion conexionSql = null; 
		String query = "select a.id, a.legajo, a.nombre, a.apellido, a.fecha_nac as 'Nacimiento', a.adress as 'Direccion', p.id as 'idPais', p.nombre as 'Pais', pr.id as 'idProvincia', pr.nombre as 'Provincia', l.id as 'idLocalidad', l.nombre as 'Localidad', a.email, a.tel, a.estado, a.dni from alumno as a inner join localidad as l on l.id = a.id_localidad inner join provincia as pr on pr.id = a.id_provincia inner join pais as p on p.id = a.id_pais";
			
		try {
			conexionSql = new Conexion();
			Connection connection = conexionSql.obtenerConexion();
			PreparedStatement statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{	
				alumnos.add(
				new Alumno(
						resultSet.getInt("id"),
						resultSet.getString("legajo"),
						resultSet.getString("dni"),
						resultSet.getString("nombre"),
						resultSet.getString("apellido"),
						resultSet.getDate("Nacimiento"),
						resultSet.getString("Direccion"),
						new Localidad(resultSet.getInt("idLocalidad"), resultSet.getInt("idProvincia"),resultSet.getString("Localidad")),
						new Provincia(resultSet.getInt("idProvincia"), resultSet.getString("Provincia"), resultSet.getInt("idPais")),
						new Pais(resultSet.getInt("idPais"), resultSet.getString("Pais")),
						resultSet.getString("email"),
						resultSet.getString("tel"),
						resultSet.getBoolean("estado")
				));
			}
			
			return alumnos; 
				
		} 
		catch (SQLException e) {
			
			 e.printStackTrace();
		} 
		
		finally {
			conexionSql.cerrarConexion();
		}

		return null;
	}


	public boolean agregarAlumno(Alumno alumno) {
		
		return false;
	}

	
	public boolean eliminarAlumno(int idAlumno) {
		
		return false;
	}

	
	public boolean modificarAlumno(Alumno alumno) {
		
		return false;
	}

}
