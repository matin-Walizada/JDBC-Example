package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnectionExameple {

	public static void main(String[] args) throws SQLException {
		// connecting to database
		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xai", "root", "1989");

		// we need a statment to do Crud opration

		Statement myStatment = myConnection.createStatement();
		// CRUD
		
		  //insert script 
		  String insertScript =  "insert into xai.student(id, firstName, lastName, age) VALUES('5', 'Suhila', 'Rahi', '25')"
		  ; // statement is for excutiing our script to the database //
		  myStatment.execute(insertScript);
		  System.out.println("record inserted to the database");
		 

		// select script

	// UPDATE Query
		
	/*
	 * String updateQery =
	 * "update student set firstName = 'Wahid', lastName = 'Safir'   where id = 3";
	 * myStatment.execute(updateQery);
	 * 
	 * System.out.println("the record updated");
	 */
		
		
		
	/*
	 * String deleteQuery = "delete from student where id = 4";
	 * myStatment.execute(deleteQuery); System.out.println("the record deleted");
	 */
			
		
		// Select QUERY
		String selectScript = "select id, firstName, lastName, age from student";

		ResultSet myResult = myStatment.executeQuery(selectScript);

		while (myResult.next()) {

			int id = myResult.getInt("id");
			String firstName = myResult.getString("firstName");
			String lastName = myResult.getString("lastName");
			String age = myResult.getString("age");

			System.out.println("ID: " + id + " First Name : " + firstName + " Last Name: " + lastName + " AGE: " + age);
		}
		
		
	
		

	}

}
