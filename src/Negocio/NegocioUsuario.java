package Negocio;

import java.util.ArrayList;

import Dao.DaoAlumno;
import Dao.DaoUsuario;
import Dominio.Alumno;
import Dominio.Usuario;
import IDao.IUsuario;
import INegocio.INegocioUsuario;

public class NegocioUsuario implements INegocioUsuario {

	@Override
	public ArrayList<Usuario> listarUsuarios() {
		DaoUsuario daoUsuario = new DaoUsuario();
		ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
		Usuarios = daoUsuario.listarUsuarios();
		return Usuarios;
	}

	@Override
	public boolean agregarUsuario(Usuario usuario) {
		
		IUsuario NegUser = new DaoUsuario();
		
		boolean estado = NegUser.agregarUsuario(usuario); 
		
		return estado;
	}

	@Override
	public boolean eliminarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
