package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utils.DBConnection;

public class User {

	private String password;
	private String email;
	private String serial;
	private String name;

	public User(String name, String password, String email) throws SQLException {

		Statement smt = DBConnection.connect();
		if (smt.executeUpdate("INSERT INTO user VALUES('" + name + "','" + email + "','" + password + "')") > 0) {

			this.password = password;
			this.email = email;
		} else {
			DBConnection.disconnect();
			throw new SQLException("Insert erroeneo");
		}
		DBConnection.disconnect();
	}

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
		}else {
			DBConnection.disconnect();
			throw new SQLException("Erro");

		}
		DBConnection.disconnect();
	}

	
	public User() {
	}

	public static ArrayList<User> getTodos() {
		ArrayList<User> ret=new ArrayList<User>();
		
		Statement smt=DBConnection.connect();
		
		try {
			ResultSet cursor=smt.executeQuery("select * from user");
			while(cursor.next()) {
				User u= new User();
				u.email=cursor.getString("email");
				u.password=cursor.getString("password");
				u.name=cursor.getString("username");
				ret.add(u);
			}
			
		} catch (SQLException e) {
			// AQUÍ NO DEBERÍA ENTRAR NUNCA PORQUE LA CONSULTA SIEMPRE VA A SER CORRECTA
			e.printStackTrace();
		}
		
		DBConnection.disconnect();
		
		return ret;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
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

	public void setName(String name) {
		this.name = name;
	}
}
