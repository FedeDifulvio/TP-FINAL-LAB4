package Dominio;

import java.sql.Date;
import java.util.ArrayList;

public class Curso {
	private int idCurso;
	private String nombre;
	private String semestre;
	private Date anio;
	private Docente docente;
	private Materia materia;
	private boolean estado;
	private ArrayList<Alumno> listaAlumnos;
	
	public Curso () {
		this.idCurso = 0;
		this.nombre = null;
		this.semestre = null;
		this.anio = null;
		this.docente = null;
		this.materia = null;
		this.estado = false;
		listaAlumnos = null;
	}

	public Curso(int idCurso, String nombre, String semestre, Date anio, Docente docente, Materia materia,
			boolean estado, ArrayList<Alumno> listaAlumnos) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.semestre = semestre;
		this.anio = anio;
		this.docente = docente;
		this.materia = materia;
		this.estado = estado;
		this.listaAlumnos = listaAlumnos;
	}
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public Date getAnio() {
		return anio;
	}
	public void setAnio(Date anio) {
		this.anio = anio;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public boolean isEstado() {
		return estado;
	}
	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
