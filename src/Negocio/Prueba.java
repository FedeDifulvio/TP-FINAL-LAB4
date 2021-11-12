package Negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import Dao.DaoAlumno;
import Dao.DaoLocalidad;
import Dao.DaoPais;
import Dao.DaoProvincias;
import Dominio.Alumno;
import Dominio.Localidad;
import Dominio.Pais;
import Dominio.Provincia;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoLocalidad dao = new DaoLocalidad();
		DaoProvincias daop = new DaoProvincias();
		ArrayList<Localidad> localidades =  dao.listarLocalidades();
		ArrayList<Provincia> provincias =  daop.listarProvincias();
		DaoPais daopaises = new DaoPais();
		ArrayList<Pais> paises =  daopaises.listarPaises();
		DaoAlumno daoAlumnos = new DaoAlumno();
		ArrayList<Alumno> alumnos =  daoAlumnos.listarAlumnos();
		LocalDate ld = LocalDate.of(2019, 10, 30);
		Localidad loc = new Localidad(1, 1, "");
		Provincia prov = new Provincia (1, "", 1);
		Pais pais = new Pais (1, "");
		//Alumno alumno = new Alumno(1,"1234","12345","alegato","420",date,"asd",loc,prov,pais,"asd","asd",false);
		Alumno alumno = new Alumno();
		alumno.setIdAlumno(25);
		alumno.setLegajo("1234");
		alumno.setDni("12345");
		alumno.setNombre("a");
		alumno.setApellido("420");
		alumno.setFecha_Nacimiento(ld);
		alumno.setAdress("asd");
		alumno.setLocalidad(loc);
		alumno.setProvincia(prov);
		alumno.setPais(pais);
		alumno.setEmail("asd");
		alumno.setTelefono("asd");
		alumno.setEstado(false);
		//daoAlumnos.agregarAlumno(alumno);
		daoAlumnos.modificarAlumno(alumno);
		for (Localidad loca : localidades) {
			System.out.println(loca.toString());
		}
		for (Provincia provv : provincias) {
			System.out.println(provv.toString());
		}
		for (Pais paiss : paises) {
			System.out.println(paiss.toString());
		}
		for (Alumno al: alumnos) {
			System.out.println(al.toString());
		}
		
	}

}
