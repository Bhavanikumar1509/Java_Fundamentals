import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class resultSetMetadata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=MyConnection2.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		ResultSetMetaData rsmetadata=rs.getMetaData();
		System.out.println(rsmetadata.getColumnCount());
		System.out.println("_______ResultMetaData________");
		for(int i=1;i<=rsmetadata.getColumnCount();i++) {
			System.out.println(rsmetadata.getColumnName(i)+""+rsmetadata.getColumnTypeName(i));
		}
		System.out.println("_________Database MetaData___");
		DatabaseMetaData meta=con.getMetaData();
		System.out.println(meta.getDriverMajorVersion());
		ResultSet rs1=meta.getCatalogs();
		while(rs1.next())
			System.out.println(rs1.getString(1));
		
		
		
	}

}
