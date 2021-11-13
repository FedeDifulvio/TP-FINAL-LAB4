package IDao;

import java.util.ArrayList;

import Dominio.Curso;


public interface ICurso { 
	
	public ArrayList<Curso> listarCursos();

	public ArrayList<Curso> listarMisCursos(int idProfesor); 
}
