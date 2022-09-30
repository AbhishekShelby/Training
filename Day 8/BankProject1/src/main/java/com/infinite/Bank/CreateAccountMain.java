package com.infinite.Bank;

import java.sql.SQLException;
import java.util.Scanner;

class CreateAccountMain {

	public static void main(String[] args) {

  BankDAO dao =new BankDAO() ;
  Bank bank = new Bank();
  Scanner sc = new Scanner (System.in );
  System.out.println(" Enter FirstName");
  bank.setFirstName(sc.next());
  System.out.println(" Enter LastName");
  bank.setLastName(sc.next());
  System.out.println(" Enter City");
  bank.setCity(sc.next());
  System.out.println(" Enter State");
  bank.setState(sc.next());
  System.out.println(" Enter Amount ");
  bank.setAmount(sc.nextInt());
  System.out.println(" Enter cheqFacil(yes/no)");
  bank.setCheqFacil(sc.next());
  System.out.println(" Enter AccuntType ");
  bank.setAccountType(sc.next());
 
  
try {
	System.out.println(dao.createAccount(bank));
} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
} catch (SQLException e) {
	
	e.printStackTrace();
}
try {
	System.out.println(dao.createAccount(bank));
} catch (ClassNotFoundException e) {
	
	e.printStackTrace();
} catch (SQLException e) {
	
	e.printStackTrace();
}

	}

}
