package entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.ConexoesFabrica;

public class UsuarioDAO {

	public static void criarNovoUsuario(String nome, String sobrenome, String nickname, String email, String senha)
	{
		Connection mandarUsuario = ConexoesFabrica.criarConexao();
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
		Connection checkUsuarioExiste = ConexoesFabrica.criarConexao();
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
