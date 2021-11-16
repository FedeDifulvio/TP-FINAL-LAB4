package ServletsUsuarios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dominio.Docente;
import Helpers.Helpers;

/**
 * Servlet implementation class servletEliminarUsuario
 */
@WebServlet("/servletEliminarUsuario")
public class servletEliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletEliminarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id")); 
		
		Docente docenteEliminar = new Docente();
		
		docenteEliminar = Helpers.encontrarDocente(id); 
	
		request.setAttribute("docenteEliminar", docenteEliminar);
		
		Helpers.redireccionar("VISTAS/VISTAS PROFESOR/EliminarProfesor.jsp", request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
