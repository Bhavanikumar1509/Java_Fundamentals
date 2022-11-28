import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class MyConnection2 {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Username:");
		String username=sc.nextLine();
		System.out.print("Enter the Database Name:");
		String database=sc.nextLine();
		Connection con=DriverManager.getConnection(url.concat(database),username,"897834");
		return con;

}
}