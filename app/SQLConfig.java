import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import play.Play;


public class SQLConfig {

	private String URL = Play.application().configuration().getString("db.default.url");
	private String uname = Play.application().configuration().getString("db.default.user");
	private String password = Play.application().configuration().getString("db.default.password");
	
	
	public Connection getSQLConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,uname, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
