package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Usuario;
import entity.UsuarioDAO;

public class Login {
	public void acessarSistema(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		Usuario usuarioAcessando = UsuarioDAO.acessarSistema(email,senha);
		
		if(usuarioAcessando != null) {
		HttpSession sessao = request.getSession();
		sessao.setAttribute("usuario", usuarioAcessando);
		
		request.getRequestDispatcher("perfilusuario.jsp").forward(request, response);
		}else {
			response.sendRedirect("login.jsp");
		}
	}
}
