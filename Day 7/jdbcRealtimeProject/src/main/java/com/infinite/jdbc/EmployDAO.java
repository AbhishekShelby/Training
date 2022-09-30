package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String updateEmploy(Employ employNew) throws ClassNotFoundException, SQLException{
		Employ employ = searchEmploy(employNew.getEmpno());
		if (employ!=null){
			String cmd = "update set name=?,Dept=?,Desig=?" + "Basic=? Where empno=?";
		 
		
	pst = connection.prepareStatement(cmd);
	pst.setString(1, employ.getName());
	pst.setString(2, employ.getDept());
	pst.setString(3, employ.getDesign());
	pst.setInt(4, employ.getBasic());
	pst.executeUpdate();
	return"Record Updated" ;
		}
		return "record not found ";
	}
	
	public String deleteEmploy(int empno) throws SQLException, ClassNotFoundException{
	Employ employ = searchEmploy(empno);
	if (employ!=null){
	connection = ConnectionHelper.getConnnection();
	String cmd = "delete from Employ where empno=?";
	pst= connection.prepareStatement(cmd);
	pst.setInt(1, empno);
	pst.executeUpdate();
	return "Record Deleted....";
	}
	return "Employ Record Not Found";
	
	}
	
	
	
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnnection();
		String cmd = "insert into Employ (name,dept,desig,basic)"
				+ "values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, employ.getName());
		pst.setString(2, employ.getDept());
		pst.setString(3, employ.getDesign());
		pst.setInt(4, employ.getBasic());
		pst.executeUpdate();
		return"Record Inserted" ;
		
		
		
		
	}

	
	public Employ searchEmploy(int empno)
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesign(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
		}
		return employ;
	}
	public List<Employ> showEmploy() throws 
				ClassNotFoundException, SQLException {
		List<Employ> employList = new ArrayList<Employ>();
		connection = ConnectionHelper.getConnnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesign(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
			employList.add(employ);
		}
		return employList;
	}
}
