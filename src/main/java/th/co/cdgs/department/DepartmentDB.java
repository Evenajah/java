package th.co.cdgs.department;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DepartmentDB {

	Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";

		return DriverManager.getConnection(url, username, password);
	}

	public Object getDepartmentByCode(String string) {

		return null;
	}

	public Object getDepartments() throws SQLException {
		try (Connection con = getConnection(); Statement statement = con.createStatement()) {
			String query = "SELECT * FROM department";
			 ResultSet result = statement.executeQuery(query);
			
			  while (result.next())
		      {
				  
		        int department_code = result.getInt("department_code");
		        String department_name = result.getString("department_name");
		        String status = result.getString("status");
		        String province = result.getString("province");
		        int budget = result.getInt("budget");
		        int telephone = result.getInt("telephone");
		        int remark = result.getInt("remark");
		        
		       
		      }

		} catch (SQLException e) {
			System.out.print(e);
		}
		return null;
	}

	public void insertDepartment(Department department) {
		// TODO Auto-generated method stub

	}

	public Object updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

}
