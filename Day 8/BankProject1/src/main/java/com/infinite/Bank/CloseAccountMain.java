package com.infinite.Bank;

import java.sql.SQLException;
import java.util.Scanner ;

public class CloseAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int accountNo ;
		System.out.println(" Enter AccountNo ");
		accountNo = sc.nextInt();
		BankDAO dao = new BankDAO();
		try {
			System.out.println(dao.closeAccount(accountNo));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

}
}