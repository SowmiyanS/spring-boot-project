package app.web.appsowmin.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public static void main(String[] args) throws SQLException {
		// register MySQL thin driver with DriverManager service
	    // It is optional for JDBC4.x version
	    //Class.forName("com.mysql.cj.jdbc.Driver");

	    // variables
	    final String url = "jdbc:mysql:///MyDatabase";
	    final String user = "root";
	    final String password = "root";

	    // establish the connection
	    Connection con = DriverManager.getConnection(url, user, password);

	    // display status message
	    if (con == null) {
	       System.out.println("JDBC connection is not established");
	       return;
	    } else
	       System.out.println("Congratulations," + 
	            " JDBC connection is established successfully.\n");

	    // close JDBC connection
	    con.close();
	}
}
