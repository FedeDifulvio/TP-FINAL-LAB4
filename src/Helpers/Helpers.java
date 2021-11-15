package Helpers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dominio.Docente;
import Dominio.Localidad;
import Dominio.Pais;
import Dominio.Provincia;
import INegocio.INegocioLocalidad;
import INegocio.INegocioPais;
import INegocio.INegocioProvincia;
import Negocio.NegocioDocente;
import Negocio.NegocioLocalidad;
import Negocio.NegocioPais;
import Negocio.NegocioProvincia;

public class Helpers {
    
	public static void cargarPaises(HttpServletRequest request) {
		
		INegocioPais NegPais = new NegocioPais(); 
		ArrayList<Pais> paises = new ArrayList<Pais>();
		paises = NegPais.listarPaises(); 
		request.setAttribute("paises", paises);
		
	} 
	
    public static void cargarProvincias(HttpServletRequest request) {
		
		INegocioProvincia NegProv = new NegocioProvincia(); 
		ArrayList<Provincia> provincias = new ArrayList<Provincia>();
		provincias = NegProv.listarProvincias(); 
		request.setAttribute("provincias", provincias);
		
	}
    
    public static void cargarLocalidades(HttpServletRequest request) {
		
		INegocioLocalidad NegLoc = new NegocioLocalidad(); 
		ArrayList<Localidad> localidades = new ArrayList<Localidad>();
		localidades = NegLoc.listarLocalidades(); 
		request.setAttribute("localidades", localidades);
		
	}
    
    public static Docente encontrarDocente(int id) {
    	
    	NegocioDocente negocioDocente = new NegocioDocente();
		ArrayList<Docente> listaDocentes = negocioDocente.listarDocentes(); 
		
		for(Docente docente : listaDocentes)
		{
			if(docente.getIdDocente()==id) {
				return docente;
			}
		}
		return null;
    	
    }
    
    
    public static void redireccionar(String direccion, HttpServletRequest request,  HttpServletResponse response) {
    	
    	RequestDispatcher rd = request.getRequestDispatcher(direccion);  
        try {
        	
            rd.forward(request, response);
        } catch (ServletException | IOException e) {
        	
            e.printStackTrace();
        }
    }
    
}
