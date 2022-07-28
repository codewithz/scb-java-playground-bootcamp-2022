package com.sc.jdbc;

import java.sql.*; //Step 1

public class SelectCustomer {
	
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
			
			String query="Select name,email,contact,account_type,account_creation_date from customer";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			

			
//			Execution of the query
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String name=rs.getString("name");
				String email=rs.getString("email");
				long contact=rs.getLong("contact");
				String accountType=rs.getString("account_type");
				String date=rs.getString("account_creation_date");
				
				System.out.println("Name : "+name+" | Email : "+email+" | Contact: "+contact+" | Acc Type: "+accountType+" | Creation Date: "+date);
			}
			
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
