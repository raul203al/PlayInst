package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private final static String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/playinst";
	private final static String usuarioBD = "root";
	private final static String passwordBD = "";
	private static Connection conexion;

	public static Statement connect() {

		try {
			if (conexion == null) {
				conexion = DriverManager.getConnection(cadenaConexion, usuarioBD, passwordBD);
			}
			return conexion.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
			return null;
		}
	}

	public static void disconnect() {
		if (conexion != null) {
			try {
				conexion.close();
				conexion = null;
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
