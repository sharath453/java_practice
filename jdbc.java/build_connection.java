package emplloyee_database;

import java.sql.Connection;
import java.sql.DriverManager;

public class conneection {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String pass = "sOny@2003";

			// we have a method to make connection is==>DriverManager.getconnection();
			// pass the parameters url, username, password

			Connection c = DriverManager.getConnection(url, username, pass);
			System.out.println("connection established successfully !");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
