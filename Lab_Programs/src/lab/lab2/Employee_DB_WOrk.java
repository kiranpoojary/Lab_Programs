package lab.lab2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author mcastudent
 *
 */
public class Employee_DB_WOrk {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		String dburl="jdbc:mysql://localhost:3306/lab";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(dburl,"root","");
			String query="SELECT * FROM Employee";
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				System.out.println("Employee ID      :"+rs.getString(1));
				System.out.println("Employee FNAME   :"+rs.getString(2));
				System.out.println("Employee LNAME   :"+rs.getString(3));
				System.out.println("Employee Dept.   :"+rs.getString(4));
				System.out.println("Employee Salary  :"+rs.getString(5));
				System.out.println();
				System.out.println();
			}
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
