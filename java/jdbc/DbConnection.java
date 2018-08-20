package jdbc;
import java.sql.*;

public class DbConnection {
	private String db_url = "jdbc:mysql://localhost:3306/PROYECTO";
	private String user = "root";
	private String pass = "root";
	private Connection conn;
	private Statement stmnt;
	private ResultSet result;

	public DbConnection() {
		try {
			this.conn = DriverManager.getConnection(this.db_url, this.user, this.pass);
	                this.stmnt = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void executeQuery(String query) {
		try {
			this.result = stmnt.executeQuery(query);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ResultSet getResult () {
		return this.result;
	}
}
