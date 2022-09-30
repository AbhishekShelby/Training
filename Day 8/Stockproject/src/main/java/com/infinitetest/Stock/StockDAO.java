package com.infinitetest.Stock;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StockDAO {
	Connection connection ;
	PreparedStatement pst;
	
	public String generateStockId() throws ClassNotFoundException, SQLException {
		String cmd ="select max(stockId) sid from Stock";
		connection = ConnectionHelper.getConnnection();
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String stockId=rs.getString("sid");
		int id=Integer.parseInt(stockId.substring(1));
		id++;
		stockId=String.format("S%03d", id);
		return stockId;
	}
	
//	public Stock createStockid(String Stockid )throws ClassNotFoundException, SQLException {
//		String Stockid   = generateStockid ();
//		String cmd = " insert into Stock(Stockid , ItemName, "
//				+ "Price,  QuantityAvail "
//				+ " values(?,?,?,?)";
//		connection = ConnectionHelper.getConnnection();
//		pst = connection.prepareStatement(cmd);
//		pst.setString(2, Stock.getStockid());
//		pst.setString(3,Stock.getItemName());
//		pst.setDouble(4, Stock.getPrice());
//		pst.setInt(5, Stock.QuantityAvailget());
//		
//	}
	

}
