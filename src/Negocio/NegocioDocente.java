package Negocio;

import java.util.ArrayList;

import Dao.DaoDocente;
import Dominio.Docente;
import IDao.IDocente;
import INegocio.INegocioDocente;

public class NegocioDocente implements INegocioDocente{

	
	public ArrayList<Docente> listarDocentes() {
		ArrayList<Docente> listaDocentes = new ArrayList<Docente>(); 
		IDocente daoDocente = new DaoDocente();
		System.out.println("se cargo el negocio");
		listaDocentes = daoDocente.listarDocentes();
		
		return listaDocentes;
	}

	
	public boolean agregarDocente(Docente Docente) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean eliminarDocente(int idDocente) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificarDocente(Docente Docente) {
		// TODO Auto-generated method stub
		return false;
	}

}
