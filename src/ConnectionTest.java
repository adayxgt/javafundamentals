import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author [Manolo Peng] Sep 4, 2025
 */
public class ConnectionTest {

	//DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename", "username", "Password20182")

	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	static final String USER_NAME = "jose";
	static final String PSW = "jose";
	
	public static void main(String[] args) throws SQLException{
		try (Connection conn = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "jose",
				"jose")) {
			System.out.println(conn);
		}
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "jose",
			"jose");
			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
