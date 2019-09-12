package lab.lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author mcastudent
 *
 */
public class Employee_Delete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		String dburl="jdbc:mysql://localhost:3306/lab";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(dburl,"root","");
			String q="DELETE FROM Employee WHERE EmpID=002";
			Statement st=con.createStatement();
			int deletedcount=st.executeUpdate(q);
			if(deletedcount>0)
			{
				System.out.println("Record Deleted");
				
			}
			else
				System.out.println("Record Not Deleted");
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}