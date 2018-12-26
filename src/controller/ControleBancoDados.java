package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Usuario;

public class ControleBancoDados {
	
	private static Connection criarConexao() {
		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
			e.printStackTrace();
			return null;

		}

		Connection connection = null;

		try {

			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/despesasdegastos", "postgres",
					"admin");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;

		}
		return connection;
	}
	
	public static void criarNovoUsuario(String nome, String sobrenome, String nickname, String email, String senha)
	{
		Connection mandarUsuario = criarConexao();
		String query = "INSERT INTO despesasschema.despesasusuarios(nome_usuario, sobrenome_usuario, nickname_usuario, email_usuario, senha) VALUES (?, ?, ?, ?, ?);";	
		try {
			PreparedStatement pst = mandarUsuario.prepareStatement(query);
			
			pst.setString(1, nome);
			pst.setString(2, sobrenome);
			pst.setString(3, nickname);
			pst.setString(4, email);
			pst.setString(5, senha);
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			mandarUsuario.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Usuario acessarSistema(String email, String senha) {
		Connection checkUsuarioExiste = criarConexao();
		String query = "SELECT id_usuario, nome_usuario, sobrenome_usuario, nickname_usuario, email_usuario, senha FROM despesasschema.despesasusuarios WHERE email_usuario=? AND senha=?;";
		
		PreparedStatement pst;
		Usuario usuarioEncontrado = null;
		try {
			pst = checkUsuarioExiste.prepareStatement(query);
			pst.setString(1, email);
			pst.setString(2, senha);
			
			ResultSet rs = pst.executeQuery();
			
			
			
			if(rs.next())
			{
				usuarioEncontrado = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			checkUsuarioExiste.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarioEncontrado;
	}
}
