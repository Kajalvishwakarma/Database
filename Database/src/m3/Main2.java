package m3;
import m2.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import m1.*;
public class Main2 extends Register implements Main {

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		String a = "insert into register values(?,?)";
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsc","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement ps = con.prepareStatement(a);
			ps.setString(1, "ABc");
			ps.setString(2, "Bad");
			ps.setString(3, "ABc");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
//		ResultSet rs;
//		Connection con;
//		Statement st;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsc","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Statement st;
			Connection con = null;
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Statement st = null;
			ResultSet rs;
			rs = st.executeQuery("select * from register");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ResultSet rs1 = null;
			while(rs1.next()) {
				System.out.println(rs1.getString(1)+" "+rs1.getInt(2)+" "+rs1.getString(3)+" "+rs1.getInt(4)+" "
			+rs1.getInt(5)+" "+rs1.getInt(6));
				//System.out.println(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = null;
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

}
