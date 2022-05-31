package clases;

import java.sql.SQLException;
import java.sql.Statement;

import utils.DBConnection;

public class User extends ElementWName {

	private String password;
	private String email;
	private String serial;

	public User(String name, String password, String email, String serial) throws SQLException {
		super(name);

		
		Statement smt = DBConnection.connect();
		if(smt.executeUpdate("INSERT INTO user VALUES('"+name+"','"+email+"','"+password+"')")>0){
			
			this.password = password;
			this.email = email;
			this.serial = serial;
		}else {
			DBConnection.disconnect();
			throw new SQLException("Insert erroeneo");
		}
	}

}
