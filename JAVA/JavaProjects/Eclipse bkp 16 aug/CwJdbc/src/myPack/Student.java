package myPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

public void CreateDatabase(){
	
	
	//10004985433

	}

public void CreateTable() {
	// TODO Auto-generated method stub
	
	
	
	try {
//		1 Driver load //no need to take the load after 4.0
	
//	2 Connection establish
		String url ="jdbc:mysql://localhost:3306/";
		String db = "mydb";
		String userName = "root";
		String password = "Pass123";
//		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn =DriverManager.getConnection(url+db,userName,password);
		
//		3 Statement Create
		Statement stm= conn.createStatement();
//		System.out.println("Connection Successful");
//		String query = (" Create database CWstudent");
//		String query = ("Create table cwstudent(sid int not null auto_increment,sname varchar(100),semail varchar(100),PRIMARY KEY (sid))");
		String query = ("Create table nayatable(sid int not null ,sname varchar(100),semail varchar(100))");


//		4 Exec Query
		stm.execute(query);
//		
//		5 Close connection
		
		conn.close();

		
		
		

		
}
catch(Exception e)
{
	e.printStackTrace();
}

}

public void CreateData() {
	// TODO Auto-generated method stub
	
try {
//1 Driver load //no need to take the load after 4.0

//2 Connection establish
String url ="jdbc:mysql://localhost:3306/";
String db = "mydb";
String userName = "root";
String password = "Pass123";
//Class.forName("com.mysql.jdbc.Driver");

Connection conn =DriverManager.getConnection(url+db,userName,password);

//3 Statement Create
//Statement stm= conn.createStatement();
//System.out.println("Connection Successful");
//String query = (" Create database CWstudent");
//String query = ("Create table cwstudent(sid int not null auto_increment,sname varchar(100),semail varchar(100),PRIMARY KEY (sid))");

//String query = "Insert into cwstudent VALUES (2,'ironbhai','naughtyhumai@hotmail.com')";

String query = "Insert into nayatable(sid,sname,semail) VALUES (?,?,?) ";
//Now using the prepared statement to write the query

PreparedStatement pstm= conn.prepareStatement(query); /* Basically an interface*/

pstm.setInt(1, 12);
pstm.setString(2, "babuji");
pstm.setString(3,"baburocks@gmail.com");
pstm.executeUpdate();
//4 Exec Query
//stm.execute(query);
System.out.println("Data insertion succesfull");


//5 Close connection

conn.close();


}

catch
(Exception e) {
	e.printStackTrace();
	}
////
////
////
}

public void ReadData() {
	// TODO Auto-generated method stub

	// TODO Auto-generated method stub
	
try {
//1 Driver load //no need to take the load after 4.0

//2 Connection establish
String url ="jdbc:mysql://localhost:3306/";
String db = "mydb";
String userName = "root";
String password = "Pass123";
//Class.forName("com.mysql.jdbc.Driver");

Connection conn =DriverManager.getConnection(url+db,userName,password);

String query = "select * from nayatable";
//Now using the prepared statement to write the query

Statement stm = conn.createStatement();
ResultSet rs = stm.executeQuery(query);
while(rs.next()) {
	System.out.println("id = "+rs.getInt(1));
	System.out.println("name = "+rs.getString(2));
	System.out.println("email = "+rs.getString(3));

// READ GIVING issues due to simple silly mistake
	
}
stm.execute(query);
//PreparedStatement pstm= conn.prepareStatement(query); /* Basically an interface*/

//pstm.setInt(1, 12);
//pstm.setString(2, "newnayahai");
//pstm.setString(3,"try2@gmail.com");
//pstm.executeUpdate();
//4 Exec Query
//stm.execute(query);
System.out.println("Data read succesfull");

//Now there are some extra steps we need to follow to show the data..
/* getters and setters
*/




//5 Close connection

conn.close();


}

catch
(Exception e) {
	e.printStackTrace();
	}
//
//
//

}

public void UpdateData() {

	// TODO Auto-generated method stub
	
try {
//1 Driver load //no need to take the load after 4.0

//2 Connection establish
String url ="jdbc:mysql://localhost:3306/";
String db = "mydb";
String userName = "root";
String password = "Pass123";
//Class.forName("com.mysql.jdbc.Driver");

Connection conn =DriverManager.getConnection(url+db,userName,password);

//3 Statement Create
//Statement stm= conn.createStatement();
//System.out.println("Connection Successful");
//String query = (" Create database CWstudent");
//String query = ("Create table cwstudent(sid int not null auto_increment,sname varchar(100),semail varchar(100),PRIMARY KEY (sid))");

//String query = "Insert into cwstudent VALUES (2,'ironbhai','naughtyhumai@hotmail.com')";

String query = "UPDATE nayatable set sid=? WHERE (sname=? AND semail=?)";
//Now using the prepared statement to write the query

PreparedStatement pstm= conn.prepareStatement(query); /* Basically an interface*/




pstm.setInt(1, 99);
pstm.setString(2, "babuji");
pstm.setString(3,"baburocks@gmail.com");
pstm.executeUpdate();
//4 Exec Query
//stm.execute(query);
System.out.println("Data Update succesfull");


//5 Close connection

conn.close();


}

catch
(Exception e) {
	e.printStackTrace();
	}
////
////
////

}

public void DeleteData() {


	// TODO Auto-generated method stub
	
try {
//1 Driver load //no need to take the load after 4.0

//2 Connection establish
String url ="jdbc:mysql://localhost:3306/";
String db = "mydb";
String userName = "root";
String password = "Pass123";
//Class.forName("com.mysql.jdbc.Driver");

Connection conn =DriverManager.getConnection(url+db,userName,password);

//3 Statement Create
//Statement stm= conn.createStatement();
//System.out.println("Connection Successful");
//String query = (" Create database CWstudent");
//String query = ("Create table cwstudent(sid int not null auto_increment,sname varchar(100),semail varchar(100),PRIMARY KEY (sid))");

//String query = "Insert into cwstudent VALUES (2,'ironbhai','naughtyhumai@hotmail.com')";

String query = "DELETE FROM nayatable WHERE sid=99 ";
//Now using the prepared statement to write the query

PreparedStatement pstm= conn.prepareStatement(query); /* Basically an interface*/



//
//pstm.setInt(1, 99);
//pstm.setString(2, "babuji");
//pstm.setString(3,"baburocks@gmail.com");
pstm.executeUpdate();
//4 Exec Query
//stm.execute(query);
System.out.println("Data DELETE successfull");


//5 Close connection

conn.close();


}

catch
(Exception e) {
	e.printStackTrace();
	}
////
////
////

	
}

	
}

	

