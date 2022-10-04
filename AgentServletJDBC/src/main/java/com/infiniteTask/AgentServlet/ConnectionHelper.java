package com.infiniteTask.AgentServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnectionHelper
 */
public class ConnectionHelper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnectionHelper() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		public static Connection getConnnection() throws ClassNotFoundException, SQLException{
			ResourceBundle rb = ResourceBundle.getBundle("db");
			String Name = rb.getString("Name");
			String City = rb.getString("City");
			String Gender = rb.getString("Gender");
			String MaritalStatus = rb.getString("MaritalStatus");
			Double Premium = rb.getdouble("Premium");
			Class.forName(Name);
			Connection con=DriverManager.getConnection(Name,City,Gender, MaritalStatus);
			return con;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
