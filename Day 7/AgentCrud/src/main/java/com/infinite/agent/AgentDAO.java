package com.infinite.agent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgentDAO {

	Connection connection;
	PreparedStatement pst;
	
	
	public String addAgent(Agent agent) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Agent(Name, City, gender, MaritalStatus, Premium) "
				+ " values(?, ?, ?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, agent.getName());
		pst.setString(2, agent.getCity());
		pst.setString(3, agent.getGender().toString());
		pst.setInt(4, agent.getMaritalStatus());
		pst.setDouble(5, agent.getPremium());
		pst.executeUpdate();
		return "Records Updated " ;
	}

} 
