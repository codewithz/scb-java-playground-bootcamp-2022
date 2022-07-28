package com.sc.jdbc;

import java.sql.*; //Step 1
import java.time.LocalDate;

public class UpdateCustomer {
	
	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/scb-rpg-2022";
		String username="postgres";
		String password="admin";
		
		String name="Zartab Nakhwa";
		int id=1;
		
		
		Connection con=null;
		
		try {
			
			Class.forName("org.postgresql.Driver"); //Step 2
			System.out.println("Driver Loaded Successfully!!");
			
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established Successfully");
			
			String query="Update customer set name=? where id=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			
			
			
//			Execution of the query
			
			int rowUpdated=pstmt.executeUpdate();
			
			System.out.println("No. of Rows Updated: "+rowUpdated);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
