package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		int rowaAffected;
		try {
			//Establish connect object
			Connection connection = DriverManager.getConnection(url, "root", "Vivek@1234");
			
			//Create a statement object to send to the database
			Statement statement  = connection.createStatement();
			
			//Execute the statement
			String query = "select * from employees_tbl";
			ResultSet result =  statement.executeQuery(query);
			
			//process the result
			int totalSalary = 0;
			while(result.next()) {
				totalSalary = totalSalary + result.getInt("salary");
				
			}
			
			System.out.println(totalSalary);
			
			//Updating the tabel with a value
			String queryToUpdate = "insert into employees_tbl (id, name, dept, salary) values (00010, 'Ganesh', 'Textile', '75000')";
			rowaAffected = statement.executeUpdate(queryToUpdate);
			System.out.println("Executed an insert in employee table - Rows Affected " + rowaAffected);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
