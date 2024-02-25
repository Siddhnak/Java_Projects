package com.example.oop.employeeController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.oop.employeeDb.EmployeeDb;
import com.example.oop.employeeDb.Query;
import com.example.oop.model.Employee;


public class EmployeeDAOIm {


public void save(Employee employee) throws SQLException {
	
		Connection conn = EmployeeDb.connect();
		String qry= Query.insert();
		PreparedStatement pstmt = conn.prepareStatement(qry);
		pstmt.setString(1,employee.getEmpname());
		pstmt.setInt(2,employee.getSalary());
		pstmt.setInt(3,employee.getPhone());
		pstmt.executeUpdate();
		

}
}