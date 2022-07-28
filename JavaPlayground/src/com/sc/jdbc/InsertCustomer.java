package com.sc.jdbc;

import java.sql.*; //Step 1
import java.time.LocalDate;

public class InsertCustomer {
	
	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/scb-rpg-2022";
		String username="postgres";
		String password="admin";
		
		String name="Mike";
		String email="mike@gmail.com";
		String accountType="Current";
		long contact=9988776657l;
		LocalDate date=LocalDate.now();
		
		
		Connection con=null;
		
		try {
			
			Class.forName("org.postgresql.Driver"); //Step 2
			System.out.println("Driver Loaded Successfully!!");
			
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established Successfully");
			
			String query="Insert into customer(name,email,contact,account_type,account_creation_date) values (?,?,?,?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setLong(3, contact);
			pstmt.setString(4, accountType);
			pstmt.setObject(5, date);
			
			System.out.println(date.toString());
			
//			Execution of the query
			
			int rowInserted=pstmt.executeUpdate();
			
			System.out.println("No. of Rows Inserted: "+rowInserted);
			
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
