package com.example.oop.employeeDb;

import java.sql.*;

public class EmployeeDb {
static Connection conn=null;
public static Connection connect() {
	try {
		String url ="jdbc:mysql://localhost:3306/";
		String db = "mydb";
		String userName = "root";
		String password = "Pass123";
//			Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn 
		=DriverManager.getConnection(url+db,userName,password);
			
	}
	catch(Exception e) {
		e.printStackTrace();
	}
return conn;	
}


}
