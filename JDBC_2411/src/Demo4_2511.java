import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/*Callable Statement*/
public class Demo4_2511 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MyConnection2.getConnection();
		CallableStatement callable=con.prepareCall("{call getGrade(?,?,?) }");
		callable.setInt(1, 2);
		callable.setInt(2, 103);
		callable.registerOutParameter(3, java.sql.Types.VARCHAR);
		callable.executeUpdate();
		String holderType=callable.getString(3);
		System.out.println(holderType);
		
		
	}
}
