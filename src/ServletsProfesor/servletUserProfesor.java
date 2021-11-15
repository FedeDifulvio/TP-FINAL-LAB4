package ServletsProfesor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dominio.Docente;
import Dominio.TipoUsuario;
import Dominio.Usuario;
import Helpers.Helpers;
import INegocio.INegocioUsuario;
import Negocio.NegocioUsuario;

/**
 * Servlet implementation class servletUserProfesor
 */
@WebServlet("/servletUserProfesor")
public class servletUserProfesor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletUserProfesor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 System.out.println("get");
		
		 int id = Integer.parseInt(request.getAttribute("idGenerado").toString()); 
		 
		 Docente docenteUser = new Docente();
			
		 docenteUser = Helpers.encontrarDocente(id); 
		 
		 request.setAttribute("docenteUser", docenteUser); 
		 
		 Helpers.redireccionar("VISTAS/VISTAS PROFESOR/UserProfesor.jsp", request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		if(request.getParameter("id")!=null){
			doGet(request, response);
			return;
		}
		
		int referencia = Integer.parseInt(request.getParameter("referencia").toString()); 
		String usuario = request.getParameter("usuario").toString(); 
		String pass =  request.getParameter("pass").toString(); 
		
		INegocioUsuario NegUser = new NegocioUsuario(); 
		
		Usuario user = new Usuario();
		
		
		user.setReferencia(referencia);
		user.setUser_Name(usuario);
		user.setPass(pass);
		user.setTipoUsuario(new TipoUsuario(2, "profesor"));
		user.setEstado(true);
		
		boolean estado = NegUser.agregarUsuario(user); 
		
		Helpers.redireccionar("servletListarProfesor", request, response); 
		
	}

}
