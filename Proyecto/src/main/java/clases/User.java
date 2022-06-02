package clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DBConnection;

public class User extends ElementWName {

	private String password;
	private String email;
	private String serial;

	public User(String name, String password, String email) throws SQLException {
		super(name);

		Statement smt = DBConnection.connect();
		if (smt.executeUpdate("INSERT INTO user VALUES('" + name + "','" + email + "','" + password + "')") > 0) {

			this.password = password;
			this.email = email;
		} else {
			DBConnection.disconnect();
			throw new SQLException("Insert erroeneo");
		}
	}

	public User(String name, String password) throws SQLException {
		super(name);

		Statement smt = DBConnection.connect();
		ResultSet cursor = smt.executeQuery("select * from user where username='" + name + "'");

		if (cursor.next()) {
			this.name = cursor.getString("username");
			if (this.name.equals(name)) {
				this.password = cursor.getString("password");
				if (!this.password.equals(password)) {

					DBConnection.disconnect();
				}
			} else {
				DBConnection.disconnect();
			}
		}
	}
}
