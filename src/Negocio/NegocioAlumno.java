package Negocio;

import java.util.ArrayList;

import Dao.DaoAlumno;
import Dominio.Alumno;
import INegocio.INegocioAlumno;

public class NegocioAlumno implements INegocioAlumno{
	


	@Override
	public ArrayList<Alumno> listarAlumnos() {
		DaoAlumno daoalumno = new DaoAlumno();
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos = daoalumno.listarAlumnos();
		return alumnos;
	}

	@Override
	public boolean agregarAlumno(Alumno alumno) {
		DaoAlumno daoalumno = new DaoAlumno();
		boolean estado = daoalumno.agregarAlumno(alumno);
		return estado;
	}

	@Override
	public boolean eliminarAlumno(int idAlumno) {
		DaoAlumno daoalumno = new DaoAlumno();
		boolean estado = daoalumno.eliminarAlumno(idAlumno);
		return estado;
	}

	@Override
	public boolean modificarAlumno(Alumno alumno) {
		DaoAlumno daoalumno = new DaoAlumno();
		boolean estado = daoalumno.modificarAlumno(alumno);
		return estado;
	}
	
}
