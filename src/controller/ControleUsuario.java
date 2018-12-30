package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Usuario;

/**
 * Servlet implementation class ControleUsuario
 */
@WebServlet("/usuario")
public class ControleUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleUsuario() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("usuario")!=null)
		{
			//TODO
		}
	}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			if(request.getParameter("registro")!=null)
			{
				registrarUsuario(request,response);
			}
			
			if(Boolean.parseBoolean(request.getParameter("acessar")))
			{
				acessarSistema(request,response);
			}
		}

		private void acessarSistema(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			
			Usuario usuarioAcessando = ControleBancoDados.acessarSistema(email,senha);
			
			if(usuarioAcessando != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuario", usuarioAcessando);
			
			request.getRequestDispatcher("perfilusuario.jsp").forward(request, response);
			}else {
				response.sendRedirect("login.jsp");
			}
		}

		private void registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			String nome = request.getParameter("nomeusuario");
			String sobrenome = request.getParameter("sobrenomeusuario");
			String nickname = request.getParameter("nickname");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			String redigitaSenha = request.getParameter("redigitasenha");

			ControleBancoDados.criarNovoUsuario(nome, sobrenome, nickname, email, senha);
			
			response.sendRedirect("login.jsp");
			
//			Usuario u = new Usuario(nome, sobrenome, nickname, email, senha);
//
//			if(!ObservadorUsuario.controleDeUsuariosExistentes.containsKey(u.getId()))
//			{
//				ObservadorUsuario.controleDeUsuariosExistentes.put(u.getId(),u);
//				request.setAttribute("nomeusuario", u.getPrimeiroNome());
//				request.getRequestDispatcher("login.jsp").forward(request, response);
//			}
//			else
//			{
//				//TODO erro, id do usuário já existente
//			}
		}

}
