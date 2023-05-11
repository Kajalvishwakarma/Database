package m1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Register {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsc","root","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from register");
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "
		+rs.getInt(5)+" "+rs.getInt(6));
			//System.out.println(rs.getString(2));
		}
		con.close();
	}
}
