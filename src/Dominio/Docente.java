package Dominio;

import java.sql.Date;

public class Docente {
	private int idDocente;
	private String legajo;
	private String dni;
	private String nombre;
	private String apellido;
	private Date fecha_Nacimiento;
	private String adress;
	private Localidad localidad;
	private String email;
	private String telefono;
	private boolean estado;
	
	
	public Docente () {
		super();
		this.idDocente = 0;
		this.legajo = null;
		this.dni = null;
		this.nombre = null;
		this.apellido = null;
		this.fecha_Nacimiento = null;
		this.adress = null;
		this.localidad = null;
		this.email = null;
		this.telefono = null;
		this.estado = false;
	}

	
	public Docente(int idDocente, String legajo, String dni, String nombre, String apellido, Date fecha_Nacimiento,
			String adress, Localidad localidad, String email, String telefono, boolean estado) {
		super();
		this.idDocente = idDocente;
		this.legajo = legajo;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_Nacimiento = fecha_Nacimiento;
		this.adress = adress;
		this.localidad = localidad;
		this.email = email;
		this.telefono = telefono;
		this.estado = estado;
	}
	
	
	public int getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(int idDocente) {
		this.idDocente = idDocente;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}
	public void setFecha_Nacimiento(Date fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
}
