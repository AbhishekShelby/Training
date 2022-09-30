package com.infinite.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int empno;
		Scanner sc = new Scanner(System.in);
		empno = sc.nextInt();
		EmployDAO dao = new EmployDAO();
		System.out.println(dao.deleteEmploy(empno));

	}

}
