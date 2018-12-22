package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Usuario;

/**
 * Servlet implementation class ControleUsuario
 */
@WebServlet(name = "usuario.jsp", urlPatterns = { "/usuario.jsp" })
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
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			if(Boolean.parseBoolean(request.getParameter("registro")))
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
			
			//TODO Validar com o banco de dados
			
			if(email!=null && senha != null)
			{
				request.setAttribute("nomeusuario", email);
				request.getRequestDispatcher("perfilusuario.jsp").forward(request, response);
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

			Usuario u = new Usuario(nome, sobrenome, nickname, email, senha);

			if(!ObservadorUsuario.controleDeUsuariosExistentes.containsKey(u.getId()))
			{
				ObservadorUsuario.controleDeUsuariosExistentes.put(u.getId(),u);
				request.setAttribute("nomeusuario", u.getPrimeiroNome());
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				//TODO erro, id do usuário já existente
			}
		}

}
