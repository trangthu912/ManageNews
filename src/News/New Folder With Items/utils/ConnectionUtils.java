package News.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtils {
	public static Connection getMyConnection() throws ClassNotFoundException, SQLException {
		String hostName = "127.0.0.1";
		String dbName = "news";
		String userName = "root";
		String passWord = "trang912";
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?serverTimezone=UTC";
		Connection conn = DriverManager.getConnection(connectionURL, userName,passWord);
		
		return conn;
		
	}
	
//	public static void main (String args[]) throws ClassNotFoundException {
//		Connection conn = null;
//		try {
//			conn = getMyConnection();
////			String sql = "Select * from news";
////			Statement statement = conn.createStatement();
////			ResultSet rs = statement.executeQuery(sql);  				// nếu là trả về gt thì statement.executeQuery() còn khi sửa hay cập nhật thì là statement.executeUpdate()
////			while (rs.next()) {
////				int id = rs.getInt("id");
////				String name = rs.getString("name");
////				System.out.println( " id : " + id);
////			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		System.out.println ("connection successful" + conn);
//		
//	}
			
	
	

}
