import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Connection con=MyConnection.getConnection();
		String sqlInsert="insert into user values(?,?)";
		PreparedStatement pst=con.prepareCall(sqlInsert);
		System.out.println("Enter number of rows:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<2;j++) {
				try {
			System.out.print("Enter the Firstname:");
			String firstname=sc.next();
			System.out.print("Enter the Lastname:");
			String lastname=sc.next();
			pst.setString(j, firstname);
			pst.setString(j+1, lastname);
			System.out.println("row Inserted");
				}catch (Exception e) {
					System.out.println(pst.execute());
				}
			

		
	}
			pst.clearParameters();
}
		ResultSet rs=pst.executeQuery("select * from user");
		while(rs.next()) {
			System.out.println(rs.getString("firstname")+"\t"+rs.getString("lastname"));
		}
		sc.close();
	}
}
