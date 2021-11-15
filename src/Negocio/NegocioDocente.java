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
		listaDocentes = daoDocente.listarDocentes();
		
		return listaDocentes;
	}

	
	public int agregarDocente(Docente Docente) {
		
		IDocente daoDocente = new DaoDocente();
		
		int idGenerado = daoDocente.agregarDocente(Docente); 
		
		return idGenerado; 
	}

	
	public boolean eliminarDocente(int idDocente) {
		 
        IDocente daoDocente = new DaoDocente();
		
		boolean estado = daoDocente.eliminarDocente(idDocente);
		
		return estado;
	}

	public boolean modificarDocente(Docente Docente) {
		
		IDocente daoDocente = new DaoDocente();
		
		boolean estado = daoDocente.modificarDocente(Docente);
		
		return estado;
	}

}
