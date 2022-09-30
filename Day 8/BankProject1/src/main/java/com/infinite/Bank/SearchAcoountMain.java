package com.infinite.Bank;

import java.sql.SQLException;
import java.util.Scanner ;

public class SearchAcoountMain {

	public static void main(String[] args) {
		int accountNo ;
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter AccountNo ");
		accountNo = sc.nextInt();
		BankDAO dao = new BankDAO();
		try {
			Bank bank = dao.searchAccount(accountNo);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
