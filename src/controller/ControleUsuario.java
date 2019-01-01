package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import action.Cadastro;
import action.Login;

/**
 * Servlet implementation class ControleUsuario
 */
@WebServlet("/usuario")
public class ControleUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
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
				new Cadastro().registrarUsuario(request,response);
			}
			
			if(Boolean.parseBoolean(request.getParameter("acessar")))
			{
				new Login().acessarSistema(request,response);
			}
		}
}
