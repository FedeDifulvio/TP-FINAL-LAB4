package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Dominio.Curso;
import Dominio.Docente;
import Dominio.Materia;
import IDao.ICurso;

public class DaoCurso implements ICurso {

	
	public ArrayList<Curso> listarCursos() {
		ResultSet resultSet; 
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		Conexion conexionSql = null; 
		String query = "select c.id, c.nombre as nombreCurso, c.semestre, c.anio, c.id_docente, d.nombre as nombreDocente, c.id_materia, m.nombre as nombreMateria, c.estado from curso c inner join docente d on d.id = c.id_docente inner join materia m on m.id = c.id_materia";
			
		try {
			conexionSql = new Conexion();
			Connection connection = conexionSql.obtenerConexion();
			PreparedStatement statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{	
				cursos.add(
				   new Curso(
						   resultSet.getInt("id"),
						   resultSet.getString("nombreCurso"),
						   resultSet.getString("semestre"),
						   resultSet.getString("anio"),
						   new Docente(
								 resultSet.getInt("id_docente"),
								 resultSet.getString("nombreDocente")
						   ),
						   
						   new Materia(
								   resultSet.getInt("id_materia"),
								   resultSet.getString("nombreMateria")
						   ),
						   
						   resultSet.getBoolean("estado")
				));
			}
			
			return cursos; 
				
		} 
		catch (SQLException e) {
			
			 e.printStackTrace();
		} 
		
		finally {
			conexionSql.cerrarConexion();
		}

		return null;
	}

	
	public ArrayList<Curso> listarMisCursos(int idProfesor) {
		// TODO Auto-generated method stub
		return null;
	}

}
