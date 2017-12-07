package com.test.jsp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class DBCon {
	Connection con = null;
	
	public Connection getConnection() throws 
	SQLException, ClassNotFoundException {
		if(con!=null) {
			return con;
		}
		String url = "jdbc:mysql://localhost:3306/jsp4";
		String id = "root";
		String pwd = "r1r2r3";
		Class.forName("org.mariadb.jdbc.Driver");
		con = DriverManager.getConnection(url,id,pwd);
		return con;
	}
	
	public void closeCon() throws SQLException {
		if(con!=null) {
			con.close();
			con = null;
		}
	}
	public static void main(String[] args) {
		DBCon dbCon = new DBCon();
		try {
			Connection con = dbCon.getConnection();
			String sql = "select * from user_info ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ArrayList<HashMap<String,String>> al= 
					new ArrayList<HashMap<String,String>>();
			
			while(rs.next()) {
				HashMap<String, String> hm  = new HashMap<String,String>();
				hm.put("userno", rs.getString("userno"));
				hm.put("username", rs.getString("username"));
				hm.put("userid", rs.getString("userid"));
				hm.put("userpwd", rs.getString("userpwd"));
				hm.put("userage", rs.getString("userage"));
				hm.put("dino", rs.getString("dino"));
				hm.put("useraddress", rs.getString("useraddress"));
				al.add(hm);
			}
			for(HashMap<String,String> h : al) {
				System.out.println(h);
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			try {
				dbCon.closeCon();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
