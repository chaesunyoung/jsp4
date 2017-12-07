package com.test.jsp.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class ListExam {

	public ArrayList<HashMap<String,String>> getUserList(){
		ArrayList<HashMap<String,String>> al= 
				new ArrayList<HashMap<String,String>>();
		DBCon dbCon = new DBCon();
		try {
			Connection con = dbCon.getConnection();
			String sql = "select * from user_info ui," + 
					" depart_info di" + 
					" where ui.dino = di.dino";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				HashMap<String, String> hm  = new HashMap<String,String>();
				hm.put("userno", rs.getString("userno"));
				hm.put("username", rs.getString("username"));
				hm.put("userid", rs.getString("userid"));
				hm.put("userpwd", rs.getString("userpwd"));
				hm.put("userage", rs.getString("userage"));
				hm.put("dino", rs.getString("dino"));
				hm.put("useraddress", rs.getString("useraddress"));
				hm.put("diname", rs.getString("diname"));
				hm.put("dietc", rs.getString("dietc"));
				al.add(hm);
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
		return al;
	}
	public static void main(String[] args) {
		ListExam le = new ListExam();
		ArrayList<HashMap<String,String>> strs 
		= le.getUserList();
		for(HashMap<String,String> hm : strs) {
			System.out.println(hm);
		}
	}
}
