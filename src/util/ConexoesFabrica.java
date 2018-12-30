package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexoesFabrica {
	
	public static Connection criarConexao() {
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
}
