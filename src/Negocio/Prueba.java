package Negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import Dao.DaoAlumno;
import Dao.DaoDocente;
import Dao.DaoLocalidad;
import Dao.DaoPais;
import Dao.DaoProvincias;
import Dao.DaoUsuario;
import Dominio.Alumno;
import Dominio.Docente;
import Dominio.Localidad;
import Dominio.Pais;
import Dominio.Provincia;
import Dominio.TipoUsuario;
import Dominio.Usuario;

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
		
		DaoDocente daoDoc = new DaoDocente();
		ArrayList<Docente> docentes =  daoDoc.listarDocentes();
		LocalDate ld = LocalDate.of(2019, 10, 30);
		Localidad loc = new Localidad(1, 1, "");
		Provincia prov = new Provincia (1, "", 1);
		Pais pais = new Pais (1, "");
		//Alumno alumno = new Alumno(1,"1234","12345","alegato","420",date,"asd",loc,prov,pais,"asd","asd",false);
//		Alumno alumno = new Alumno();
//		alumno.setIdAlumno(25);
//		alumno.setLegajo("1234");
//		alumno.setDni("12345");
//		alumno.setNombre("a");
//		alumno.setApellido("420");
//		alumno.setFecha_Nacimiento(ld);
//		alumno.setAdress("asd");
//		alumno.setLocalidad(loc);
//		alumno.setProvincia(prov);
//		alumno.setPais(pais);
//		alumno.setEmail("asd");
//		alumno.setTelefono("asd");
//		alumno.setEstado(false);
		//daoAlumnos.agregarAlumno(alumno);
//		daoAlumnos.modificarAlumno(alumno);
//		for (Localidad loca : localidades) {
//			System.out.println(loca.toString());
//		}
//		for (Provincia provv : provincias) {
//			System.out.println(provv.toString());
//		}
//		for (Pais paiss : paises) {
//			System.out.println(paiss.toString());
//		}
		

		
//		Docente docente = new Docente();
//		docente.setIdDocente(1);
//		docente.setLegajo("56456");
//		docente.setDni("698767");
//		docente.setNombre("Pepe Romagnoli");
//		docente.setApellido("dasdashtetw");
//		docente.setFecha_Nacimiento(ld);
//		docente.setAdress("Rivadai");
//		docente.setLocalidad(loc);
//		docente.setProvincia(prov);
//		docente.setPais(pais);
//		docente.setEmail("asd@asd.ar");
//		docente.setTelefono("asd@aushdiuasyd.mx");
//		docente.setEstado(true);
//		
//		daoDoc.modificarDocente(docente);
		
//		for (Docente docccc : docentes) {
//			System.out.println(docccc.toString());
//		}
		
//		daoDoc.agregarDocente(docente);
		
//		daoDoc.eliminarDocente(1);

//		Usuario userPrueba = new Usuario(4, "SantiPerfecto", "Juan123", new TipoUsuario(1, ""), 420, true);
		DaoUsuario daoUser = new DaoUsuario();
//		
//		
//		daoUser.eliminarUsuario(4);
		ArrayList<Usuario> usuarios =  daoUser.listarUsuarios();
//				
		for (Usuario user : usuarios) {
			System.out.println(user.toString());
		}
		
		
	}

}
