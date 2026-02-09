package dbms_practice.health_clinic_app;
import java.sql.*;

public class PatientDAO {
	public static void registerPatient(String name,String dob, String phone,String email,String address,String bloodGroup) {
		Connection conn=null;
		PreparedStatement checkstmt=null;
		PreparedStatement insertStmt = null;
		ResultSet rs = null;
		
		try {
			conn=DatabaseConnection.getConnection();
			String checkQuery="SELECT patient_id from patients WHERE phone=? or email=?";
			checkstmt=conn.prepareStatement(checkQuery);
			checkstmt.setString(1, phone);
			checkstmt.setString(2, email);
			
			rs=checkstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("Patient already exist with this phone/email");
			}else {
				String insertQuery="INSERT INTO patients (name, dob, phone, email, address, blood_group)"+"VALUES(?,?,?,?,?,?)";
				insertStmt=conn.prepareStatement(insertQuery);
				insertStmt.setString(1, name);
	            insertStmt.setString(2, dob);
	            insertStmt.setString(3, phone);
	            insertStmt.setString(4, email);
	            insertStmt.setString(5, address);
	            insertStmt.setString(6, bloodGroup);
	            
	            int rowInserted=insertStmt.executeUpdate();
	            
	            if(rowInserted>0) {
	            	System.out.println("Patient registered successfully");
	            }
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
            try {
                if (rs != null) rs.close();
                if (checkstmt != null) checkstmt.close();
                if (insertStmt != null) insertStmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
	
	}
	public static void main(String[] args) {
        registerPatient(
                "Rahul Sharma",
                "1999-05-15",
                "9876543210",
                "rahul@gmail.com",
                "Delhi",
                "O+"
        );
    }
}
