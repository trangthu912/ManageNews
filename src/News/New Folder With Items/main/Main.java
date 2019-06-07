package News.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import News.dao.NewsDAO;
import News.idao.*;
import News.utils.ConnectionUtils;

public class Main {
	public static void main (String [] args) throws ClassNotFoundException, SQLException  {
//		Connection conn = null;
//		try {
//			conn = ConnectionUtils.getMyConnection();					//Vì là hàm của class nên chỉ cần lấy tên_class.hàm() là đã gọi được ham
//			Statement statement = conn.createStatement();				//Vì chỉ cần hàm main để hắn chạy kết nối nên chỉ cần vậy
			
		
		NewsDAO.menu();
			
			
			
			
			
			
			
			
			
			
//			String sql = "Select * from news";							
//			Statement statement = conn.createStatement();
//			ResultSet rs = statement.executeQuery(sql);  				// nếu là trả về gt thì statement.executeQuery() còn khi sửa hay cập nhật thì là statement.executeUpdate()
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				System.out.println( " id : " + id);
//			}
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//		System.out.println ("connection successful" + conn);
		
	}
			


}
