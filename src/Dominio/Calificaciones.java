package Dominio;

public class Calificaciones {
	private int idCalificaciones;
	private int idAlumno;
	private int idCurso;
	private float parcial1;
	private float parcial2;
	private float recuperatorio1;
	private float recuperatorio2;
	private boolean estadoAcademico;
	
	public Calificaciones() {
		super();
		this.idCalificaciones = 0;
		this.idAlumno = 0;
		this.idCurso = 0;
		this.parcial1 = 0;
		this.parcial2 = 0;
		this.recuperatorio1 = 0;
		this.recuperatorio2 = 0;
		this.estadoAcademico = false;
	}
	
	public Calificaciones(int idCalificaciones, int idAlumno, int idCurso, float parcial1, float parcial2,
			float recuperatorio1, float recuperatorio2, boolean estadoAcademico) {
		super();
		this.idCalificaciones = idCalificaciones;
		this.idAlumno = idAlumno;
		this.idCurso = idCurso;
		this.parcial1 = parcial1;
		this.parcial2 = parcial2;
		this.recuperatorio1 = recuperatorio1;
		this.recuperatorio2 = recuperatorio2;
		this.estadoAcademico = estadoAcademico;
	}
	
	public int getIdCalificaciones() {
		return idCalificaciones;
	}
	public void setIdCalificaciones(int idCalificaciones) {
		this.idCalificaciones = idCalificaciones;
	}
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public float getParcial1() {
		return parcial1;
	}
	public void setParcial1(float parcial1) {
		this.parcial1 = parcial1;
	}
	public float getParcial2() {
		return parcial2;
	}
	public void setParcial2(float parcial2) {
		this.parcial2 = parcial2;
	}
	public float getRecuperatorio1() {
		return recuperatorio1;
	}
	public void setRecuperatorio1(float recuperatorio1) {
		this.recuperatorio1 = recuperatorio1;
	}
	public float getRecuperatorio2() {
		return recuperatorio2;
	}
	public void setRecuperatorio2(float recuperatorio2) {
		this.recuperatorio2 = recuperatorio2;
	}
	public boolean getEstadoAcademico() {
		return estadoAcademico;
	}
	public void setEstadoAcademico(boolean estadoAcademico) {
		this.estadoAcademico = estadoAcademico;
	}
	
	
	
}
