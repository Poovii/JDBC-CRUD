package com.employe;
import java.sql.*;

public class employee4 {

	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","Moorthy@8900");
			Statement st=con.createStatement();
			st.execute("delete from employee where id=003");
			System.out.println("Deleted Successsfuly...");
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
