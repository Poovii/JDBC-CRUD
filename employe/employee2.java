package com.employe;

import java.sql.*;

public class employee2 {

	public static void main(String[] args) {
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","Moorthy@8900");
			Statement st=con.createStatement();
			//add row
			int n=st.executeUpdate("insert into employee(id,name,salary) values(001,'Poovi',5000)");
			int n1=st.executeUpdate("insert into employee(id,name,salary) values(002,'Theju',6000)");
			int n2=st.executeUpdate("insert into employee(id,name,salary) values(003,'Dhana',7000)");
			int n3=st.executeUpdate("insert into employee(id,name,salary) values(004,'Akila',8000)");
			
			
			//System.out.println("rows added successfully....");
			//resultSet=it loaded the records
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Table exits...");
		}
	}

}
