package com.student;

import java.sql.Connection;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class addstudentDButil {
	   private static boolean isSuccess;
	   private static Connection con =null;
	   private static Statement stmt =null;
	   private static ResultSet rs =null;
	
public static boolean Insertstudent( String Name,String Email,String ClassName,String NIC,String Address,String DOB,String Gender) {
		
		boolean isSuccess = false;
		
		
		try {
		
			con=DBconnect.getConnection();
			stmt =con.createStatement();
			
			
			String sql = "insert into student values (0,''"+Name+"','"+Email+"','"+ClassName+"','"+NIC+"','"+Address+"','"+DOB+"','"+Gender+"');";
		

			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
		
	}



public static boolean updatestudent(String id, String Name,String Email,String ClassName,String NIC,String Address,String DOB,String Gender) {
	
	
	//boolean isSuccess = false;
	try {
		
		con = DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "update student set Name='"+Name+"',Email='"+Email+"',ClassName='"+ClassName+"',NIC='"+NIC+"',Address='"+Address+"',DOB='"+DOB+"'Gender='"+Gender+"'"
				+ "where id='"+id+"'";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}
public static List<student> getstudentdetails(String Id) {

int convertedID = Integer.parseInt(Id);
ArrayList<student> stu = new ArrayList<>();

try {
	
	con = DBconnect.getConnection();
	stmt = con.createStatement();
	String sql = "select * from student where id='"+convertedID+"'";
	rs = stmt.executeQuery(sql);
	
	while (rs.next()) {
		int id= rs.getInt(1);
		String Name = rs.getString(2);
		String Email = rs.getString(3);
		String ClassName = rs.getString(4);
		String NIC= rs.getString(5);
		String Address= rs.getString(6);
		String DOB= rs.getString(7);
		String Gender= rs.getString(8);
		
		
		student s = new student(id,Name,Email,ClassName,NIC,Address,DOB,Gender);
		stu.add(s);
	}
	
} catch (Exception e) {
	
}

return stu;	
}
public static boolean deletestudent(String id) {
	
	int convId = Integer.parseInt(id);
	
	//boolean isSuccess = false;
	try {
		
		con = DBconnect.getConnection();
		stmt = con.createStatement();
		String sql = "delete from student where id='"+convId+"'";
		int r = stmt.executeUpdate(sql);
		
		if (r > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}



























}


	

