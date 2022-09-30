package com.infinite.agent;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.ResourceBundle;

	public class ConnectionHelper {
		
		public static Connection getConnnection() throws ClassNotFoundException, SQLException{
			ResourceBundle rb = ResourceBundle.getBundle("db");
			String Name = rb.getString("Name");
			String City = rb.getString("City");
			String Gender = rb.getString("Gender");
			String MaritalStatus = rb.getString("MaritalStatus");
			String Premium = rb.getInt("Premium");
			Class.forName(Name);
			Connection con=DriverManager.getConnection(Name,City,Gender, MaritalStatus);
			return con;
			

	}

}
