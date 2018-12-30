package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.UsuarioDAO;

public class Cadastro {
	public void registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String nome = request.getParameter("nomeusuario");
		String sobrenome = request.getParameter("sobrenomeusuario");
		String nickname = request.getParameter("nickname");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String redigitaSenha = request.getParameter("redigitasenha");

		UsuarioDAO.criarNovoUsuario(nome, sobrenome, nickname, email, senha);
		
		response.sendRedirect("login.jsp");
		
//		Usuario u = new Usuario(nome, sobrenome, nickname, email, senha);
//
//		if(!ObservadorUsuario.controleDeUsuariosExistentes.containsKey(u.getId()))
//		{
//			ObservadorUsuario.controleDeUsuariosExistentes.put(u.getId(),u);
//			request.setAttribute("nomeusuario", u.getPrimeiroNome());
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//		}
//		else
//		{
//			//TODO erro, id do usuário já existente
//		}
	}
}
