package dbms_practice.health_clinic_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection{
	public static final String URL="jdbc:mysql://localhost:3306/hospital_db";
	public static final String USERNAME="root";
	public static final String PASSWORD="root123";
	
	public static Connection getConnection() {
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Database connected Successfully");
		}catch(ClassNotFoundException e) {
			System.out.println("mysql JDBC driver not found");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return connection;
	}
	public static void main(String[] args) {
		Connection conn=getConnection();
		if(conn!=null) {
			try {
				conn.close();
				System.out.println("Connection closed");
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}