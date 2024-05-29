package emplloyee_database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class demo1 {
	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String pass = "sOny@2003";

			// make a connection with database

			Connection c = DriverManager.getConnection(url, username, pass);
			
			//create a statement using method==> createstatement()
			
			Statement s = c.createStatement();
			String query = "insert into employee values(23,'sharath','cse')";
			int i = s.executeUpdate(query);

			System.out.println(i);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
