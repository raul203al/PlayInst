package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.a.TextRowFactory;

import exceptions.EmailException;
import exceptions.PasswordException;
import exceptions.UsernameException;
import utils.DBConnection;
/**
 * Clase que crea a los usuarios para la base de datos
 * @author raul203al
 *
 */
public class User {

	private String password;
	private String email;
	private String serial;
	private String name;

	/**
	 * Constructor que se usa para añadir a los usuario en la base de datos
	 * @param name String del nombre
	 * @param password String de la contraseña
	 * @param email String del correo
	 */
	public User(String name, String password, String email)
			throws SQLException, PasswordException, EmailException, UsernameException {

		Statement smt = DBConnection.connect();
		setEmail(email);
		setName(name);
		setPassword(password);
		if (smt.executeUpdate("INSERT INTO user VALUES('" + name + "','" + email + "','" + password + "')") > 0) {
		} else {
			DBConnection.disconnect();
			throw new SQLException("Insert erroeneo");
		}
		DBConnection.disconnect();
	}

	/**
	 * Constructor que se usa para leer si el usuario y contraseña coinciden en la base de datos
	 * @param name String del nombre
	 * @param password String de la contraseña
	 */
	public User(String name, String password) throws SQLException {
		Statement smt = DBConnection.connect();
		ResultSet cursor = smt.executeQuery("select * from user where username='" + name + "'");

		if (cursor.next()) {
			this.password = cursor.getString("password");
			if (!this.password.equals(password) || this.password.equals(null)) {
				DBConnection.disconnect();
			} else {
				DBConnection.disconnect();
			}
		} else {
			DBConnection.disconnect();
			throw new SQLException("Error");

		}
		DBConnection.disconnect();
	}

	public User() {
	}

	/**
	 * Funcion que obtiene un arraylist con todos los usuario
	 * @return Arraylist de Users
	 */
	public static ArrayList<User> getTodos() {
		ArrayList<User> ret = new ArrayList<User>();

		Statement smt = DBConnection.connect();

		try {
			ResultSet cursor = smt.executeQuery("select * from user");
			while (cursor.next()) {
				User u = new User();
				u.email = cursor.getString("email");
				u.password = cursor.getString("password");
				u.name = cursor.getString("username");
				ret.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnection.disconnect();

		return ret;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if (password.isBlank()) {
			throw new PasswordException("La contraseña es muy corta");

		} else {
			this.password = password;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailException {

		this.email = email;

	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws UsernameException {
		if (name.isBlank()) {
			throw new UsernameException(name);
		} else {
			this.name = name;

		}
	}
}
