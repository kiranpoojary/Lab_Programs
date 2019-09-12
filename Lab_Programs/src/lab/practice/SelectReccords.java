/**
 * 
 */
package lab.practice;

import java.sql.*;

/**
 * @author KIRAN
 *
 */
public class SelectReccords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String dburl = "jdbc:mysql://localhost/devicemanagement";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(dburl,"root","");
			String q="select * from users where userid=?";
			PreparedStatement preparedStatement=connection.prepareStatement(q);
			preparedStatement.setString(1, "kiran123");
			ResultSet rs=preparedStatement.executeQuery(q);
			while (rs.next()) {
				System.out.println(rs.getString("userid"));
				System.out.println(rs.getString("password"));
				
			}
/*ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				System.out.println(resultSet.getString("email"));
			}
			*/
			
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
