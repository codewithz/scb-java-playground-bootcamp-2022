package com.sc.jdbc;

import java.sql.*; //Step 1

public class JDBCBoilerPlate {
	
	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/scb-rpg-2022";
		String username="postgres";
		String password="admin";
		
		Connection con=null;
		
		try {
			
			Class.forName("org.postgresql.Driver"); //Step 2
			System.out.println("Driver Loaded Successfully!!");
			
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established Successfully");
			
			String query="";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
//			Prepared Statements setter
			
//			Execution of the query
			
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
