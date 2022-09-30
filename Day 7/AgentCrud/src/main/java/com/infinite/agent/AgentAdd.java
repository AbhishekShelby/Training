package com.infinite.agent;

import java.sql.SQLException;
import java.util.Scanner;



public class AgentAdd {

	public static void main(String[] args) {
		Agent agent = new Agent();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Agent Name");
		agent.setName(sc.next());
		System.out.println(" Enter City");
		agent.setCity(sc.next());
		System.out.println(" Enter Gender");
		agent.setGender(sc.next());
		System.out.println(" Enter MaritalStatus");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println(" Enter Premium No.");
		agent.setPremium(sc.nextDouble());
		
		AgentDAO dao = new AgentDAO();
		try {
			System.out.println(dao.addAgent(agent));
		} catch (ClassNotFoundException  e) {
			
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		
		

	}

	}


