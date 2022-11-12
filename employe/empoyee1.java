package com.employe;

import java.sql.*;


public class empoyee1 {
	public static void main(String[] args) {
		try {
	
			//connecting database
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","Moorthy@8900");
			System.out.println("connection established");
			//create statement for execute the records and it load to deliver
			Statement st=con.createStatement();
			//create table
         String q = "CREATE TABLE employee("
			+"ID INT(20),"
			+"NAME VARCHAR (20), " 
			+"SALARY DECIMAL (50), " 
			+"PRIMARY KEY (ID))";
      
	         st.executeUpdate(q);
	         System.out.println("The table is created");

	        
		}
			
			
		
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
		

