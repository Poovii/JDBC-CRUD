package com.employe;
import java.sql.*;

public class employee3 {

	public static void main(String[] args) {
		try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","Moorthy@8900");
		Statement st=con.createStatement();
		String q="update employee set name='Amit' where id=002";
		int n=st.executeUpdate(q);
		
				System.out.println(n+"updated successfully....");
				ResultSet rs=st.executeQuery("select * from employee where id=002");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		}
		
		
	}
		catch(Exception e) {
			System.out.println(e.toString());
		}

}
}