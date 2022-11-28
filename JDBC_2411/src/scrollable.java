import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class scrollable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MyConnection2.getConnection();
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select * from user");
		while(rs.next()) {
			System.out.println(rs.getString(1)+""+rs.getString(2));
		}
		while(rs.previous()) {
			System.out.println(rs.getString(2));
		}
		System.out.println(rs.absolute(3));
		
		
	}

}

