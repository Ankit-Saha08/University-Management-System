package umsSPEC;

import java.sql.*;

public class ConnectDB {

	static Connection Con = null;
	public static Connection dbConnector()throws SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");  //registering JDBC driver for MySQL
			Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums_db","root",""); //connecting with DB setup on localhost xampp server
			return Con;
		}
		catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
