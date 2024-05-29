package emplloyee_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class complete {
	
	
	public static Connection connection() {
		
		Connection c=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/postgres";
			String user="postgres";
			String pass="sOny@2003";
			 c=DriverManager.getConnection(url, user, pass);
		
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return c;
	}
		
		
		public static void insertTeacher()
		{
			
			try {
				Connection con=connection();
				Statement stmt=con.createStatement();
				String query="insert into employee values(12,'kirthan','AIML')";
				int i=stmt.executeUpdate(query);
				System.out.println(i);
				System.out.println("inserted sucessfullly !");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	public static void deleteTeacher() {
		
		try {
			Connection con=connection();
			Statement stmt=con.createStatement();
			String query="delete from employee where id=1";
			stmt.executeUpdate(query);
			System.out.println("deleteed successfullly");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String args[])
	{
		
		insertTeacher();
		System.out.println("=====================================");
		deleteTeacher();	
	}
		
		}
		
	
        