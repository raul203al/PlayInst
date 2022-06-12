package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que permite la conexión a la base de datos
 * @author raul203al
 * @param cadenaConexion String que contiene el enlace a la conexion con la base de datos
 * @param usuarioDB String que contiene el usuario de la base de datos
 * @param passwordDB String que contiene la contraseña del usuario de la base de datos
 *
 */
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
