package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dominio.Docente;
import INegocio.INegocioDocente;
import Negocio.NegocioDocente;


@WebServlet("/ServletListarProfesor")
public class ServletListarProfesor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletListarProfesor() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		NegocioDocente negocioDocente = new NegocioDocente();
		ArrayList<Docente> listaDocentes = new ArrayList<Docente>(); 
		listaDocentes = negocioDocente.listarDocentes(); 
		
		for(Docente d : listaDocentes) {
			System.out.println(d.toString());
		}
		request.setAttribute("listaDocentes", listaDocentes);
		RequestDispatcher rd = request.getRequestDispatcher("../VISTAS/VISTAS PROFESOR/ListarProfesores.jsp"); 
        try {
        	
            rd.forward(request, response);
        } catch (ServletException | IOException e) {
        	
            e.printStackTrace();
        }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
