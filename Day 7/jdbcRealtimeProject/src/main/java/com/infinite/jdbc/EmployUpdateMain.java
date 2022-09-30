package com.infinite.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdateMain {

	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Employ Name");
		employ.setName(sc.next());
		System.out.println(" Enter Department");
		employ.setDept(sc.next());
		System.out.println(" Enter Designation");
		employ.setDesign(sc.next());
		System.out.println(" Enter Basic");
		employ.setBasic(sc.nextInt());
		
		
		
				try {
					System.out.println(new EmployDAO().updateEmploy(employ));
				} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
			
		}

	}

