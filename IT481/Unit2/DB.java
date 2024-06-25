import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private Connection conn = null;
	private String dbURL;
	public DB() {
		dbURL = "jdbc:sqlserver://localhost\\SQLEXPRESS;"+
				"Trusted_Connection=true;"+
				"Database=northwind;"+
				"integratedSecurity=true;"+
				"User Instance=false;"+
				"trustServerCertificate=True;"+
				"Connection timeout=30";
	}
	public DB(String pConnectionString) {
		dbURL = pConnectionString;
	}
	public String getCustomerCount() {
	String count = null;
	try {
		conn = DriverManager.getConnection(dbURL);
		
		if (conn != null) {
			String countQuery = "SELECT COUNT(*) AS count FROM customers;";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(countQuery);
			while(rs.next()) {
				count = rs.getString("count");
			}
		}
	} catch (SQLException ex) {
		ex.printStackTrace();
	} finally {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	return count;
	}
	public String getCompanyNames() {
		String result = "";
		try {
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				String countQuery = "SELECT companyname FROM customers;";
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(countQuery);
				while (rs.next()) {
					result += rs.getString("companyname");
					result += "\n";
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try{
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

}
