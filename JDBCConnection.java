package dailytasks;

import java.sql.*;
import java.sql.DriverManager;


public class JDBCConnection {

	public static void main(String []args)
	{
		
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:sqlserver://192.168.168.12:1443;databaseName=New_joinee_2022","New_joinee_2022","P@ssw0rd");
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery("select * from Praveen_Emp");
		
		while(rs.next())
		{
			System.out.print("ID: "+ rs.getInt("Id"));
			System.out.print(",FirstName: "+ rs.getString("Frist_name"));
			System.out.print(",LastName: "+ rs.getString("Last_name"));
			System.out.print(",Salary: "+ rs.getString("Salary"));
			System.out.print(",DepartmentId: "+ rs.getString("Department_id"));
			System.out.print(",YearOfJoining: "+ rs.getString("Year_of_joining"));
			System.out.println(",YearOfRelieving: "+ rs.getString("Year_of_Relieving"));
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}}
