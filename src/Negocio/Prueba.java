package Negocio;

import java.util.ArrayList;

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
		for (Localidad loc : localidades) {
			System.out.println(loc.toString());
		}
		for (Provincia prov : provincias) {
			System.out.println(prov.toString());
		}
		for (Pais pais : paises) {
			System.out.println(pais.toString());
		}
		for (Alumno al: alumnos) {
			System.out.println(al.toString());
		}
	}

}
